package com.ds.dztmall.vo;

/**
 * Author: DuShuai
 * CreateTime: 2022/08/26 23:54
 * Function: please enter
 */
public class ResponseStatus {
    // 访问成功
    public static final int SUCCESS = 10000;
    // 访问失败
    public static final int FAIL = 10001;

    // 未登录
    public static final int NOT_LOGIN = 20001;
    // 登录过期
    public static final int LOGIN_EXPIRED = 20002;
}
