<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/Common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>GauNhoiBom Shop</title>

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="<c:url value='template/web/css/bootstrap.min.css' />" type="text/css"/>
    <link rel="stylesheet" href="<c:url value='template/web/css/font-awesome.min.css'/>" type="text/css"/>
    <link rel="stylesheet" href="<c:url value='template/web/css/themify-icons.css'/>" type="text/css"/>
    <link rel="stylesheet" href="<c:url value='template/web/css/elegant-icons.css'/>" type="text/css"/>
    <link rel="stylesheet" href="<c:url value='template/web/css/owl.carousel.min.css'/>" type="text/css"/>
    <link rel="stylesheet" href="<c:url value='template/web/css/nice-select.css'/>" type="text/css"/>
    <link rel="stylesheet" href="<c:url value='template/web/css/jquery-ui.min.css'/>" type="text/css"/>
    <link rel="stylesheet" href="<c:url value='template/web/css/slicknav.min.css'/>" type="text/css"/>
    <link rel="stylesheet" href="<c:url value='template/web/css/style.css'/>" type="text/css"/>
</head>
<body>
<!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>

    <!-- Header Section Begin -->
    <%@include file="/Common/web/Header.jsp" %>
    <!-- Header End -->
    
    <!-- Body Begin -->
    <dec:body/>
    <!-- Body End -->
    
    <!-- Footer Section Begin -->
    <%@include file="/Common/web/Footer.jsp" %>
    <!-- Footer Section End -->
    
    <!-- Js Plugins -->
    <script src="<c:url value='template/web/js/jquery-3.3.1.min.js'/>"></script>
    <script src="<c:url value='template/web/js/bootstrap.min.js'/>"></script>
    <script src="<c:url value='template/web/js/jquery-ui.min.js'/>"></script>
    <script src="<c:url value='template/web/js/jquery.countdown.min.js'/>"></script>
    <script src="<c:url value='template/web/js/jquery.nice-select.min.js'/>"></script>
    <script src="<c:url value='template/web/js/jquery.zoom.min.js'/>"></script>
    <script src="<c:url value='template/web/js/jquery.dd.min.js'/>"></script>
    <script src="<c:url value='template/web/js/jquery.slicknav.js'/>"></script>
    <script src="<c:url value='template/web/js/owl.carousel.min.js'/>"></script>
    <script src="<c:url value='template/web/js/main.js'/>"></script>
</body>
</html>