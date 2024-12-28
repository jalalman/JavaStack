
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
    <title>Document</title>
</head>
<body>
<div class="container mt-5">
    <div class="row">
        <div class="col-md-6">
            <h2>Add New Class</h2>
            <form:form action="/classes/new" method="post" modelAttribute="class">
                <div class="mb-3">
                    <form:label path="className" class="form-label">Class Name:</form:label>
                    <form:input path="className" class="form-control"/>
                    <form:errors path="className" class="text-danger"/>
                </div>

                <button type="submit" class="btn btn-primary">Add Class</button>
            </form:form>
        </div>

        <div class="col-md-6">
            <h2>Add New Student</h2>
            <form:form action="/students/new" method="post" modelAttribute="student">
                <div class="mb-3">
                    <form:label path="name" class="form-label"> Name:</form:label>
                    <form:input path="name" class="form-control"/>
                    <form:errors path="name" class="text-danger"/>
                </div>
                <div class="mb-3">
                    <form:label path="age" class="form-label">age:</form:label>
                    <form:input path="age" class="form-control" type="Number"/>
                    <form:errors path="age" class="text-danger"/>
                </div>
                <div class="mb-3">
                    <form:label path="grade" class="form-label">Grade:</form:label>
                    <form:select path="grade" class="form-select">
                        <form:option value="1">1st Grade</form:option>
                        <form:option value="2">2nd Grade</form:option>
                        <form:option value="3">3rd Grade</form:option>
                        <form:option value="4">4th Grade</form:option>
                        <form:option value="5">5th Grade</form:option>
                        <form:option value="6">6th Grade</form:option>
                    </form:select>
                    <div class="mb-3"></div>

                        <form:label path="stuClass" class="form-label">Class:</form:label>
                        <form:select path="stuClass" class="form-select">
                            <c:forEach var="classItem" items="${classes}">
                                <form:option value="${classItem.id}"> ${classItem.className}</form:option>
                            </c:forEach>
                        </form:select>
                        <form:errors path="class" class="text-danger"/>
                    </div>
                    <form:errors path="grade" class="text-danger"/>
                    <input type="submit" value="add" class="btn btn-primary"/>

                </div>

            </form:form>
        </div>
    </div>
</div>
            <div class="container mt-5">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Student Name</th>
                            <th>Age</th>
                            <th>Grade</th>
                            <th>Class Name</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="student" items="${students}">
                            <tr>
                                <td><a href="/student/${student.id}">${student.name}</a></td>
                                <td style="color: ${student.age > 30 ? 'red' : 'black'}">${student.age}</td>

                                <td>${student.grade}th Grade</td>

                                <td>${student.stuClass.className}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>