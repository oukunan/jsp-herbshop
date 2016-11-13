<%-- 
    Document   : login
    Created on : Nov 11, 2016, 9:50:24 PM
    Author     : KN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/flat-ui.css">    
        <style>
            .pad {
                padding: 20px;
                margin: 10px;
            }
            button {
                margin: 10px;
            }
        </style>
    </head>

    <body style="background-color: #eee">
        <div class="container"><br><br>
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <h2> Login  | </h2><br>
                    <form action="Login" method="post">
                        <input type="text" class="form-control pad" name="userName" value="" placeholder="User Name">
                        <input type="password" class="form-control pad" name="password" value="" placeholder="Password"><br>
                        <button type="submit" class="btn btn-primary">Login</button>
                        <a href="register.jsp"><button type="button" class="btn btn-inverse">Register</button></a>
                                            <a href="index.jsp"><button type="button" class="btn btn-default" >Back</button></a>

                    </form>

                </div>
            </div>
        </div><br>
        <div class="row">
            <div class="col-md-4 col-md-offset-5">
                <p class="text-danger">${message}</p>
            </div>
        </div>
    </body>

</html>
