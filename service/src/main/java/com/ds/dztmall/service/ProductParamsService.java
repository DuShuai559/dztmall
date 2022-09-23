package com.ds.dztmall.service;

import com.ds.dztmall.domain.ProductParams;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品参数  服务类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface ProductParamsService extends IService<ProductParams> {
    public ProductParams selectProParamsById(String id);
}
