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
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("product_sku")
@ApiModel(value = "ProductSku对象", description = "商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计")
public class ProductSku implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("sku编号")
    private String skuId;

    @ApiModelProperty("商品id")
    private String productId;

    @ApiModelProperty("sku名称")
    private String skuName;

    @ApiModelProperty("sku图片")
    private String skuImg;

    @ApiModelProperty("属性组合（格式是p1:v1;p2:v2）")
    private String untitled;

    @ApiModelProperty("原价")
    private Double originalPrice;

    @ApiModelProperty("销售价格")
    private Double sellPrice;

    @ApiModelProperty("折扣力度")
    private BigDecimal discounts;

    @ApiModelProperty("库存")
    private Integer stock;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("sku状态(1启用，0禁用，-1删除)")
    private Integer status;

}
