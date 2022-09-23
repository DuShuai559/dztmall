package com.ds.dztmall.controller;

import com.ds.dztmall.service.UsersService;
import com.ds.dztmall.utils.MD5Util;
import com.ds.dztmall.vo.ReturnVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;

/**
 * <p>
 * 用户  前端控制器
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@RestController
@CrossOrigin
@RequestMapping("/users")
@Api(tags = "用户相关接口")
public class UsersController {

    @Resource
    private UsersService usersService;

    /**
     * 登录功能。
     * @param username
     * @param password
     * @return 返回VO对象。
     */
    @ApiOperation(value = "用户登录接口")
    @PostMapping("login/{username}/{password}")
    public ReturnVO login(@ApiParam(value = "登录用户名",required = true) @PathVariable String username,
                          @ApiParam(value = "登录密码", required = true) @PathVariable String password){
        //密码加密
        return usersService.login(username, MD5Util.getMD5(password));
    }

    @ApiOperation(value = "用户注册接口")
    @PostMapping("registry/{username}/{password}")
    public ReturnVO registry(@ApiParam(value = "注册用户名", required = true) @PathVariable String username,
                             @ApiParam(value = "注册密码", required = true) @PathVariable String password){
        return usersService.registry(username, MD5Util.getMD5(password));
    }
}
