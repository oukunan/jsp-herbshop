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
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4  ">
                    <h1 class="text-primary">HERB_SHOP</h1>
                </div>
            </div><br>
            <div class="row">
                <div class="col-md-4 text-center">
                    <img src="#" alt="pic1" width="300" height="300" /><br>
                    <a href="#" class="btn btn-default navbar-btn btn-primary">Herb (สมุนไพร)</a>
                </div>
                <div class="col-md-4 text-center">
                    <img src="#" alt="pic2"  width="300" height="300" /><br>
                    <a href="#" class="btn btn-default navbar-btn btn-primary">Diseases (อาการ)</a>
                </div>
                <div class="col-md-4 text-center">
                    <img src="#" alt="pic3" width="300" height="300" /><br>
                    <a href="#" class="btn btn-default navbar-btn btn-primary">Food (อาหาร)</a>
                </div>
            </div>
        </div>
    </body>
</html>
