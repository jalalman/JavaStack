
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Heres Your omikuji</h1>
    <h3>In <c:out value="${number}"></c:out> Years, You will living in 
    <c:out value="${city}"></c:out> with <c:out value="${name}"></c:out>
    as your roommate, <c:out value="${hobby}"></c:out> for living.
    the next time you see a <c:out value="${living}"></c:out> you will
    have a good luck. 
    also, <c:out value="${sthnice}"></c:out>
</h3>
</body>
</html>