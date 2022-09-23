package com.ds.dztmall.service;

import com.ds.dztmall.domain.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.dztmall.vo.CategoryVO;
import com.ds.dztmall.vo.CategoryVO2;

import java.util.List;

/**
 * <p>
 * 商品分类 服务类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface CategoryService extends IService<Category> {

    /**
     *
     * @return
     */
    List<CategoryVO> selectCategoryList();


    List<CategoryVO2> selectFirstCategoryProduct6();
}
