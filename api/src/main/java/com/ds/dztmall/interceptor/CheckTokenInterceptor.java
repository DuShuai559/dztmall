package com.ds.dztmall.interceptor;

import com.ds.dztmall.vo.ResponseStatus;
import com.ds.dztmall.vo.ReturnVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.UnsupportedJwtException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author: DuShuai
 * CreateTime: 2022/08/29 19:25
 * Function: 配置拦截器
 */
@Component
public class CheckTokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String method = request.getMethod();
        if ("OPTIONS".equalsIgnoreCase(method)){
            return true;
        }
        String token = request.getHeader("token");
        // 解析token
        JwtParser parser = Jwts.parser();
        parser.setSigningKey("DuShuai123");    //设置密码。该密码必须和生成token时的密码一致
        try{
            parser.parseClaimsJws(token);   //解析token。如果token不正确或失效，会抛异常
            return true;
        }catch (ExpiredJwtException e){
            // token过期
            doResponse(response, new ReturnVO(ResponseStatus.LOGIN_EXPIRED, "token过期，请重新登录", null));
        }catch (UnsupportedJwtException e){
            // 非法token
            doResponse(response, new ReturnVO(ResponseStatus.NOT_LOGIN, "token非法，请先登录", null));
        }catch (Exception e){
            // 其他错误
            doResponse(response, new ReturnVO(ResponseStatus.NOT_LOGIN, "请先登录", null));
        }
        return false;
    }

    private void doResponse(HttpServletResponse response, ReturnVO returnVO) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json");
        PrintWriter writer = response.getWriter();
        writer.print(new ObjectMapper().writeValueAsString(returnVO));
        writer.flush();
        writer.close();
    }
}
