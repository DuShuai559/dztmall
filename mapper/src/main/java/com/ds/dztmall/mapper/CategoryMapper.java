package com.ds.dztmall.mapper;

import com.ds.dztmall.domain.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ds.dztmall.vo.CategoryVO;
import com.ds.dztmall.vo.CategoryVO2;

import java.util.List;

/**
 * <p>
 * 商品分类 Mapper 接口
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 查询所有商品分类
     * @param parentId
     * @return
     */
    List<CategoryVO> selectCategoryList(int parentId);


    /**
     * 查询一级分类，同时通过子查询查询一级分类下的三级分类和一级分类下的销量前6的商品和商品对应的图片
     * @return
     */
    List<CategoryVO2> selectFirstCategoryProduct6();


}
