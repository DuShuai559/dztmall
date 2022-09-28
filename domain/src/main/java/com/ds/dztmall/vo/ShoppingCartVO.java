package com.ds.dztmall.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ds.dztmall.domain.ShoppingCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

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
public class ShoppingCartVO extends ShoppingCart implements Serializable {

    private static final long serialVersionUID = 1L;

    private String productName;

    private String url;

    private Double originalPrice;

    private Double sellPrice;

    private Integer skuStock;
}
