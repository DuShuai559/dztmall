package com.ds.dztmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ds.dztmall.domain.Product;
import com.ds.dztmall.domain.ProductImg;
import com.ds.dztmall.domain.ProductSku;
import com.ds.dztmall.vo.ProductVO;
import com.ds.dztmall.mapper.ProductImgMapper;
import com.ds.dztmall.mapper.ProductMapper;
import com.ds.dztmall.mapper.ProductSkuMapper;
import com.ds.dztmall.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表 服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Resource
    private ProductImgMapper productImgMapper;

    @Resource
    private ProductSkuMapper productSkuMapper;


    /**
     * 查询推荐商品。销量前三
     * @return
     */
    @Override
    public List<ProductVO> selectPros() {
        return productMapper.selectRecommendPros();
    }

    /**
     * 根据商品id查询商品详细信息
     * @param pid
     * @return
     */
    @Override
    public Map<String, Object> detailProduct(String pid) {
        // 查询商品基本信息
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("product_id",pid);
        queryWrapper.eq("product_status",1);
        Product product = productMapper.selectOne(queryWrapper);
        // 查询商品图片信息
        List<ProductImg> productImgs = productImgMapper.selectImgByProId(Integer.parseInt(pid));
        // 查询商品sku信息
        QueryWrapper queryWrapper1 = new QueryWrapper();
        queryWrapper1.eq("product_id", pid);
        queryWrapper1.eq("status", 1);
        List<ProductSku> productSkus = productSkuMapper.selectList(queryWrapper1);
        Map<String, Object> map = new HashMap<>();
        map.put("product", product);
        map.put("productImgs", productImgs);
        map.put("productSkus", productSkus);
        return map;
    }
}
