package com.myvision.web;

import com.myvision.bean.User;
import com.myvision.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        UserService userService = new UserService();
        User user1 = userService.loginVerify(user);
        if(user1 !=null){
            // 使用重定向跳转到 首页 index.html
            resp.sendRedirect("practice_one.jsp");
        }else {
            // 使用请求转发跳转到 登录页面, 且 提示错误信息
            req.setAttribute("msg","<font color='red'>用户名或密码错误!</font>");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
