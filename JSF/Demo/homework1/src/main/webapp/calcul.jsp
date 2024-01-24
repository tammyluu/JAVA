<%--
  Created by IntelliJ IDEA.
  User: luuta
  Date: 1/23/2024
  Time: 7:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Math Form</title>
</head>
<body>

<form action="calculate" method="get">
    enter num1 : <input type="text"  name="num1"/><br/>
    enter num2 : <input type="text"  name="num2"/><br/>
    <select name="op">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select><br>
    <input type="submit" value="CACULATE"/>
</form>
<br/>

</body>
</html>
