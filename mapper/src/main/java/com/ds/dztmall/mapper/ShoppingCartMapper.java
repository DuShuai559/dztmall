package com.ds.dztmall.mapper;

import com.ds.dztmall.domain.ShoppingCart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ds.dztmall.vo.ShoppingCartVO;

import java.util.List;

/**
 * <p>
 * 购物车  Mapper 接口
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {

    List<ShoppingCartVO> selectShopCartByUserId(Integer userId);

    List<ShoppingCartVO> selectByCids(List<Integer> cartIds);
}
