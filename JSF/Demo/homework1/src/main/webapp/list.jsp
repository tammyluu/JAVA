<%@ page import="java.util.List" %>
<%@ page import="models/Student" %>

<%@ page import="com.example.homework1.models.Student" %><%--
  Created by IntelliJ IDEA.
  User: luuta
  Date: 1/23/2024
  Time: 10:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Student</title>
    <table border="1px">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Age</td>
            <td>Gender</td>
        </tr>
        <%
            List<Student> list = (List<Student>) request.getAttribute("data");
            for (Student s: list ) {
        %>
        <tr>
            <td><% = s.getId() %></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tr>
         <%
            }
        %>

    </table>
</head>
<body>

</body>
</html>
