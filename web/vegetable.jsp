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

        <title>Search Vegetable </title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container">
            <div class="row animated fadeIn">
                <form action="SearchHerbTypeVegetable" method="post" class="form-inline">
                    <div class="form-group">

                        <label for="name">Vegetable Name : </label>
                        <input type="text" class="form-control" id="name" name="searchText" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-primary">Go</button>
                    <a href="typeHerb.jsp" <button type="button" class="btn btn-inverse">Back</button></a>
                </form>
            </div>

            <c:if test="${vegetable != null}">
                <div class="row wow fadeIn">
                    <br>
                    <div class="row">
                        <form action="AddToCart" method="post">
                            <c:forEach items="${vegetable}" var="v">

                                <div class="col-md-4 text-center" style="margin-bottom: 50px">
                                    <img src='images/vegetable/${v.herbId}.jpg' alt="pic" height="200" class="img-rounded"><br><br>
                                    <p> Name : ${v.herbName} </p>
                                    <p> Price :  <fmt:formatNumber value="${v.herbPrice}" type="currency" /> </p>
                                    <a href="ViewHerbDetail?id=${v.herbId}"><p class="btn btn-success "> Detail</p></a>
                                    <button class="btn btn-inverse"  type="submit" name="pid" value="${v.herbId}"  ${v.herbAmount == 0 ? "disabled" : ""}>${v.herbAmount == 0 ? "Out of Stock" : "Add to Cart"}</button>                                    
                                    <input type="hidden" name="type" value="vegetable"> 
                                </div>
                            </c:forEach>
                        </form>
                    </div>
                </c:if>   
            </div>  

            <script src="js/wow.min.js"></script>
            <script>
                new WOW().init();
            </script>
    </body>
</html>
