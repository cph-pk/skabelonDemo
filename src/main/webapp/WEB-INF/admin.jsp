<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Per
  Date: 04-03-2020
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oversigt</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }
    </style>
</head>
<body>
<span style="float: right">
<form action="" method="post">
    <button type="submit" name="logout">logout</button>
</form>
</span>
<h1>Admin side</h1>


<form action="FrontController" method="post">
    <input type="hidden" name="taget" value="employeepage">
    <button type="submit" name="hent">employeepage</button>
</form>
<h2>Antal kunder: ${fn:length(requestScope.admin)}</h2>
<h3>Liste med alle kunder</h3>
<form action="FrontController" method="post">
    <input type="hidden" name="taget" value="createnewuser">
    <button type="submit" name="hent">Ny kunde</button>
</form>
<table>
    <caption>Kunde-liste</caption>
    <thead>
    <tr>
    <th>Id.</th>
    <th>Email.</th>
    <th>Role.</th>
    <th colspan="2"></th>
    </tr>
    </thead>
    <tbody>
<c:forEach var="element" items="${requestScope.admin}">
<tr>
    <td>${element.id}</td>
    <td>${element.email}</td>
    <td>${element.role}</td>
    <td>
    <form action="FrontController" method="post">
        <input type="hidden" name="taget" value="updateuser">
        <input type="hidden" name="" value="${element.id}">
        <button type="submit" name="update">Ret</button>
    </form>
    </td>
    <td>
        <form action="FrontController" method="post">
            <input type="hidden" name="taget" value="deleteuser">
            <input type="hidden" name="" value="${element.id}">
            <button type="submit" name="delete">Slet</button>
        </form>
    </td>
</tr>

</c:forEach>
    </tbody>
</table>

</body>
</html>
