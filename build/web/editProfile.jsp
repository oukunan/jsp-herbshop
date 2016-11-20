<%-- 
    Document   : editProfile
    Created on : Nov 20, 2016, 10:32:58 PM
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
                <div class="col-md-12">
                    <h3>Edit Profile</h3>
                    <form action="UpdateMember">
                    <table>
                        <tr>
                            <td><strong>Name</strong> :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="name" value="${user.custName}" ></td>
                        </tr>
                        <tr>
                            <td><strong>Surname</strong> :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="surname" value="${user.custSurname}" ></td>
                        </tr>
                        <tr>
                            <td><strong>Address</strong> : &nbsp; </td>
                            <td><input type="text" class="form-control" name="address" value="${user.custAddress}" ></td>
                        </tr>
                        <tr>
                            <td><strong>State</strong> :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="state" value="${user.custState}" >  </td>
                        </tr>
                        <tr>
                            <td><strong>City</strong> :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="city" value="${user.custCity}" >  </td>
                        </tr>
                        <tr>
                            <td><strong>Postal</strong> :  &nbsp; </td>
                            <td><input type="number" class="form-control" name="postal" value="${user.custPostal}" >  </td>
                        </tr>
                        <tr>
                            <td><strong>Tel</strong> :  &nbsp; </td>
                            <td><input type="text" class="form-control" name="tel" value="${user.custTel}" >  </td>
                        <input type="hidden" name="id" value="${user.custId}" />
                        </tr>
                    </table><br><br>
                    <input type="submit" value="Update ProFile" class="btn btn-primary" />
                    <button class="btn btn-inverse" onclick="history.back()">Back </button>
                    </form>
                            <span class="text-danger">${mes}</span>
                </div>
            </div>
        </div>
    </body>
</html>
