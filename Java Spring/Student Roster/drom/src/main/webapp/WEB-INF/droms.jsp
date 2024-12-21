<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- for Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <title>Droms</title>
</head>
<body>
<h1>droms</h1>
<div>
    <a href="/drom/new">Add a new Drom</a>
</div>
<div>
    <a href="/students/new">Add ad new Student</a>
</div>

<table>
    <thead>
        <th>Drom</th>
        <th>Action</th>
    </thead>
    <tbody>
        <c:forEach var="drom" items="${droms}">
            <tr>
                <td>${drom.name}</td>
                <td><a href="/drom/${drom.id}">See student</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>