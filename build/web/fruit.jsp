<%-- 
    Document   : fruit
    Created on : Nov 13, 2016, 1:06:50 AM
    Author     : KN
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <form action="SearchHerbTypeFruit" method="post" class="form-inline">
                    <div class="form-group">

                        <label for="name">Fruit Name : </label>
                        <input type="text" class="form-control" id="name" name="searchText" placeholder="Search">

                    </div>
                    <button type="submit" class="btn btn-primary">Go</button>
                </form>
            </div>
            
            <c:if test="${fruit != null}">
                <div class="row">
                    <div class="col-md-4 col-md-offset-8 text-right">
                        <form action="AddToCart" method="post">
                            <input type="submit"  class="btn btn-info" value="Add to Cart"/>
                        </form>
                    </div>

                </div><br>
                <div class="row">
                    <c:forEach items="${fruit}" var="f">
                        <div class="col-md-4 text-center">
                            <p> Name : ${f.herbName} </p>
                            <p> Price :  <fmt:formatNumber value="${f.herbPrice}" type="currency" /> </p>
                            <a href="ViewHerbDetail?id=${f.herbId}"><p class="btn btn-success "> Detail</p></a>
                            <p class=" btn btn btn-inverse">Add to Cart &nbsp;<input type="checkbox"  name="pid" value="${f.herbId}" title="Add to Cart"/> </p>
                        </div>
                    </c:forEach>
                </div>
            </c:if>   
        </div>
    </body>
</html>
