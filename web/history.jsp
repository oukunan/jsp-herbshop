<%-- 
    Document   : herbDetail
    Created on : Nov 13, 2016, 2:00:33 PM
    Author     : KN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="css/animate.css">
        <title>History</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container animated fadeIn">
            <div class="row">
                <div class="col-md-12">
                    <h1>History</h1>
                    <table class="table table-striped">
                        <tr>
                            <th>Cart Id</th>
                            <th>Total Money (Baht)</th>
                            <th>Date</th>
                        </tr>
                        <c:forEach items="${carts}" var="c" varStatus="vs">
                            <tr>
                                <td><a href="ViewHistoryDetail?cartId=${c.cartId}">${c.cartId}</a></td>
                                <td >${c.totalMoney}</td>
                                <td>${c.date}</td>
                            </tr>
                        </c:forEach>

                    </table><br>
                    <button class="btn btn-inverse" onclick="history.back()">Back </button>
                    <br><br>
                </div><br>
            </div>
        </div>
    </body>
</html>
