package com.ds.dztmall.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品参数 
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@TableName("product_params")
@ApiModel(value = "ProductParams对象", description = "商品参数 ")
public class ProductParams implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("商品参数id")
    private String paramId;

    @ApiModelProperty("商品id")
    private String productId;

    @ApiModelProperty("产地 产地，例：中国江苏")
    private String productPlace;

    @ApiModelProperty("保质期 保质期，例：180天")
    private String footPeriod;

    @ApiModelProperty("品牌名 品牌名，例：三只大灰狼")
    private String brand;

    @ApiModelProperty("生产厂名 生产厂名，例：大灰狼工厂")
    private String factoryName;

    @ApiModelProperty("生产厂址 生产厂址，例：大灰狼生产基地")
    private String factoryAddress;

    @ApiModelProperty("包装方式 包装方式，例：袋装")
    private String packagingMethod;

    @ApiModelProperty("规格重量 规格重量，例：35g")
    private String weight;

    @ApiModelProperty("存储方法 存储方法，例：常温5~25°")
    private String storageMethod;

    @ApiModelProperty("食用方式 食用方式，例：开袋即食")
    private String eatMethod;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductPlace() {
        return productPlace;
    }

    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace;
    }

    public String getFootPeriod() {
        return footPeriod;
    }

    public void setFootPeriod(String footPeriod) {
        this.footPeriod = footPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryAddress() {
        return factoryAddress;
    }

    public void setFactoryAddress(String factoryAddress) {
        this.factoryAddress = factoryAddress;
    }

    public String getPackagingMethod() {
        return packagingMethod;
    }

    public void setPackagingMethod(String packagingMethod) {
        this.packagingMethod = packagingMethod;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getStorageMethod() {
        return storageMethod;
    }

    public void setStorageMethod(String storageMethod) {
        this.storageMethod = storageMethod;
    }

    public String getEatMethod() {
        return eatMethod;
    }

    public void setEatMethod(String eatMethod) {
        this.eatMethod = eatMethod;
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
        return "ProductParams{" +
            "paramId = " + paramId +
            ", productId = " + productId +
            ", productPlace = " + productPlace +
            ", footPeriod = " + footPeriod +
            ", brand = " + brand +
            ", factoryName = " + factoryName +
            ", factoryAddress = " + factoryAddress +
            ", packagingMethod = " + packagingMethod +
            ", weight = " + weight +
            ", storageMethod = " + storageMethod +
            ", eatMethod = " + eatMethod +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
