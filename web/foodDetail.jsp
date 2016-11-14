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
            <div class="row">
                <div class="col-md-7">
                    <h3>Food Detail</h3>
                    <table>
                        <tr>
                            <td>Name :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="diseName" value="${f.foodName}" ></td>
                        </tr>
                        <tr>
                            <td>Ingredient :  &nbsp; </td>
                            <td><textarea  style="width: 500px" rows="10" class="form-control">${f.foodRecipe}</textarea></td>
                        </tr>
                        <tr>
                            <td>Detail :  &nbsp; </td>
                            <td><textarea  style="width: 500px" rows="10" class="form-control">${f.foodDetail}</textarea>  </td>
                        </tr>

                    </table><br><br>
                    <button class="btn btn-inverse" onclick="history.back()">Back </button>
                </div>
                <div class="col-md-3 text-center">
                    <br><br><br>
                    <img src='images/food/${f.foodId}.jpg' alt="pic" height="400" class="img-rounded">
                </div>
            </div>
        </div>
    </body>
</html>
