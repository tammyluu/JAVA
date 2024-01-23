<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1> Login Form</h1>
<form action="cal" method="get">
    enter username : <input type="text"  name="user"/><br/>
    enter password : <input type="password"  name="pw"/><br/>
    <input type="submit" value="Login"/>
</form><form action="toto" method="get">
    enter num1 : <input type="text"  name="num1"/><br/>
    enter num2 : <input type="text"  name="num2"/><br/>
    <input type="submit" value="SUM"/>
</form>
<br/>
<a href="toto">Hello Servlet</a>
</body>
</html>