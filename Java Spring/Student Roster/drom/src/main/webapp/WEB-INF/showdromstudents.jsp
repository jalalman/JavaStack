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
    <!-- for Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <title>${drom.name}</title>
</head>
<body>

    <h1>${drom.name}</h1>
    <div>
        <a href="/droms">Dashboard</a>
    </div>
    <form:form action="/assginStu" method="post" modelAttribute="student">
    <form:select path="drom">
        <c:forEach var="student" items="${students}">
            
            <form:option value="${student.id}">${student.name} (${student.drom.name})</form:option>

        </c:forEach>

    </form:select>
    <input type="submit" value="add">
    </form:form>
    <table>
        <thead>
            <th>
                student
            </th>
            <th>action</th>
        </thead>
        <tbody>
            <c:forEach var="student" items="${drom.students}">
                <tr>
                    <td>${student.name}</td>
                    <td><a href="/delete/${drom.id}/${student.id}">remove</a></td>
                </tr>
            </c:forEach>

        </tbody>
    </table>
</body>
</html>