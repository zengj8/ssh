<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
<form action="register" method="post">
	学号：<input type="text" name="user.id"/><br />
	密码：<input type="password" name="user.password"/><br />
	姓名：<input type="text" name="user.name"/><br />
	年龄：<input type="text" name="user.age" /><br />
	性别：<input type="text" name="user.sex" /><br />
	<input type="submit" value="注册" />
</form>
</body>
</html>