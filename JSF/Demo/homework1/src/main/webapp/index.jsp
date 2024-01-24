<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1> Home Page</h1>
<h1> Login Form</h1>
<form action="login" method="get">
    enter username : <input type="text"  name="user"/><br/>
    enter password : <input type="password"  name="pw"/><br/>
    <input type="submit" value="Login"/>
</form>
<h1>Calculator</h1>
<form action="calculate" method="get">
    enter num1 : <input type="text"  name="num1"/><br/>
    enter num2 : <input type="text"  name="num2"/><br/>
    <select name="op">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <input type="submit" value="Calculate"/>
</form>

<br/>
<a href="toto">Test</a><br>

</body>
</html>