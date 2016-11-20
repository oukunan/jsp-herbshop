<%-- 
    Document   : TestCart
    Created on : Oct 22, 2015, 8:33:29 AM
    Author     : KN
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Map"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <title>JSP Page</title>
    </head>
    <body >
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <br>
        <div class="container">
            <form action="UpdateCart" method="post">
                <table class="table table-bordered table-striped">
                    <tr>
                        <td>No</td>
                        <td>Name</td>
                        <td>Price</td>
                        <td>Quantity</td>
                        <td>Total</td>
                    </tr>
                    <c:forEach items="${cds}" var="cd" varStatus="vs">
                        <tr>
                            <td>${vs.count}</td>
                            <td>${cd.herb.herbName}</td>
                            <td>${cd.price}</td>
                            <td>${cd.quantityOfHerb}</td>
                            <td>${cd.price*cd.quantityOfHerb}</td>
                        </tr>
                    </c:forEach>
                </table>  
                <div class="pull-right">
                    <p class="text">${cart.vatAmount}</p>
                    <p class="text-info">${cart.totalMoney}</p>
                </div>
                <a href="typeHerb.jsp"><input type="button" value="Continue Shopping" class="btn btn-info"/></a>
            </form>
        </div>    
    </body>
</html>
