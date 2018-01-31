package com.lpan.common.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * config interceptor
 * Created by Lpan on 2018/1/31.
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    /**
     * 用于注册拦截器，可以注册多个拦截器，注册多个就组成一个拦截器链
     *
     */
    @Override
    public  void  addInterceptors(InterceptorRegistry interceptorRegistry){
        MyInterceptor myInterceptor = new MyInterceptor();
        // addPathPatterns("/*");      //添加拦截规则
        //excludePathPatterns("");    //排除拦截
        interceptorRegistry.addInterceptor(myInterceptor).addPathPatterns("/**").excludePathPatterns("/login");
        super.addInterceptors(interceptorRegistry);
    }
}
