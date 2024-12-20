<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>${ninjas.dojo.name}</h1>
    <table>
        <thead>

                <th>first name</th>
                <th>last name</th>
                <th>age </th>
                
        </thead>

            <c:forEach var="dojo" items="${dojo.ninjas}">
                <tr>
                <td>${dojo.firstName}</td>
                <td>${dojo.lastName}</td>
                <td>${dojo.age}</td>

                </tr>
            </c:forEach>


    </table>
</body>
</html>