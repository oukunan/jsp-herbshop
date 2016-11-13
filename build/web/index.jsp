<%-- 
    Document   : index
    Created on : Nov 12, 2016, 3:21:14 PM
    Author     : KN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IT21-HerbShop</title>
        <link rel="stylesheet" href="css/animate.css">
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container animated fadeIn" id="edit">
            <div class="row">
                <div class="col-md-4 col-md-offset-4 wow">
                    <h1 class="">HERB_SHOP</h1>
                </div>
            </div><br>
            <div class="row">
                <div class="col-md-4 text-center">
                    <img src="images/6.png"  height="250" alt="pic1" /><br><br>
                    <a href="typeHerb.jsp" class="btn btn-default navbar-btn btn-primary">Herb (สมุนไพร)</a>
                </div>
                <div class="col-md-4 text-center">
                    <img src="images/3.png" height="250"  alt="pic2"  width="300" height="300" /><br><br>
                    <a href="SearchDisease" class="btn btn-default navbar-btn btn-primary">Diseases (อาการ)</a>
                </div>
                <div class="col-md-4 text-center">
                    <img src="images/5.png" height="250"  alt="pic3" width="300" height="300" /><br><br>
                    <a href="SearchFood" class="btn btn-default navbar-btn btn-primary">Food (อาหาร)</a>
                </div>
            </div>
        </div>
        
        <script src="js/wow.min.js"></script>
        <script>
            new WOW().init();
        </script>
    </body>
</html>
