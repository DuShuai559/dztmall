package com.ds.dztmall.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户地址 
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@TableName("user_addr")
@ApiModel(value = "UserAddr对象", description = "用户地址 ")
public class UserAddr implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("地址主键id")
    private String addrId;

    @ApiModelProperty("用户ID")
    private String userId;

    @ApiModelProperty("收件人姓名")
    private String receiverName;

    @ApiModelProperty("收件人手机号")
    private String receiverMobile;

    @ApiModelProperty("省份")
    private String province;

    @ApiModelProperty("城市")
    private String city;

    @ApiModelProperty("区县")
    private String area;

    @ApiModelProperty("详细地址")
    private String addr;

    @ApiModelProperty("邮编")
    private String postCode;

    @ApiModelProperty("状态,1正常，0无效")
    private Integer status;

    @ApiModelProperty("是否默认地址 1是 1:是  0:否")
    private Integer commonAddr;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    public String getAddrId() {
        return addrId;
    }

    public void setAddrId(String addrId) {
        this.addrId = addrId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCommonAddr() {
        return commonAddr;
    }

    public void setCommonAddr(Integer commonAddr) {
        this.commonAddr = commonAddr;
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
        return "UserAddr{" +
            "addrId = " + addrId +
            ", userId = " + userId +
            ", receiverName = " + receiverName +
            ", receiverMobile = " + receiverMobile +
            ", province = " + province +
            ", city = " + city +
            ", area = " + area +
            ", addr = " + addr +
            ", postCode = " + postCode +
            ", status = " + status +
            ", commonAddr = " + commonAddr +
            ", createTime = " + createTime +
            ", updateTime = " + updateTime +
        "}";
    }
}
