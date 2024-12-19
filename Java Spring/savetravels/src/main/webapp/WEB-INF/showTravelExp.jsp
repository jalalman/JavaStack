<%--
  Created by IntelliJ IDEA.
  User: Jalal
  Date: 12/19/2024
  Time: 11:22 AM
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
<div>
    <p>ID: ${travelExp.id}</p>
    <p>Name: ${travelExp.name}</p>
    <p>Amount: ${travelExp.amount}</p>
    <p>Vendor: ${travelExp.vendor}</p>
    <p>Description: ${travelExp.description}</p>
    <a href="/expenses" class="btn btn-info">Back</a>

</div>
</body>
</html>
