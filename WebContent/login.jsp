<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
</head>
<body>
	<form action="AdminLoginServlet"  method="post">
	<div	style="text-align: center;">
		<h1>管理员ID：<input type="text"  name="aid"  id="aid"  value="admin"/></h1><br>
		<h1>管理员密码：<input type="password"  name="password"  id="password"  value="bigboss"/></h1><br>
		<input type="submit" value="登录">	</div>
	</form>
</body>
</html>