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
        <title>.:: Customer Detail ::.</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container">
            <div class="row">
                <div class="col-md-7">
                    <h3>Profile</h3>
                    <table>
                        <tr>
                            <td><strong>ID</strong>  :  &nbsp; </td>
                            <td>${user.custId}</td>
                        </tr>
                        <tr>
                            <td><strong>Name</strong> :  &nbsp; </td>
                            <td>${user.custName}</td>
                        </tr>
                        <tr>
                            <td><strong>Surname</strong> :  &nbsp; </td>
                            <td>${user.custSurname}</td>
                        </tr>
                        <tr>
                            <td><strong>Address</strong> :  &nbsp; </td>
                            <td>${user.custAddress}</td>
                        </tr>
                        <tr>
                            <td><strong>State</strong> :  &nbsp; </td>
                            <td>${user.custState}</td>
                        </tr>
                        <tr>
                            <td><strong>City</strong> :  &nbsp; </td>
                            <td>${user.custCity} </td>
                        </tr>
                        <tr>
                            <td><strong>Postal</strong> :  &nbsp; </td>
                            <td>${user.custPostal} </td>
                        </tr>
                        <tr>
                            <td><strong>Tel</strong> :  &nbsp; </td>
                            <td>${user.custTel}it</td>
                        </tr>
                    </table><br><br>
                    <button class="btn btn-inverse" onclick="history.back()">Back </button>
                </div><br>
            </div>
        </div>
    </body>
</html>