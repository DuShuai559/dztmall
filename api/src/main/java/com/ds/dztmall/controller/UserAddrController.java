package com.ds.dztmall.controller;

import com.ds.dztmall.service.UserAddrService;
import com.ds.dztmall.vo.ReturnVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 * 用户地址  前端控制器
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@RestController
@CrossOrigin
@RequestMapping("/userAddr")
@Api(tags = "用户地址相关接口")
public class UserAddrController {

    @Resource
    private UserAddrService userAddrService;

    @ApiOperation("查询用户收货地址的接口")
    @GetMapping("list")
    public ReturnVO list(@ApiParam(value = "用户id", required = true)Integer userId,
                         @ApiParam(value = "用户token", required = true)@RequestHeader String token){
        return userAddrService.getUserAddrs(userId);
    }
}
