<%--
  Created by IntelliJ IDEA.
  User: Jalal
  Date: 12/19/2024
  Time: 9:47 AM
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
    <title>Save Travels</title>
</head>
<body>
<div class="container">
    <h1 class="header">Save Travels</h1>
    <table class="table table-striped text-center">
        <thead>

        <tr>
            <th scope="col">Expense</th>
            <th scope="col">Vendor</th>
            <th scope="col">Amount</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="travel" items="${travelExps}" >
            <tr>
                <td><a href="/show/${travel.id}">${travel.name}</a></td>
                <td>${travel.vendor}</td>
                <td>$${travel.amount}</td>
                <td>
                    <a href="/edit/${travel.id}" class="btn btn-info">Edit</a>
                    <form method="post" action="/delete" class="form-inline" >
                        <input type="hidden" name="id" value="${travel.id}">
                        <input type="submit" class="btn btn-danger" value="Delete"/>

                    </form>
                </td>
                <td>

                </td>
            </tr>
        </c:forEach>


        </tbody>
    </table>


</div>
<div class="container">
    <h1 class="header">Add an expense</h1>
    <h2>Note must not be blank</h2>
    <form:form action="/addTravelexp" method="post" modelAttribute="travelExp">
        <div class="form-group">
            <form:label path="name">Expenses Name</form:label>
            <form:input class="form-control" path="name"  />
            <form:errors path="name" cssClass="red"/>
        </div>
        <div class="form-group">
            <form:label path="vendor">Vendor :</form:label>
            <form:input class="form-control" path="vendor"  />
            <form:errors path="vendor" cssClass="red"/>
        </div>
        <div class="form-group">
            <form:label path="amount">amount: </form:label>
            <form:input class="form-control" path="amount"  />
            <form:errors path="amount" cssClass="red"/>
        </div>
        <div class="form-group">
            <form:label path="description">description: </form:label>
            <form:input class="form-control" path="description"  />
            <form:errors path="description" cssClass="red"/>
        </div>

        <input type="submit" class="btn btn-primary" value="Add"/>
    </form:form>
</div>
</body>
</html>
