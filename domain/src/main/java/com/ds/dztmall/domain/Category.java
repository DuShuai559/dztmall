package com.ds.dztmall.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 商品分类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@ApiModel(value = "Category对象", description = "商品分类")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键 分类id主键")
    @TableId(value = "category_id", type = IdType.AUTO)
    private Integer categoryId;

    @ApiModelProperty("分类名称 分类名称")
    private String categoryName;

    @ApiModelProperty("分类层级 分类得类型， 1:一级大分类 2:二级分类 3:三级小分类")
    private Integer categoryLevel;

    @ApiModelProperty("父层级id 父id 上一级依赖的id，1级分类则为0，二级三级分别依赖上一级")
    private Integer parentId;

    @ApiModelProperty("图标 logo")
    private String categoryIcon;

    @ApiModelProperty("口号")
    private String categorySlogan;

    @ApiModelProperty("分类图")
    private String categoryPic;

    @ApiModelProperty("背景颜色")
    private String categoryBgColor;

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
        return "Category{" +
            "categoryId = " + categoryId +
            ", categoryName = " + categoryName +
            ", categoryLevel = " + categoryLevel +
            ", parentId = " + parentId +
            ", categoryIcon = " + categoryIcon +
            ", categorySlogan = " + categorySlogan +
            ", categoryPic = " + categoryPic +
            ", categoryBgColor = " + categoryBgColor +
        "}";
    }
}
