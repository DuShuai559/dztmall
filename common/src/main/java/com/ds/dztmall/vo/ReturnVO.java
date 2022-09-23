package com.ds.dztmall.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: DuShuai
 * CreateTime: 2022/08/10 10:03
 * Function: 返回值类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReturnVO {
    //响应状态码
    private Integer code;

    //响应信息
    private String msg;

    //响应数据
    private Object data;
}
