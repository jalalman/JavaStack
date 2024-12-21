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
    <title>Document</title>
</head>
<body>
<h1>new student</h1>
<div>
    <a href="/droms">Dashboard</a>
</div>
<form:form action="/addstudent" method="post" modelAttribute="student">
    <form:label path="name">name: </form:label>
    <form:input path="name"/>
    <form:errors path="name"/>
    <form:select path="drom">
    <c:forEach var="drom" items="${droms}">
        <form:option value="${drom.id}">${drom.name}</form:option>

    </c:forEach>
    </form:select>
    <input type="submit" value="add"/>
</form:form>

</body>
</html>