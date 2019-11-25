package com.huawei.filter;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.*;
import java.io.IOException;

public class Filter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行filter1");
        //拦截后让目标资源执行
        chain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}
