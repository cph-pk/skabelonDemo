<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <span style="float: right">
        <form action="" method="post">
            <button type="submit" name="logout">logout</button>
        </form>
        </span>

        <h1>Hello ${sessionScope.email} </h1>





        <h2>You are now logged in as a customer of our wonderful site.</h2>
    </body>
</html>
