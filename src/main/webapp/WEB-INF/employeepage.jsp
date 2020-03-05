<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        <span style="float: right">
        <form action="FrontController" method="post">
            <input type="hidden" name="taget" value="logout">
            <button type="submit" name="logout">logout</button>
        </form>
        </span>

        <h1>Hello ${sessionScope.email} </h1>

        <h2>You are now logged in as a EMPLOYEE of our wonderful site.</h2>

    <form action="FrontController" method="post">
        <input type="hidden" name="taget" value="admin">
        <button type="submit" name="hent">Admin</button>
    </form>
    </body>
</html>
