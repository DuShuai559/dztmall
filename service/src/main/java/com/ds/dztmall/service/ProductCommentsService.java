package com.ds.dztmall.service;

import com.ds.dztmall.domain.ProductComments;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.dztmall.vo.ReturnVO;

/**
 * <p>
 * 商品评价  服务类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface ProductCommentsService extends IService<ProductComments> {
    ReturnVO selectCommentsByProId(String proId, Integer pageNo);

    ReturnVO selectCommentsInfo(String proId);
}
