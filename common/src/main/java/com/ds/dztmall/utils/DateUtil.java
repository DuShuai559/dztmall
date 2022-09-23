package com.ds.dztmall.utils;


import java.time.LocalDateTime;

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
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss SSS");
//        String time = localDateTime.format(dtf);
//        return time;
//    }
}
