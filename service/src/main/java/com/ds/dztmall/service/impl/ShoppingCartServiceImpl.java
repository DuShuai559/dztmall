package com.ds.dztmall.service.impl;

import com.ds.dztmall.domain.ShoppingCart;
import com.ds.dztmall.mapper.ShoppingCartMapper;
import com.ds.dztmall.service.ShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.dztmall.vo.ResponseStatus;
import com.ds.dztmall.vo.ReturnVO;
import com.ds.dztmall.vo.ShoppingCartVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 购物车  服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

    @Resource
    ShoppingCartMapper shoppingCartMapper;

    @Override
    public ReturnVO addShoppingCart(ShoppingCart shoppingCart) {
        int i = shoppingCartMapper.insert(shoppingCart);
        if (i > 0) {
            return new ReturnVO(ResponseStatus.SUCCESS, "success", null);
        }
        return null;
    }

    @Override
    public ReturnVO listShoppingCart(Integer userId) {
        List<ShoppingCartVO> shoppingCartVOS = shoppingCartMapper.selectShopCartByUserId(userId);
        return new ReturnVO(ResponseStatus.SUCCESS, "success", shoppingCartVOS);
    }

    @Override
    public ReturnVO updateCartNum(ShoppingCart shoppingCart) {
        int i = shoppingCartMapper.updateById(shoppingCart);
        if (i > 0) {
            return new ReturnVO(ResponseStatus.SUCCESS, "success", null);
        }
        return new ReturnVO(ResponseStatus.FAIL, "error", null);
    }

    @Override
    public ReturnVO delShopCart(Integer cartId) {
        int i = shoppingCartMapper.deleteById(cartId);
        if (i > 0) {
            return new ReturnVO(ResponseStatus.SUCCESS, "success", null);
        }
        return new ReturnVO(ResponseStatus.FAIL, "error", null);
    }

    @Override
    public ReturnVO listByCids(String cids) {
        String[] split = cids.split(",");
        List<Integer> cartIds = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            cartIds.add(Integer.parseInt(split[i]));
        }
        List<ShoppingCartVO> shoppingCartVO = shoppingCartMapper.selectByCids(cartIds);
        return new ReturnVO(ResponseStatus.SUCCESS, "success", shoppingCartVO);
    }
}
