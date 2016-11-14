<%-- 
    Document   : fruit
    Created on : Nov 13, 2016, 1:06:50 AM
    Author     : KN
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/animate.css">

        <title>.:: Food ::.</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container animated fadeIn">
            <div class="row">
                <form action="SearchFood" method="post" class="form-inline">
                    <div class="form-group">
                        <label for="name">Food Name : </label>
                        <input type="text" class="form-control" id="name" name="searchText" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-primary">Go</button>
                    <a href="index.jsp" <button type="button" class="btn btn-inverse">Back</button></a>
                </form>
            </div><br><br>
            <div class="row">
                <c:forEach items="${food}" var="f">
                    <div class="col-md-4 text-center">
                        <img src='images/food/${f.foodId}.jpg' alt="pic" height="200" class="img-rounded"><br><br>
                        <p> Name : ${f.foodName} </p>
                        <a href="ViewFoodDetail?id=${f.foodId}"><p class="btn btn-primary ">Detail</p></a>
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
