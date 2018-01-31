package com.lpan.common.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * filter
 * Created by Lpan on 2018/1/31.
 */
@WebFilter(filterName = "MyFilter", urlPatterns = {"/*"},
        initParams = {
        @WebInitParam(name="encoding",value="UTF-8"), @WebInitParam(name="forceEncoding",value="true")})
/**
 *
 *      拦截路径设置编码格式为UTF-8
 *
 *   实现javax.servlet.Filter  接口
 *   filterName：过滤器的名字
 *    urlPatterns：过滤的请求
 *    initParams：初始化参数
 *    根据这些注解可以看出跟之前配置文件是一样的  只不过换了一种表达方式
 */
public class MyFilter implements Filter {

    private String encoding = "UTF-8";
    private boolean forceEncoding = true;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.encoding = filterConfig.getInitParameter("encoding");
        String force = filterConfig.getInitParameter("forceEncoding");
        this.forceEncoding = (force==null) || Boolean.valueOf(force);
        System.out.println("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("这是我的过滤器的过滤方法");
        if (this.forceEncoding || this.encoding != null){
            request.setCharacterEncoding(this.encoding);
            response.setCharacterEncoding(this.encoding);
        }
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void setForceEncoding(boolean forceEncoding) {
        this.forceEncoding = forceEncoding;
    }
}
