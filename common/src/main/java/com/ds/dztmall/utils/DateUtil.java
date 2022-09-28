package com.ds.dztmall.utils;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Author: DuShuai
 * CreateTime: 2022/08/10 11:10
 * Function: please enter
 */
public final class DateUtil {
    public static LocalDateTime getTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime;
    }

    public static LocalDateTime strToLocalDateTime(String str){
        return LocalDateTime.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
