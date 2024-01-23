<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 23/01/2024
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajouter un produit</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h2>Formulaire de création d'une personne</h2>
    <form action="produit" method="post">
        <div class="mb-3">
            <label for="marque" class="form-label">Marque : </label>
            <input type="text" class="form-control" id="marque" name="marque"></div>
        <div class="mb-3">
            <label for="ref" class="form-label">Reférence :</label>
            <input type="text" class="form-control" id="ref" name="ref">
        </div>
        <div class="mb-3">
            <label for="dateAchat" class="form-label">Date d'achat :</label>
            <input type="date" class="form-control" id="dateAchat" name="dateAchat">
        </div>
        <div class="mb-3">
            <label for="prix" class="form-label">Prix unitaire :</label>
            <input type="number" class="form-control" id="prix" name="prix">
        </div>
        <div class="mb-3">
            <label for="stock" class="form-label">Stock :</label>
            <input type="number" class="form-control" id="stock" name="stock">
        </div>
        <button type="submit" class="btn btn-primary">Créer</button>
    </form>
</div>
</body>
</html>
