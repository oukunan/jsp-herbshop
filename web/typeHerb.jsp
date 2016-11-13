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
        <title>JSP Page</title>
    </head>
    <body>
               <jsp:include page="/WEB-INF/header/header.jsp"/>
               <div class="container"> 
                   <div class="row">
                       <div class="col-md-4 col-md-offset-4 text-center">
                           <a href="SearchHerbTypeVegetable" class="btn btn-default navbar-btn btn-primary">Vegetable (ผัก)</a><br>
                           <a href="SearchHerbTypeFruit" class="btn btn-default navbar-btn btn-primary"> Fruit (ผลไม้)</a>
                       </div>
                   </div>
               </div>
    </body>
</html>
