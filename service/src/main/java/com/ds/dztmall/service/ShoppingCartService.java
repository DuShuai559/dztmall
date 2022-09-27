package com.ds.dztmall.service;

import com.ds.dztmall.domain.ShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ds.dztmall.vo.ReturnVO;

/**
 * <p>
 * 购物车  服务类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
public interface ShoppingCartService extends IService<ShoppingCart> {

    ReturnVO addShoppingCart(ShoppingCart shoppingCart);

    ReturnVO listShoppingCart(Integer userId);

    ReturnVO updateCartNum(ShoppingCart shoppingCart);

    ReturnVO delShopCart(Integer cartId);

    ReturnVO listByCids(String cids);
}
