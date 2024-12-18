

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>edit Burger</title>
</head>
<body>


<div class="container">
    <h1 class="header">Edit burger</h1>
    <h2>Note must not be blank</h2>
    <form:form action="/editBurger" method="post" modelAttribute="burger">
        <div class="form-group">
            <form:hidden path="id"/>
            <form:label path="burgerName">Burger Name</form:label>
            <form:input class="form-control" path="burgerName"  />
            <form:errors path="burgerName" cssClass="red"/>
        </div>
        <div class="form-group">
            <form:label path="restName">Resturant Name</form:label>
            <form:input class="form-control" path="restName"  />
            <form:errors path="restName" cssClass="red"/>
        </div>
        <div class="form-group">
            <form:label path="rate">Rate</form:label>
            <form:input class="form-control" path="rate"  />
            <form:errors path="rate" cssClass="red"/>
        </div>
        <div class="form-group">
            <form:label path="note">note</form:label>
            <form:input class="form-control" path="note"  />
            <form:errors path="note" cssClass="red"/>
        </div>

        <input type="submit" class="btn btn-primary" value="edit"/>
    </form:form>
</div>
</body>
</html>

