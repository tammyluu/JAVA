<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 23/01/2024
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detail de produit</title>
</head>
<body>
<body>

<h2>Détails du produit</h2>

<div>
    <p>Marque    : ${produit_detail.marque}</p>
    <p>Référence : ${produit_detail.reference}</p>
    <p>Prix      : ${produit_detail.prix}</p>
    <p>Stock     : ${produit_detail.stock}</p>
</div>

<p>${erreurMessage}</p>

</body>
</html>
