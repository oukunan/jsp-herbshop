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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
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

<body style="background-color: #eae5e5">

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <h2>Please Login [ temporary ] </h2><br>
                <form action="#" method="post">
                    <input type="text" class="form-control pad" name="userName" value="" placeholder="User Name">
                    <input type="password" class="form-control pad" name="password" value="" placeholder="Password"><br>
                    <button type="submit" class="btn btn-primary">Login</button>
                </form>
            </div>
        </div>
    </div>

</body>

</html>
