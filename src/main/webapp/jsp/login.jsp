<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/28
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/log.do"
      method="post">
    <!--<input type="hidden" name="id"/>-->
    用户姓名：<input type="text" name="username"/>
    用户密码：<input type="text" name="password"/>
    <input type="submit" value="提交" />
</form>
</body>
</html>
