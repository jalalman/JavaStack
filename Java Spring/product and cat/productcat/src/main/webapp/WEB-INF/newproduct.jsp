


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
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <title>New Product</title>
</head>
<body>
    <h1 class="text-center">New Product</h1>
    <div>
        <a href="/">Home</a>
    </div>
    <form:form action="/addProduct" method="post" modelAttribute="product">
        <div class="container">
            <div class="form-group">
                <label for="name">Name</label>
                <form:input path="name" id="name" class="form-control" />
                <form:errors path="name" cssClass="text-danger" />
            </div>
            <div class="form-group">
                <label for="price">Price</label>
                <form:input path="price" id="price" class="form-control" />
                <form:errors path="price" cssClass="text-danger" />
            </div>
            <div class="form-group">
                <label for="description">description</label>
                <form:input path="description" id="description" class="form-control" />
                <form:errors path="description" cssClass="text-danger" />
            </div>
            <input type="submit" value="Save" class="btn btn-primary" />

            </form:form>
    <div>

    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>