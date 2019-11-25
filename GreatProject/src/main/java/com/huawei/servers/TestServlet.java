package com.huawei.servers;

import org.springframework.web.context.WebApplicationContext;
import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        System.out.println("oooohhahah");
        Cookie[] cookies = req.getCookies();
        if(cookies!=null){
            for (Cookie cookie : cookies) {
                resp.getWriter().println("name:"+cookie.getName());
                resp.getWriter().println("value:"+cookie.getValue());
                System.out.println(cookie.getName());
            }
        }
        WebApplicationContext servletContext = (WebApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        Object user = servletContext.getBean("userDaoImpl");
        resp.getWriter().println("username 是："+user);

        //super.doGet(req, resp);

        resp.getWriter().println("爱你哦 ^_^");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
    }
}
