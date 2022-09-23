package com.ds.dztmall.config;

import com.ds.dztmall.interceptor.CheckTokenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author: DuShuai
 * CreateTime: 2022/08/29 19:24
 * Function: 注入拦截器
 */
@Configuration
public class CheckTokenInterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private CheckTokenInterceptor checkTokenInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(checkTokenInterceptor)
                .addPathPatterns("/shoppingCart/**")
                .excludePathPatterns("/users/**");
    }
}
