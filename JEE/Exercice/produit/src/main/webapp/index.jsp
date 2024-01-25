<%@ page import="jakarta.servlet.http.HttpSession" %>
<%@ page import="com.example.produit.servlet.Constants" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="com.example.produit.servlet.Constants" %>
<!DOCTYPE html>
<html>
<head>
    <title>Produits</title>
</head>
<body>
<h1><%= "HomePage" %>
</h1>
<br/>
<%
        HttpSession session1 = request.getSession();
     String username = session1.getAttribute(Constants.USER_LOGGED).toString();
     String contextPath = request.getContextPath();
    if (username != null && username.length()> 0){
        //islogged
        out.print("<a href='" + contextPath+ "/logout'>LOG OUT </a>");
    }else {
        //logout
       out.print("<a href='" + contextPath+ "/login-form'>LOG In </a>");
    }
%>
<a href="produit">Liste de produits</a><br>
<a href="add-produit-form.jsp">Ajouter un produit</a><br>
<a href="by-price.jsp">Filtre produit > 20 €</a><br>
<a href="login-form.jsp">LOGIN </a><br>
<a href="register.jsp">Register</a><br>
<a href="uploadfile.jsp">Upload File</a>
</body>
</html>