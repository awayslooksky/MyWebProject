<%--
  Created by IntelliJ IDEA.
  User: 梁瑞腾
  Date: 2019/11/27
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
</head>
<body>
    <form action="login" method="post">
        <table>
            <tr>
                <td></td>
                <td>${requestScope.msg }</td>
            </tr>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <input type="submit" value="登录"/>
                    <a href="">注册</a>
                </td>
            </tr>

        </table>
    </form>
</body>
</html>
