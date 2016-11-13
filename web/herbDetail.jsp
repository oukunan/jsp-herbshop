<%-- 
    Document   : herbDetail
    Created on : Nov 13, 2016, 2:00:33 PM
    Author     : KN
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.:: Herb Detail ::.</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container">
            <h3>Herb Detail</h3>
            <table>
                <tr>
                    <td>Herb ID :  &nbsp; </td>
                    <td><input type="text" class="form-control" name="herbId" value="${h.herbId}" ></td>
                </tr>
                <tr>
                    <td>Name :  &nbsp; </td>
                    <td><input type="text" class="form-control" name="herbName" value="${h.herbName}" ></td>
                </tr>
                <tr>
                    <td> Price :  &nbsp; </td>
                    <td><input type="text" class="form-control" name="herbPrice" value="<fmt:formatNumber value="${h.herbPrice}" type="currency" />" ></td>
                </tr>
                <tr>
                    <td>Type :  &nbsp; </td>
                    <td><input type="text" class="form-control" name="herbType" value="${h.herbType}" ></td>
                </tr>
                <tr>
                    <td>Detail :  &nbsp; </td>
                    <td><textarea  style="width: 500px" rows="4" class="form-control">${h.herbDetail}</textarea>  </td>
                </tr>
                <tr>
                    <td>Disease :  &nbsp; </td>
                    <td>ช่องนี่นาจา</td>
                </tr>
            </table><br><br>
            <button class="btn btn-inverse" onclick="history.back()">Back </button>
        </div>
    </body>
</html>
