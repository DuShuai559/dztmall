package com.ds.dztmall.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 商品分类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */

public class CategoryVO2 implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer categoryId;

    private String categoryName;

    private Integer categoryLevel;

    private Integer parentId;

    private String categoryIcon;

    private String categorySlogan;

    private String categoryPic;

    private String categoryBgColor;

    private List<CategoryVO2> categoryVO2List;

    private List<ProductVO> productVOList;

    public List<ProductVO> getProductVOList() {
        return productVOList;
    }

    public void setProductVOList(List<ProductVO> productVOList) {
        this.productVOList = productVOList;
    }

    public List<CategoryVO2> getCategoryVO2List() {
        return categoryVO2List;
    }

    public void setCategoryVO2List(List<CategoryVO2> categoryVO2List) {
        this.categoryVO2List = categoryVO2List;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCategoryIcon() {
        return categoryIcon;
    }

    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }

    public String getCategorySlogan() {
        return categorySlogan;
    }

    public void setCategorySlogan(String categorySlogan) {
        this.categorySlogan = categorySlogan;
    }

    public String getCategoryPic() {
        return categoryPic;
    }

    public void setCategoryPic(String categoryPic) {
        this.categoryPic = categoryPic;
    }

    public String getCategoryBgColor() {
        return categoryBgColor;
    }

    public void setCategoryBgColor(String categoryBgColor) {
        this.categoryBgColor = categoryBgColor;
    }

    @Override
    public String toString() {
        return "CategoryVO2{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryLevel=" + categoryLevel +
                ", parentId=" + parentId +
                ", categoryIcon='" + categoryIcon + '\'' +
                ", categorySlogan='" + categorySlogan + '\'' +
                ", categoryPic='" + categoryPic + '\'' +
                ", categoryBgColor='" + categoryBgColor + '\'' +
                ", categoryVO2List=" + categoryVO2List +
                ", productVOList=" + productVOList +
                '}';
    }
}
