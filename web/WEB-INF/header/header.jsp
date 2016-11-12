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
    <nav role="navigation" class="navbar navbar-default">
        <div class="navbar-header">
            <button data-target="#navbar-collapse-08" data-toggle="collapse" class="navbar-toggle" type="button">
            </button>
            <a href="#" class="navbar-brand">IT21- HerbShop</a>
        </div>
        <div id="navbar-collapse-08" class="collapse navbar-collapse">
            <p class="navbar-text navbar-right">Hello, <c:out value="${user.custName}" default="Guest" />
        </div>
    </nav>
