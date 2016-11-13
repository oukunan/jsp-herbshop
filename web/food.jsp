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
        <title>.:: Food ::.</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container">
            <div class="row">
                <form action="SearchFood" method="post" class="form-inline">
                    <div class="form-group">

                        <label for="name">Food Name : </label>
                        <input type="text" class="form-control" id="name" name="searchText" placeholder="Search">

                    </div>
                    <button type="submit" class="btn btn-primary">Go</button>
                </form>
            </div><br><br>
            <div class="row">
                <c:forEach items="${food}" var="f">
                    <div class="col-md-4 text-center">
                       <img src="#" alt="pic" height="200">
                       <p> Name : ${f.foodName} </p>
                       <p> Recipe :  ${f.foodRecipe} </p>
                        <a href="ViewFoodDetail?id=${f.foodId}"><p class="btn btn-primary ">Detail</p></a>
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
