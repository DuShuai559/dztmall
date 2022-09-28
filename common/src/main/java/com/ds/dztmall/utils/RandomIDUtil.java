package com.ds.dztmall.utils;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Author: DuShuai
 * CreateTime: 2022/09/28 19:48
 * Function: please enter
 */
public class RandomIDUtil {
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
    public static String getNumId(){
        return System.currentTimeMillis() + "" + ThreadLocalRandom.current().nextInt(1000,10000);
    }
}
