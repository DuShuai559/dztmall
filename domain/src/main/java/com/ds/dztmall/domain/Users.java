package com.ds.dztmall.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户 
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@ApiModel(value = "Users对象", description = "用户 ")
public class Users extends Model<Users> implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键id 用户id")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty("用户名 用户名")
    private String username;

    @ApiModelProperty("密码 密码")
    private String password;

    @ApiModelProperty("昵称 昵称")
    private String nickname;

    @ApiModelProperty("真实姓名 真实姓名")
    private String realname;

    @ApiModelProperty("头像 头像")
    private String userImg;

    @ApiModelProperty("手机号 手机号")
    private String userMobile;

    @ApiModelProperty("邮箱地址 邮箱地址")
    private String userEmail;

    @ApiModelProperty("性别 M(男) or F(女)")
    private String userSex;

    @ApiModelProperty("生日 生日")
    private LocalDate userBirth;

    @ApiModelProperty("注册时间 创建时间")
    private LocalDateTime userRegtime;

    @ApiModelProperty("更新时间 更新时间")
    private LocalDateTime userModtime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public LocalDate getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(LocalDate userBirth) {
        this.userBirth = userBirth;
    }

    public LocalDateTime getUserRegtime() {
        return userRegtime;
    }

    public void setUserRegtime(LocalDateTime userRegtime) {
        this.userRegtime = userRegtime;
    }

    public LocalDateTime getUserModtime() {
        return userModtime;
    }

    public void setUserModtime(LocalDateTime userModtime) {
        this.userModtime = userModtime;
    }

    @Override
    public String toString() {
        return "Users{" +
            "userId = " + userId +
            ", username = " + username +
            ", password = " + password +
            ", nickname = " + nickname +
            ", realname = " + realname +
            ", userImg = " + userImg +
            ", userMobile = " + userMobile +
            ", userEmail = " + userEmail +
            ", userSex = " + userSex +
            ", userBirth = " + userBirth +
            ", userRegtime = " + userRegtime +
            ", userModtime = " + userModtime +
        "}";
    }
}
