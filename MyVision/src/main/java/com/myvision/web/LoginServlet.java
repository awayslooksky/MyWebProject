package com.myvision.web;

import com.myvision.bean.User;
import com.myvision.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("我执行了");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //使用spring去获取user类
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        User user = (User) context.getBean("user");
        //User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserService userService = new UserService();
        User user1 = userService.loginVerify(user);
        HttpSession session = req.getSession();
        if(user1 !=null){
            session.setAttribute("status",username+":1");
            //System.out.println(user1.toString());
            // 使用重定向跳转到 首页 index.html
            resp.sendRedirect("index.jsp");
        }else {
            // 使用请求转发跳转到登录页面, 且提示错误信息
            req.setAttribute("msg","<font color='red'>用户名或密码错误!</font>");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
