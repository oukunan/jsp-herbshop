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
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container">
            <div class="row">
                <form action="SearchFood" method="post" class="form-inline">
                    <div class="form-group">
                        <label for="name">Search : </label>
                        <input type="text" class="form-control" id="name" placeholder="Search">
                    </div>
                    <button type="submit" class="btn btn-primary">Go</button>
                </form>
            </div><br><br>
            <div class="row">
                <c:forEach items="${foods}" var="f">
                    <div class="col-md-4 text-center">
                       <p> Name : ${f.foodName} </p>
                       <p> Recipe :  ${f.foodRecipe} </p>
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
