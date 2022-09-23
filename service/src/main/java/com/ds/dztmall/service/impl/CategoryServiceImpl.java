package com.ds.dztmall.service.impl;

import com.ds.dztmall.domain.Category;
import com.ds.dztmall.vo.CategoryVO;
import com.ds.dztmall.vo.CategoryVO2;
import com.ds.dztmall.mapper.CategoryMapper;
import com.ds.dztmall.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 商品分类 服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    /**
     * 查询所有级别的商品分类
     * @return
     */
    @Override
    public List<CategoryVO> selectCategoryList() {
        return categoryMapper.selectCategoryList(0);
    }

    @Override
    public List<CategoryVO2> selectFirstCategoryProduct6() {
        return categoryMapper.selectFirstCategoryProduct6();
    }
}
