<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
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
    <h1>New Ninja</h1>
    <form:form action="/addninja" method="post" modelAttribute="ninja">
    <form:label path="firstName" >First Name: </form:label>

    <form:input path="firstName"  />
    <form:errors path="firstName"/>

    <form:label path="lastName" >Last Name: </form:label>

    <form:input path="lastName"  />
    <form:errors path="lastName"/>

    <form:label path="age" >Age: </form:label>

    <form:input path="age"  />
    <form:errors path="age"/>

    <form:label path="dojo">Dojo: </form:label>
    <form:select path="dojo">
    <c:forEach var="dojo" items="${dojos}">

        <form:option value="${dojo.id}">${dojo.name}</form:option>
    </c:forEach>
    </form:select>
    <form:errors path="dojo.id" class="text-danger" />
    <input type="submit" value="add"/>
    </form:form>
</body>
</html>