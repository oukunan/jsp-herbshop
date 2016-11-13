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
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container">
            <h3>Disease Detail</h3>
            <table>
                <tr>
                    <td>Disease ID :  &nbsp; </td>
                    <td><input type="text" class="form-control" name="diseId" value="${d.diseId}" ></td>
                </tr>
                <tr>
                    <td>Name :  &nbsp; </td>
                    <td><input type="text" class="form-control" name="diseName" value="${d.diseName}" ></td>
                </tr>
                <tr>
                    <td>Type :  &nbsp; </td>
                    <td><input type="text" class="form-control" name="diseType" value="${d.diseType}" ></td>
                </tr>
                <tr>
                    <td>Position :  &nbsp; </td>
                    <td><input type="text" class="form-control" name="positionInBody" value="${d.positionInBody}" ></td>
                </tr>
                <tr>
                    <td>Detail :  &nbsp; </td>
                    <td><textarea  style="width: 500px" rows="4" class="form-control">${d.diseDetail}</textarea>  </td>
                </tr>
            </table><br><br>
            <button class="btn btn-inverse" onclick="history.back()">Back </button>
        </div>
    </body>
</html>
