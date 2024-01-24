
<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 23/01/2024
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail de produit</title>
</head>
<body>
<h1>>>Detail d'un produit</h1>
<label>Marque: </label>
<c:out value="${produit.getMarque()}"></c:out><br>
<label>Référence: </label>
<c:out value="${produit.getReference()}"></c:out><br>
<label>Prix  </label>
<c:out value="${produit.getPrix()}"></c:out><br>
<label>Stock </label>
<c:out value="${produit.getStock()}"></c:out>






</body>
</html>
