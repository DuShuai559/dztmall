package com.ds.dztmall.mapper;

import com.ds.dztmall.domain.ProductImg;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 商品图片  Mapper 接口
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface ProductImgMapper extends BaseMapper<ProductImg> {

    /**
     * 根据商品ID查询商品图片
     * @param productId
     * @return
     */
    List<ProductImg> selectImgByProId(int productId);
}
