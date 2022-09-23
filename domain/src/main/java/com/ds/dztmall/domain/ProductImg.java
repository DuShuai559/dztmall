package com.ds.dztmall.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品图片 
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@TableName("product_img")
@ApiModel(value = "ProductImg对象", description = "商品图片 ")
public class ProductImg implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("图片主键")
    private String id;

    @ApiModelProperty("商品外键id 商品外键id")
    private String itemId;

    @ApiModelProperty("图片地址 图片地址")
    private String url;

    @ApiModelProperty("顺序 图片顺序，从小到大")
    private Integer sort;

    @ApiModelProperty("是否主图 是否主图，1：是，0：否")
    private Integer isMain;

    @ApiModelProperty("创建时间")
    private LocalDateTime createdTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsMain() {
        return isMain;
    }

    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public String toString() {
        return "ProductImg{" +
            "id = " + id +
            ", itemId = " + itemId +
            ", url = " + url +
            ", sort = " + sort +
            ", isMain = " + isMain +
            ", createdTime = " + createdTime +
            ", updatedTime = " + updatedTime +
        "}";
    }
}
