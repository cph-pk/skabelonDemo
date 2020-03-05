<%--
  Created by IntelliJ IDEA.
  User: Per
  Date: 05-03-2020
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update user</title>
    <style>
        table {
            border-collapse: collapse;
            #width: 100%;
        }

        td, th {
            #border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
    </style>
</head>
<body>
<span style="float: right">
    <form action="FrontController" method="post">
        <input type="hidden" name="taget" value="logout">
        <button type="submit" name="logout">logout</button>
    </form>
    </span>
<h1>Opret ny kunde</h1>
<span style="float: left">
    <form action="FrontController" method="post">
        <input type="hidden" name="taget" value="employeepage">
        <button type="submit" name="hent">employeepage</button>
    </form>
    </span>
<span>
    <form action="FrontController" method="post">
        <input type="hidden" name="taget" value="admin">
        <button type="submit" name="hent">Admin</button>
    </form>
    </span>
<br>
<form name="register" action="FrontController" method="POST">
    <input type="hidden" name="taget" value="updatesql">
    <input type="hidden" name="id" value="${requestScope["id"]}">

    <table>
        <caption>Ret kunde</caption>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="email" value="${requestScope["email"]}" pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{1,63}" required></td>
        </tr>
        <tr>
            <td>Role:</td>
            <td> <select name="role">
                <option value="customer">Custumer</option>
                <option value="employee">Employee</option>
            </select> </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
