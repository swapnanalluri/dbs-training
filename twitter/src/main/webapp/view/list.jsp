<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<h1>Employees </h1>
<a href="/users/listAll">Register New User</a>

<table border="1">
    <tr>
        <th>User Id</th>
        <th> Name</th>
        <th>Email</th>
        <th>city</th>
        <th>Street</th>
        <th>state</th>
        <th>pin</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.city}</td>
            <td>${user.street}</td>
            <td>${user.state}</td>
            <td>${user.pin}</td>

        </tr>
    </c:forEach>
</table>

</body>
</html>