
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Read Store</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <h4><a href="/home">back to Shelf</a></h4>
    <form:form method="post" action="/books/addbook" modelAttribute="book" class="needs-validation">
        <div class="mb-3">
            <form:label path="title" class="form-label">title:</form:label>
            <form:input path="title" class="form-control"/>
            <form:errors path="title" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="authorName" class="form-label">Author:</form:label>
            <form:input path="authorName" class="form-control"/>
            <form:errors path="authorName" class="text-danger"/>
        </div>
        <div class="mb-3">
            <form:label path="note" class="form-label">My thoughts:</form:label>
            <form:input path="note" class="form-control"/>
            <form:errors path="note" class="text-danger"/>
        </div>

        <input type="submit" value="Add book" class="btn btn-primary">
    </form:form>
</body>
</html>