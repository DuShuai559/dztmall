package com.ds.dztmall.controller;

import com.ds.dztmall.domain.ShoppingCart;
import com.ds.dztmall.service.ShoppingCartService;
import com.ds.dztmall.vo.ResponseStatus;
import com.ds.dztmall.vo.ReturnVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * 购物车  前端控制器
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@RestController
@CrossOrigin
@RequestMapping("/shoppingCart")
@Api(tags = "购物车相关接口")
public class ShoppingCartController {
    @Resource
    private ShoppingCartService shoppingCartService;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @ApiOperation(value = "显示购物车列表")
    @GetMapping("list")
    public ReturnVO listCarts(@ApiParam(value = "用户ID，必填", required = true) Integer userId,
                              @ApiParam(value = "用户token，通过header传递", required = true) @RequestHeader String token){
        return shoppingCartService.listShoppingCart(userId);
    }

    @ApiOperation(value = "添加购物车")
    @PostMapping("addShop")
    public ReturnVO addShoppingCart(@RequestBody ShoppingCart shoppingCart,
                                    @ApiParam(value = "用户token，通过header传递", required = true) @RequestHeader String token){
        shoppingCart.setCartTime(simpleDateFormat.format(new Date()));
        return shoppingCartService.addShoppingCart(shoppingCart);
    }

    @ApiOperation(value = "修改购物车商品数量")
    @PutMapping("updateCartNum/{cartId}/{cartNum}")
    public ReturnVO updateCartNum(@ApiParam(value = "购物车商品id", required = true) @PathVariable Integer cartId,
                                  @ApiParam(value = "修改后的数量", required = true) @PathVariable Integer cartNum,
                                  @ApiParam(value = "用户token，通过header传递", required = true) @RequestHeader String token){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCartId(cartId);
        shoppingCart.setCartNum(cartNum);
        return shoppingCartService.updateCartNum(shoppingCart);
    }

    @ApiOperation(value = "删除购物车商品")
    @DeleteMapping("del/{cartId}")
    public ReturnVO delShopCart(@ApiParam(value = "购物车商品id", required = true) @PathVariable Integer cartId,
                                @ApiParam(value = "用户token，通过header传递", required = true) @RequestHeader String token){
        return shoppingCartService.delShopCart(cartId);
    }

    @ApiOperation("查询用户要购买的商品接口")
    @GetMapping("listByCids")
    public ReturnVO listByCids(@ApiParam(value = "要购买的商品id", required = true) String cids,
    @ApiParam(value = "用户token，通过header传递", required = true) @RequestHeader String token){
        return shoppingCartService.listByCids(cids);
    }
}
