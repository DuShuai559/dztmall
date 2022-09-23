package com.ds.dztmall.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 购物车 
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("shopping_cart")
@ApiModel(value = "ShoppingCart对象", description = "购物车商品对象")
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "cart_id", type = IdType.AUTO)
    private Integer cartId;

    @ApiModelProperty("商品ID")
    private String productId;

    @ApiModelProperty("skuID")
    private String skuId;

    @ApiModelProperty("用户ID")
    private String userId;

    @ApiModelProperty("购物车商品数量")
    private Integer cartNum;

    @ApiModelProperty("添加购物车时间")
    private String cartTime;

    @ApiModelProperty("添加购物车时商品价格")
    private BigDecimal productPrice;

    @ApiModelProperty("选择的套餐的属性")
    private String skuProps;

}
