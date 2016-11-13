<%-- 
    Document   : register
    Created on : Nov 13, 2016, 9:15:14 PM
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
                <div class="col-md-4 col-md-offset-4">
                    <h1>Register</h1>
                    <form action="RegisterMember" method="post" class="for" >
                        Username <input type="text" class="form-control" name="username" >
                        Password <input type="password" class="form-control"  name="password">
                        Name<input type="text" class="form-control" id="name" name="name">
                        Surname <input type="text" class="form-control"  name="surname">
                        Address <input type="text" class="form-control"  name="address">
                        State <input type="text" class="form-control"  name="state">
                        City <input type="text" class="form-control" name="city">
                        Postal <input type="text" class="form-control"  name="postals">
                        Tel <input type="number" class="form-control"  name="tel"><br>
                        <input type="submit" class="btn btn-primary text-center"  name="Register">
                    </form>
                    <br>
                </div>
            </div>
        </div>
    </body>
</html>
