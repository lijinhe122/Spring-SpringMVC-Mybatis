<%--
  Created by IntelliJ IDEA.
  User: lijinhe
  Date: 2020/10/31
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  方案二
  <form action="${pageContext.request.contextPath}/testssm/user2" method="post">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="submit" value="提交">
  </form>
  </body>
</html>
