package com.ds.dztmall.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 登录历史表 
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@TableName("user_login_history")
@ApiModel(value = "UserLoginHistory对象", description = "登录历史表 ")
public class UserLoginHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("ID")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("地区")
    private String area;

    @ApiModelProperty("国家")
    private String country;

    @ApiModelProperty("用户id")
    private String userId;

    @ApiModelProperty("IP")
    private String ip;

    @ApiModelProperty("时间")
    private String loginTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public String toString() {
        return "UserLoginHistory{" +
            "id = " + id +
            ", area = " + area +
            ", country = " + country +
            ", userId = " + userId +
            ", ip = " + ip +
            ", loginTime = " + loginTime +
        "}";
    }
}
