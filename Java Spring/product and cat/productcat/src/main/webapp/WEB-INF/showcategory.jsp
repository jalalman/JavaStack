


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
    <title>${category.name}</title>
</head>
<body>
    <h1 class="text-center">New category</h1>
    <div>
        <a href="/">Home</a>
    </div>

    <div>
        <h1>Product</h1>

            <div>
            <c:forEach var="product" items="${category.products}">
                <h2>-${product.name}</h2>
            </c:forEach>
            </div>
            <div>
                <form:form action="/categories/${category.id}/addProduct" method="post" modelAttribute="product">
                    <div class="form-group">

                        <form:select path="id" class="form-control">
                            <form:option value="">--Select--</form:option>
                            <c:forEach var="product" items="${otherProducts}">
                                <form:option value="${product.id}">${product.name}</form:option>
                            </c:forEach>
                        </form:select>
                    </div>

                        <input type="submit" value="Add product" class="btn btn-primary">
                    </form:form>
            </div>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>