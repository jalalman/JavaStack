<%--
  Created by IntelliJ IDEA.
  User: Jalal
  Date: 12/19/2024
  Time: 11:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>
    <!-- For any Bootstrap that uses JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <title>Save ${travelExp.name}</title>
</head>
<body>

<div class="container">
    <h1 class="header">Edit burger</h1>
    <h2>Note must not be blank</h2>
    <form:form action="/editTravelExp" method="post" modelAttribute="travelExp">
        <div class="form-group">
            <form:hidden path="id"/>
            <form:label path="name">Name</form:label>
            <form:input class="form-control" path="name"  />
            <form:errors path="name" cssClass="red"/>
        </div>
        <div class="form-group">
            <form:label path="vendor">vendor</form:label>
            <form:input class="form-control" path="vendor"  />
            <form:errors path="vendor" cssClass="red"/>
        </div>
        <div class="form-group">
            <form:label path="amount">amount</form:label>
            <form:input class="form-control" path="amount"  />
            <form:errors path="amount" cssClass="red"/>
        </div>
        <div class="form-group">
            <form:label path="description">description :</form:label>
            <form:input class="form-control" path="description"  />
            <form:errors path="description" cssClass="red"/>
        </div>

        <input type="submit" class="btn btn-primary" value="edit"/>
    </form:form>
</div>
</body>
</html>
