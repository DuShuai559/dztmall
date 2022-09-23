package com.ds.dztmall.utils;


import org.springframework.util.DigestUtils;

/**
 * Author: DuShuai
 * CreateTime: 2022/08/10 10:07
 * Function: please enter
 */
public class MD5Util {
    public static String getMD5(String val){
        return DigestUtils.md5DigestAsHex(val.getBytes());
    }
}
