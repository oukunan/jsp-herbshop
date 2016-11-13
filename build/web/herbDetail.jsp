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
        <title>.:: Herb Detail ::.</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container">
            <div class="row">
                <div class="col-md-8">
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
                            <td><textarea  style="width: 500px" rows="3" class="form-control">${h.herbDetail}</textarea>  </td>
                        </tr><br>
                        <tr>
                            <td>Disease :</td>
                            <td>
                                <c:forEach items="${dise}" var="d">
                                    <a href='ViewDiseasesDetail?id=${d.diseId}'>${d.diseName}</a>,
                                </c:forEach>
                            </td>
                        </tr>
                        <tr>
                            <td>Food :</td>
                            <td>
                                <c:forEach items="${food}" var="f">
                                    <a href='ViewFoodDetail?id=${f.foodId}'>${f.foodName}</a>,
                                </c:forEach>
                            </td>
                        </tr>
                    </table><br><br>
                    <button class="btn btn-inverse" onclick="history.back()">Back </button>
                </div>
                <div class="col-md-4 text-center">
                    <img src='images/${h.herbType.toLowerCase()}/${h.herbId}.jpg' alt="pic" height="400">
                </div>
            </div>
        </div>
    </body>
</html>
