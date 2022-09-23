package com.ds.dztmall.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品评价 
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */

public class ProductCommentsVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String commId;

    private String productId;

    private String productName;

    private String orderItemId;

    private Integer isAnonymous;

    private Integer commType;

    private Integer commLevel;

    private String commContent;

    private String commImgs;

    private LocalDateTime sepcName;

    private Integer replyStatus;

    private String replyContent;

    private LocalDateTime replyTime;

    private Integer isShow;

    private String userId;

    private String userImg;

    private String username;

    private String nickname;

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname.length() > 1){
            this.nickname = nickname.substring(0,1) + "****" + nickname.substring(nickname.length()-1);
        }else {
            this.nickname = nickname + "****" ;
        }
    }

    public String getCommId() {
        return commId;
    }

    public void setCommId(String commId) {
        this.commId = commId;
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

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Integer isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Integer getCommType() {
        return commType;
    }

    public void setCommType(Integer commType) {
        this.commType = commType;
    }

    public Integer getCommLevel() {
        return commLevel;
    }

    public void setCommLevel(Integer commLevel) {
        this.commLevel = commLevel;
    }

    public String getCommContent() {
        return commContent;
    }

    public void setCommContent(String commContent) {
        this.commContent = commContent;
    }

    public String getCommImgs() {
        return commImgs;
    }

    public void setCommImgs(String commImgs) {
        this.commImgs = commImgs;
    }

    public LocalDateTime getSepcName() {
        return sepcName;
    }

    public void setSepcName(LocalDateTime sepcName) {
        this.sepcName = sepcName;
    }

    public Integer getReplyStatus() {
        return replyStatus;
    }

    public void setReplyStatus(Integer replyStatus) {
        this.replyStatus = replyStatus;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public LocalDateTime getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(LocalDateTime replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    @Override
    public String toString() {
        return "ProductComments{" +
            "commId = " + commId +
            ", productId = " + productId +
            ", productName = " + productName +
            ", orderItemId = " + orderItemId +
            ", userId = " + userId +
            ", isAnonymous = " + isAnonymous +
            ", commType = " + commType +
            ", commLevel = " + commLevel +
            ", commContent = " + commContent +
            ", commImgs = " + commImgs +
            ", sepcName = " + sepcName +
            ", replyStatus = " + replyStatus +
            ", replyContent = " + replyContent +
            ", replyTime = " + replyTime +
            ", isShow = " + isShow +
        "}";
    }
}
