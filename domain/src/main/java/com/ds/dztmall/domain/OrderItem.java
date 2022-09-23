package com.ds.dztmall.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getBuyCounts() {
        return buyCounts;
    }

    public void setBuyCounts(Integer buyCounts) {
        this.buyCounts = buyCounts;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getBasketDate() {
        return basketDate;
    }

    public void setBasketDate(LocalDateTime basketDate) {
        this.basketDate = basketDate;
    }

    public LocalDateTime getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(LocalDateTime buyTime) {
        this.buyTime = buyTime;
    }

    public Integer getIsComment() {
        return isComment;
    }

    public void setIsComment(Integer isComment) {
        this.isComment = isComment;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
            "itemId = " + itemId +
            ", orderId = " + orderId +
            ", productId = " + productId +
            ", productName = " + productName +
            ", productImg = " + productImg +
            ", skuId = " + skuId +
            ", skuName = " + skuName +
            ", productPrice = " + productPrice +
            ", buyCounts = " + buyCounts +
            ", totalAmount = " + totalAmount +
            ", basketDate = " + basketDate +
            ", buyTime = " + buyTime +
            ", isComment = " + isComment +
        "}";
    }
}
