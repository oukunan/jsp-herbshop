<%-- 
    Document   : typeHerb
    Created on : Nov 12, 2016, 8:44:52 PM
    Author     : KN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/animate.css">

        <title>.:: HERB TYPE ::.</title>
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container"> <br><br>
            <div class="row">
                <div class="col-md-6 text-center animated bounceIn">
                    <img src="images/1.png"   alt="veget" height="250"><br><br>
                    <a href="SearchHerbTypeVegetable" class="btn btn btn-inverse btn-hg ">Vegetable (ผัก)</a><br>
                </div>
                <div class="col-md-6 text-center animated bounceIn">
                    <img src="images/2.png" alt="fruit"  height="250"><br><br>
                    <a href="SearchHerbTypeFruit" class="btn btn-inverse btn-hg "> Fruit (ผลไม้)</a>
                </div>
            </div>
        </div>
    </body>
</html>
