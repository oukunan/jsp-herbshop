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
                            <td>ID  :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="custId" value="${user.custId}"></td>
                        </tr>
                        <tr>
                            <td> Name :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="custName" value="${user.custName}"></td>
                        </tr>
                        <tr>
                            <td> Surname :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="custSurname" value="${user.custSurname}" ></td>
                        </tr>
                        <tr>
                            <td>Address :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="custAddress" value="${user.custAddress}" >  </td>
                        </tr>
                        <tr>
                            <td>State :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="custState" value="${user.custState}" >  </td>
                        </tr>
                        <tr>
                            <td>City :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="custCity" value="${user.custCity}" >  </td>
                        </tr>
                        <tr>
                            <td>Postal :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="custPostal" value="${user.custPostal}" >  </td>
                        </tr>
                        <tr>
                            <td>Tel :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="custTel" value="${user.custTel}" >  </td>
                        </tr>
                    </table><br><br>
                    <button class="btn btn-inverse" onclick="history.back()">Back </button>
                </div><br>
            </div>
        </div>
    </body>
</html>
