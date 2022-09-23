package com.ds.dztmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ds.dztmall.domain.ProductParams;
import com.ds.dztmall.mapper.ProductParamsMapper;
import com.ds.dztmall.service.ProductParamsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 商品参数  服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class ProductParamsServiceImpl extends ServiceImpl<ProductParamsMapper, ProductParams> implements ProductParamsService {

    @Resource
    private ProductParamsMapper productParamsMapper;

    @Override
    public ProductParams selectProParamsById(String id) {
        QueryWrapper<ProductParams> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("product_id", id);
        List<ProductParams> productParams = productParamsMapper.selectList(queryWrapper);
        if (productParams.size() > 0){
            return productParams.get(0);
        }
        return null;
    }
}
