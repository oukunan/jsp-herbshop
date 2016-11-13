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
                <table class="table table-bordered">
                    <tr>
                        <td>No</td>
                        <td>Herb Name</td>
                        <td>Unit Price</td>
                        <td>Quantity(kg)</td>
                        <td>Total price</td>
                        <td>Delete</td>
                    </tr>
                    <c:forEach items="${CART.items}" var="it" varStatus="vs">
                        <tr>
                            <td> ${vs.count} </td>
                            <td> ${it.value.herb.herbName} </td>
                            <td  style="text-align: right;"> <fmt:formatNumber value="${it.value.herb.herbPrice}" pattern="#,###.00"/></td>
                            <td> 
                                <input type="number" min="1" step="0.1" value="${it.value.quantityOfHerb}" name="_${it.key}" /> 
                            </td>
                            <td style="text-align: right">
                                <fmt:formatNumber value="${it.value.price}" pattern="#,###.00"/>  
                            </td>
                            <td style="text-align: center">
                                <input type="checkbox" value="${it.value.herb.herbId}" name="deleteItem"/>
                            </td>
                        </tr>
                    </c:forEach>
                    <tr>

                    </tr>
                </table>
                <div class="pull-right">
                    Money:  &nbsp;&nbsp;<fmt:formatNumber value="${CART.money}"/> Baht<br>
                        VAT 7%: &nbsp;&nbsp;+<fmt:formatNumber value="${CART.vatAmount}"/> Baht <br>
                        Total All : &nbsp;&nbsp;<fmt:formatNumber value="${CART.totalMoney}"/> Baht<br><br>
                </div>      
                <input type="submit" class="btn btn-inverse " value="Update Cart"/> 
                <a href="ProcessOrder"><input type="button" value="Checkout" class="btn btn-primary"/></a>
                <a href="typeHerb.jsp"><input type="button" value="Continue Shopping" class="btn btn-info"/></a>


            </form>
        </div>    
    </body>
</html>
