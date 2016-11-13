<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title></title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/flat-ui.css">
    </head>

    <body>
        <c:set var="loginOrLogout" value="${sessionScope.user==null?'Login' : 'Logout'}"/>
        <nav role="navigation" class="navbar navbar-default">
            <div class="navbar-header">
                <button data-target="#navbar-collapse-08" data-toggle="collapse" class="navbar-toggle" type="button">
                </button>
                <a href="index.jsp" class="navbar-brand">IT21- HerbShop</a>
            </div>  

            <div class="col-md-3 col-md-offset-7 ">      
                 <c:if test="${CART != null}">
                    <a href="viewCart.jsp" class="btn">items ( ${CART.size} )
                    </c:if>
                <a href="${loginOrLogout}" class="btn btn-default navbar-btn btn-inverse">${loginOrLogout}</a>
                <p class="navbar-text navbar">Hello, <c:out value="${user.custName}" default="Guest" /> 
            </div>
        </nav>
