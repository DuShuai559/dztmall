package com.ds.dztmall.mapper;

import com.ds.dztmall.domain.ProductComments;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ds.dztmall.vo.ProductCommentsVO;

import java.util.List;

/**
 * <p>
 * 商品评价  Mapper 接口
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface ProductCommentsMapper extends BaseMapper<ProductComments> {
    List<ProductCommentsVO> selectCommentsByProId(String productId, Integer startIndex, Integer pageSize);
}
