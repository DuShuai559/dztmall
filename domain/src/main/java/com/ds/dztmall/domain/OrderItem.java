package com.ds.dztmall.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 订单项/快照 
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@TableName("order_item")
@ApiModel(value = "OrderItem对象", description = "订单项/快照 ")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("订单项ID")
    private String itemId;

    @ApiModelProperty("订单ID")
    private String orderId;

    @ApiModelProperty("商品ID")
    private String productId;

    @ApiModelProperty("商品名称")
    private String productName;

    @ApiModelProperty("商品图片")
    private String productImg;

    @ApiModelProperty("skuID")
    private String skuId;

    @ApiModelProperty("sku名称")
    private String skuName;

    @ApiModelProperty("商品价格")
    private BigDecimal productPrice;

    @ApiModelProperty("购买数量")
    private Integer buyCounts;

    @ApiModelProperty("商品总金额")
    private BigDecimal totalAmount;

    @ApiModelProperty("加入购物车时间")
    private LocalDateTime basketDate;

    @ApiModelProperty("购买时间")
    private LocalDateTime buyTime;

    @ApiModelProperty("评论状态： 0 未评价  1 已评价")
    private Integer isComment;
}
