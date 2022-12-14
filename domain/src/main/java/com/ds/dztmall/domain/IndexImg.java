package com.ds.dztmall.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 轮播图 
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@TableName("index_img")
@ApiModel(value = "IndexImg对象", description = "轮播图 ")
public class IndexImg implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    private String imgId;

    @ApiModelProperty("图片 图片地址")
    private String imgUrl;

    @ApiModelProperty("背景色 背景颜色")
    private String imgBgColor;

    @ApiModelProperty("商品id 商品id")
    private String prodId;

    @ApiModelProperty("商品分类id 商品分类id")
    private String categoryId;

    @ApiModelProperty("轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类")
    private Integer indexType;

    @ApiModelProperty("轮播图展示顺序 轮播图展示顺序，从小到大")
    private Integer seq;

    @ApiModelProperty("是否展示:1表示正常显示，0表示下线 是否展示，1：展示    0：不展示")
    private Integer status;

    @ApiModelProperty("创建时间 创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间 更新")
    private LocalDateTime updateTime;

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgBgColor() {
        return imgBgColor;
    }

    public void setImgBgColor(String imgBgColor) {
        this.imgBgColor = imgBgColor;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getIndexType() {
        return indexType;
    }

    public void setIndexType(Integer indexType) {
        this.indexType = indexType;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        return "IndexImg{" +
            "imgId = " + imgId +
            ", imgUrl = " + imgUrl +
            ", imgBgColor = " + imgBgColor +
            ", prodId = " + prodId +
            ", categoryId = " + categoryId +
            ", indexType = " + indexType +
            ", seq = " + seq +
            ", status = " + status +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
