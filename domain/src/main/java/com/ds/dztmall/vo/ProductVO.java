package com.ds.dztmall.vo;

import com.ds.dztmall.domain.Product;
import com.ds.dztmall.domain.ProductImg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 商品 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */

public class ProductVO extends Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<ProductImg> productImgs;

    private ProductImg productImg;

    public ProductImg getProductImg() {
        return productImg;
    }

    public void setProductImg(ProductImg productImg) {
        this.productImg = productImg;
    }

    public List<ProductImg> getProductImgs() {
        return productImgs;
    }

    public void setProductImgs(List<ProductImg> productImgs) {
        this.productImgs = productImgs;
    }
}
