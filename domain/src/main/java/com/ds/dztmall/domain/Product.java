package com.ds.dztmall.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@ApiModel(value = "Product对象", description = "商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品主键id")
    private String productId;

    @ApiModelProperty("商品名称 商品名称")
    private String productName;

    @ApiModelProperty("分类外键id 分类id")
    private Integer categoryId;

    @ApiModelProperty("一级分类外键id 一级分类id，用于优化查询")
    private Integer rootCategoryId;

    @ApiModelProperty("销量 累计销售")
    private Integer soldNum;

    @ApiModelProperty("默认是1，表示正常状态, -1表示删除, 0下架 默认是1，表示正常状态, -1表示删除, 0下架")
    private Integer productStatus;

    @ApiModelProperty("商品内容 商品内容")
    private String content;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getRootCategoryId() {
        return rootCategoryId;
    }

    public void setRootCategoryId(Integer rootCategoryId) {
        this.rootCategoryId = rootCategoryId;
    }

    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Product{" +
            "productId = " + productId +
            ", productName = " + productName +
            ", categoryId = " + categoryId +
            ", rootCategoryId = " + rootCategoryId +
            ", soldNum = " + soldNum +
            ", productStatus = " + productStatus +
            ", content = " + content +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
