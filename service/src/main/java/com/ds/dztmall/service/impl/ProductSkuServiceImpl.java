package com.ds.dztmall.service.impl;

import com.ds.dztmall.domain.ProductSku;
import com.ds.dztmall.mapper.ProductSkuMapper;
import com.ds.dztmall.service.ProductSkuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class ProductSkuServiceImpl extends ServiceImpl<ProductSkuMapper, ProductSku> implements ProductSkuService {

}
