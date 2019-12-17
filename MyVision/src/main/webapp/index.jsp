<%--
  Created by IntelliJ IDEA.
  User: 梁瑞腾
  Date: 2019/11/17
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <%
        String status = (String)session.getAttribute("status");
        if(status !=null ){
            String[] split = status.split("\\:");
            if(split[1].equals("1")){
    %>
        <h1>欢迎，<%=split[0]%></h1>
    <%
            }
        }
    %>
    <a href="http://www.baidu.com">百度</a>
    <%
        // 脚本片段: 使用循环判断等方法内的一段代码
        for(int i=1; i<=2; i++) {
    %>
        <h1><%="你们真的太棒啦"%></h1>
        <%="hahah"%>
    <% } %>

    <%
        out.print("out输出1 <br/>");
        response.getWriter().println("response输出1 <br/>");
    %>


</body>
</html>
