package com.ds.dztmall.mapper;

import com.ds.dztmall.domain.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ds.dztmall.vo.ProductVO;

import java.util.List;

/**
 * <p>
 * 商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表 Mapper 接口
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface ProductMapper extends BaseMapper<Product> {

    /**
     * 查询推荐商品。销量前三
     * @return
     */
    List<ProductVO> selectRecommendPros();


    /**
     * 根据一级分类查询下面的销量前6
     * @param category1Id   一级分类的id
     * @return
     */
    List<ProductVO> selectPro6(int category1Id);
}
