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

        <title>History ${cart.cartId}</title>
    </head>
    <body >
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <br>
        <div class="container">
            <h1>Cart ID: ${ca.cartId}</h1>
            <h4>Date: ${ca.date.substring(0,19)}</h4>
            <form action="UpdateCart" method="post">
                <table class="table table-bordered table-striped">
                    <tr>
                        <th>No</th>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>Total</th>
                    </tr>
                    <c:forEach items="${cds}" var="cd" varStatus="vs">
                        <tr>
                            <td>${vs.count}</td>
                            <td>${cd.herb.herbName}</td>
                            <td>${cd.herb.herbPrice}</td>
                            <td>${cd.quantityOfHerb}</td>
                            <td>${cd.price}</td>
                        </tr>
                    </c:forEach>
                </table>  
                <div class="pull-right">
                    <p class="text"><b>Money : </b> ${ca.money} Bath</p>
                    <p class="text"><b>Vat :</b> ${ca.vatAmount} Baht</p>
                    <p class="text-info"><b>Total Money : </b> ${ca.totalMoney} Bath</p>
                </div>
                <a href="typeHerb.jsp"><input type="button" value="Continue Shopping" class="btn btn-info"/></a>
                <button type="button" onclick="history.back()" class="btn btn-inverse">Back</button>
            </form>
        </div>    
    </body>
</html>
