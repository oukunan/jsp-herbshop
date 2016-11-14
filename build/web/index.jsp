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
        <link rel="stylesheet" href="css/type.css">
    </head>
    <body>
        <jsp:include page="/WEB-INF/header/header.jsp"/>
        <div class="container animated fadeIn" id="edit">
            <div class="row">
                <center>
                    <div>
                        <div id="typed-strings">
                            <span>WelCome To</span>
                            <span>HerbShop </span>
                        </div>
                        <span id="typed" style="white-space:pre; font-size: 80px"></span>
                    </div>
                </center>
            </div>
        </div>   
        <br>
        <div class="row">
            <div class="col-md-4 text-center animated fadeIn">
                <img src="images/6.png"  height="250" alt="pic1" /><br><br>
                <a href="typeHerb.jsp" class="btn  btn-primary btn-hg ">Herb (สมุนไพร)</a>
            </div>
            <div class="col-md-4 text-center animated fadeIn">
                <img src="images/3.png" height="250"  alt="pic2"  width="300" height="300" /><br><br>
                <a href="SearchDisease" class="btn btn-primary btn-hg ">Diseases (อาการ)</a>
            </div>
            <div class="col-md-4 text-center animated fadeIn">
                <img src="images/5.png" height="250"  alt="pic3" width="300" height="300" /><br><br>
                <a href="SearchFood" class="btn btn-primary btn-hg ">Food (อาหาร)</a>
            </div>
        </div>
    </div>

    <script src="js/wow.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script src="js/typed.js" type="text/javascript"></script>
    <script>
        $(function () {

            $("#typed").typed({
                // strings: ["Typed.js is a <strong>jQuery</strong> plugin.", "It <em>types</em> out sentences.", "And then deletes them.", "Try it out!"],
                stringsElement: $('#typed-strings'),
                typeSpeed: 100,
                backDelay: 500,
                loop: false,
                contentType: 'html', // or text
                // defaults to false for infinite loop
                loopCount: false,
                callback: function () {
                    foo();
                },
                resetCallback: function () {
                    newTyped();
                }
            });

            $(".reset").click(function () {
                $("#typed").typed('reset');
            });

        });

        function newTyped() { /* A new typed object */
        }

        function foo() {
            console.log("Callback");
        }

    </script>
    <script>
        new WOW().init();
    </script>
</body>
</html>