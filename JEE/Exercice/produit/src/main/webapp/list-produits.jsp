<%--

--%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Produits</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<h1> La liste de Produits</h1>
<!-- On tables -->
<table class="table table-light table-striped mt-3">
    <thead>
    <tr>
        <!-- On rows -->

        <th scope="col">Marque</th>
        <th scope="col">Reference</th>
        <th scope="col">Prix</th>
        <th scope="col">Stock</th>
        <th scope="col">Détails</th>
        <th scope="col">Supprimer</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${produits}" var="produit">
        <tr>
            <td>${produit.getMarque()}</td>
            <td>${produit.getReference()}</td>
            <td>${produit.getPrix()} €</td>
            <td>${produit.getStock()}</td>
            <td>
                <button type="button" class="btn">
                    <a href="produitDetail?marque=${produit.getId()}">Détails</a>
                </button>
                <button type="button" class="btn ">
                    <a href="produitDetail?marque=${produit.getMarque()}">Supprimer</a>
                </button>
            </td>
        </tr>
        <!-- Détails du produit -->
        <tr>
            <td colspan="5"> <!-- colspan="5" pour étendre sur toutes les colonnes -->
                <c:if test="${not empty produit_detail}">
                    <div>
                        <p>Marque    : ${produit_detail.marque}</p>
                        <p>Référence : ${produit_detail.reference}</p>
                        <p>Prix      : ${produit_detail.prix}</p>
                        <p>Stock     : ${produit_detail.stock}</p>
                    </div>
                </c:if>

                <c:if test="${not empty erreurMessage}">
                    <p>${erreurMessage}</p>
                </c:if>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>

<!-- On tables -->

<h2> Liste produits</h2>

           <c:forEach items="${produits}" var="produit">
               <div>
                   Marque    : ${produit.getMarque()}
                   Reférence : ${produit.getReference()}
                   Prix : ${produit.getPrix()}
                   Stock : ${produit.getStock()}

               </div>
           </c:forEach>
<h2>Afficher la liste des produits dont le prix est supérieur à 20 euros</h2>
<c:forEach items="${produitFiltre}" var="prod">
    <div>
        Marque    : ${prod.getMarque()}
        Référence : ${prod.getReference()}
        Prix      : ${prod.getPrix()}
        Stock     : ${prod.getStock()}
    </div>
</c:forEach>
<h2>Détails du produit</h2>

<c:if test="${not empty produit_detail}">
    <div>
        <p>Marque    : ${produit_detail.marque}</p>
        <p>Référence : ${produit_detail.reference}</p>
        <p>Prix      : ${produit_detail.prix}</p>
        <p>Stock     : ${produit_detail.stock}</p>
    </div>
</c:if>

<c:if test="${not empty erreurMessage}">
    <p>${erreurMessage}</p>
</c:if>


</body>
</html>
