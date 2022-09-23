package com.ds.dztmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ds.dztmall.config.Constant;
import com.ds.dztmall.domain.Users;
import com.ds.dztmall.mapper.UsersMapper;
import com.ds.dztmall.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ds.dztmall.utils.DateUtil;
import com.ds.dztmall.vo.ResponseStatus;
import com.ds.dztmall.vo.ReturnVO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户  服务实现类
 * </p>
 *
 * @author DuShuai
 * @since 2022-08-31
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    /**
     * 登录功能
     * @param username  用户名
     * @param password  加密后的密码
     * @return  返回VO对象。
     */
    @Override
    public ReturnVO login(String username, String password) {
        ReturnVO returnVO = null;
        Users users = new Users();
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        Map map = new HashMap();
        map.put("username", username);
        map.put("password", password);
        Users user = users.selectOne(wrapper.allEq(map));
        if (user == null){
            returnVO = new ReturnVO(ResponseStatus.FAIL, "请检查用户名或密码", null);
        }else {
            // 通过JWT生成token
            String token = Jwts.builder()
                    .setIssuedAt(new Date())    //token生成时间
                    .setSubject(username)       //token中存放用户名
                    .setId(user.getUserId() + "")    //token中存放ID
                    .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))  //设置过期时间，1天
                    .signWith(SignatureAlgorithm.HS256, "DuShuai123")   //设置加密格式和密码
                    .compact();

            // 登录成功，返回token
            returnVO = new ReturnVO(ResponseStatus.SUCCESS, token, user);

        }
        return returnVO;
    }


    /**
     * 注册功能
     * @param username  用户名
     * @param password  加密后的密码
     * @return  返回VO对象
     */
    @Override
    public ReturnVO registry(String username, String password) {
        ReturnVO returnVO = null;
        Users users = new Users();
        //先判断该用户名是否已被注册
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        Users u = users.selectOne(wrapper.eq("username", username));
        if (u != null){
            //说明已经被注册
            returnVO = new ReturnVO(ResponseStatus.FAIL, "该用户名已被注册", null);
        }else {
            //没有注册，补全信息，插入数据库
            LocalDateTime nowTime = DateUtil.getTime();
            users.setUserRegtime(nowTime);
            users.setUserModtime(nowTime);
            users.setUsername(username);
            users.setPassword(password);

            users.setUserImg(Constant.IMG_PATH);
            if (users.insert()){
                returnVO = new ReturnVO(ResponseStatus.SUCCESS, "注册成功", users);
            }else {
                returnVO = new ReturnVO(ResponseStatus.FAIL, "意料之外的错误", null);
            }
        }
        return returnVO;
    }
}
