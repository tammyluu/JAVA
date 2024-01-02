<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title><sitemesh:write property="title"/></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Favicon -->
        <link rel="shortcut icon" type="image/x-icon" href="<c:url value='/template/web/assets/img/favicon.ico'/>">

        <!-- CSS
        ========================= -->

        <!-- Plugins CSS -->
        <link rel="stylesheet" href="<c:url value='/template/web/assets/css/plugins.css'/>">

        <!-- Main Style CSS -->
        <link rel="stylesheet" href="<c:url value='/template/web/assets/css/style.css'/>">
        <sitemesh:write property="head"/>
    </head>
    <body>
        <%@ include file="/common/web/header.jsp" %>

        <div class="container">
            <sitemesh:write property="body"/>
        </div>

        <%@ include file="/common/web/footer.jsp" %>

        <!-- JS -->

        <!-- Plugins JS -->
        <script src="<c:url value='/template/web/assets/js/plugins.js'/>"></script>

        <!-- Main JS -->
        <script src="<c:url value='/template/web/assets/js/main.js'/>"></script>
    </body>
</html>