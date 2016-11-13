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
        <c:choose>
            <c:when test="${CART==null || CART.size==0}">
                <h3 style="color:red;margin-left: 100px">Session Timeout ... 
                    <a href="ProductListing.jsp"><input style="font-size: small" type="button" value="Continue Shopping"/></a></h3>
                    </c:when>
                    <c:otherwise>
                <form action="UpdateCart" method="post">
                    <table style="margin-left: 100px;width: 98%">
                        <tr><td>
                                <table style="width: 800px;" class="table">
                                    <tr style="text-height: 24pt; background-color: wheat">
                                        <td> No </td>
                                        <td> Description </td>
                                        <td> Unit Price </td>
                                        <td> Quantity </td>
                                        <td> Total price </td>
                                        <td> Delete </td>
                                    </tr>
                                    <c:forEach items="${CART.items}" var="it" varStatus="vs">
                                        <tr>
                                            <td> ${vs.count} </td>
                                            <td> ${it.value.herbs.herbName} </td>
                                            <td  style="text-align: right; padding-right: 50px"> <fmt:formatNumber value="${it.value.herbs.herbPrice}" pattern="#,###.00"/></td>
                                            <td> 
                                                <input type="number" min="1" value="${it.value.herbAmount}" name="_${it.key}" 
                                                       style="width: 50px; text-align: center"/> 
                                            </td>
                                            <td style="text-align: right">
                                                <fmt:formatNumber value="${it.value.total}" pattern="#,###.00"/>  
                                            </td>
                                            <td style="text-align: center">
                                                <input type="checkbox" value="${it.value.herbs.herbId}" name="deleteItem"/>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                    <tr>
                                        <td colspan="6"> <hr> </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">
                                            <input type="submit" value="Update Cart"/> &nbsp; 
                                            <a href="ProcessOrder"><input type="button" value="Checkout"/></a>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                                            <a href="typeHerb.jsp"><input type="button" value="Continue Shopping"/></a>
                                        </td>
                                        <td colspan="2" style="text-align: right">Total All :  </td>
                                        <td style="text-align: right"> <fmt:formatNumber value="${CART.totalPrice}" pattern="#,###.00"/></td>
                                        <td></td>
                                    </tr>
                                </table>
                            </td></tr>
                    </table>
                </form>
            </c:otherwise>
        </c:choose>
        </div>    
    </body>
</html>
