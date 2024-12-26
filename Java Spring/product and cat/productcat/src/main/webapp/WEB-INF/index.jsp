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
    <style>
        .large-font {
            font-size: 1.5em;
        }
    </style>
    <title>Document</title>
</head>
<body>
    <h1 class="text-center">Many to Many </h1>
    <div>
        <a href="/products/new" class="btn btn-primary">New product</a>
    </div>
    <div>
        <a href="/categories/new" class="btn btn-primary">New Category</a>
    </div>
    <div class="table-responsive">
        <table class="table table-striped table-bordered">
            <thead class="thead-dark">
                <tr>
                    <th>Products</th>
                    <th>Category</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td class="large-font">
                        <ul>
                            <c:forEach var="product" items="${products}">
                                <li><a href="/products/${product.id}">${product.name}</a></li>
                            </c:forEach>
                        </ul>
                    </td>
                    <td class="large-font">
                        <ul>
                            <c:forEach var="category" items="${categories}">
                                <li><a href="/categories/${category.id}">${category.name}</a></li>
                            </c:forEach>
                        </ul>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>