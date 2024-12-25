<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <h1>Welcome ${loggedUser.username}</h1>
    <h1>Books From Everyone's Shelves</h1>
    <table>
        <thead>
            <th>Id</th>
            <th>Title</th>
            <th>Author Name</th>
            <th>Posted By</th>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>${book.id}</td>
                    <td><a href="/books/${book.id}">${book.title}</a></td>
                    <td>${book.authorName}</td>
                    <td>${book.user.username}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <a href="/books/new">+ Add a book to my shelf!</a>
    <a class="btn btn-danger" href="/logout">logout</a>

</body>
</html>