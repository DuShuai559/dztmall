package com.ds.dztmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.ds.dztmall.domain.OrderItem;
import com.ds.dztmall.domain.Orders;
import com.ds.dztmall.domain.ProductSku;
import com.ds.dztmall.domain.ShoppingCart;
import com.ds.dztmall.mapper.OrderItemMapper;
import com.ds.dztmall.mapper.OrdersMapper;
import com.ds.dztmall.mapper.ProductSkuMapper;
import com.ds.dztmall.mapper.ShoppingCartMapper;
import com.ds.dztmall.service.OrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.dztmall.utils.DateUtil;
import com.ds.dztmall.utils.RandomIDUtil;
import com.ds.dztmall.vo.ResponseStatus;
import com.ds.dztmall.vo.ReturnVO;
import com.ds.dztmall.vo.ShoppingCartVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 订单  服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

    @Resource
    private ShoppingCartMapper shoppingCartMapper;
    @Resource
    private OrdersMapper ordersMapper;
    @Resource
    private OrderItemMapper orderItemMapper;
    @Resource
    private ProductSkuMapper productSkuMapper;

    /**
     * 保存订单
     * @param cids  购买的购物车中的商品id，用于生成商品快照
     * @param orders  封装订单信息的对象
     * @return
     */
    @Transactional
    public ReturnVO addOrder(String cids, Orders orders){
        ReturnVO returnVO = null;
        // 根据cids查询所有购物车商品
        List<ShoppingCartVO> shoppingCartVOS = shoppingCartMapper.selectByCids(cids.split(","));
        // 查询所有商品
        boolean flag = true;
        String untitled = "";
        for(ShoppingCartVO shoppingCartVO:shoppingCartVOS){
            // 库存不足
            if (shoppingCartVO.getSkuStock() < shoppingCartVO.getCartNum()){
                flag = false;
            }
            untitled += shoppingCartVO.getProductName() + ",";
        }
        untitled = untitled.substring(0, untitled.length()-1);
        if (! flag){
            // 有商品库存不足，终止交易
            returnVO = new ReturnVO(ResponseStatus.FAIL, "库存不足", null);
        }else {
            try {

                // 添加订单
                orders.setOrderId(RandomIDUtil.getUUID());
                orders.setUntitled(untitled);
                orders.setStatus("1");
                orders.setCreateTime(LocalDateTime.now());
                int i = ordersMapper.insert(orders);
                if (i > 0){
                    // 订单添加成功，生成快照
                    List<OrderItem> orderItemList = new ArrayList<>();
                    for(ShoppingCartVO scVO:shoppingCartVOS){
                        OrderItem orderItem = new OrderItem(RandomIDUtil.getNumId(),orders.getOrderId(),scVO.getProductId(),
                                scVO.getProductName(),scVO.getUrl(),scVO.getSkuId(), scVO.getSkuProps(),
                                new BigDecimal(scVO.getSellPrice()),scVO.getCartNum(),
                                new BigDecimal(scVO.getSellPrice()*scVO.getCartNum()),
                                DateUtil.strToLocalDateTime(scVO.getCartTime()),orders.getCreateTime(),0);
                        orderItemList.add(orderItem);
                    }
                    int i1 = orderItemMapper.insertMore(orderItemList);

                    // 修改商品库存
                    for(ShoppingCartVO scVO:shoppingCartVOS){
                        ProductSku productSku = new ProductSku();
                        productSku.setStock(scVO.getSkuStock() - scVO.getCartNum());
                        UpdateWrapper updateWrapper = new UpdateWrapper();
                        updateWrapper.eq("sku_id",productSku.getSkuId());
                        int update = productSkuMapper.update(productSku, updateWrapper);
                    }

                    // 删除购物车
                    QueryWrapper<ShoppingCart> wrapper = new QueryWrapper<>();
                    wrapper.in("cart_id", Arrays.asList(cids.split(",")));
                    int i3 = shoppingCartMapper.delete(wrapper);
                }
                returnVO = new ReturnVO(ResponseStatus.SUCCESS, "添加成功", orders.getOrderId());
            }catch (Exception e){
                returnVO = new ReturnVO(ResponseStatus.FAIL, "添加失败", null);
            }
        }
        return returnVO;
    }
}
