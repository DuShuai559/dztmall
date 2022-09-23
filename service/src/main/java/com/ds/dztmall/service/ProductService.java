package com.ds.dztmall.service;

import com.ds.dztmall.domain.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.dztmall.vo.ProductVO;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表 服务类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */

public interface ProductService extends IService<Product> {
    List<ProductVO> selectPros();

    Map<String, Object> detailProduct(String pid);
}
