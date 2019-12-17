package com.myvision.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 解决获取参数出现中文乱码
        request.setCharacterEncoding("utf-8");
        // 解决浏览器出现中文乱码
        response.setContentType("text/html;charset=utf-8");
        HttpServletRequest request1 = (HttpServletRequest) request;
        String url = request1.getRequestURI();
        System.out.println(url);
        if (url.equals("/MyVision_war_exploded/")||url.contains("/MyVision_war_exploded/login")) {
            chain.doFilter(request1, response);
        } else {
            HttpSession session = request1.getSession();
            String stat = (String) session.getAttribute("status");
            System.out.println(stat);
            if(stat!=null && !stat.equals("")) {
                String[] split = stat.split("\\:");
                String status = split[1];
                if ( !status.equals("1")) {
                    // 使用请求转发跳转到 登录页面, 且 提示错误信息
                    request1.setAttribute("msg", "<font color='red'>请登录！</font>");
                    request1.getRequestDispatcher("login.jsp").forward(request1, response);
                } else {
                    chain.doFilter(request1, response);
                }
            }else {
                request1.setAttribute("msg", "<font color='red'>请登录！</font>");
                request1.getRequestDispatcher("login.jsp").forward(request1, response);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
