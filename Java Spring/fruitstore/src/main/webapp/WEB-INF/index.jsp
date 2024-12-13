<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/style.css" >
    <title>jalal</title>
</head>
<body>
    <div class="cont">
        <h1>Fruit Store</h1>
            <table >
                <tr>
                    <th>name</th>
                    <th>price</th>
                </tr>
                
                <c:forEach var="item" items="${items}">
                    
                    <tr>
                        <td <c:if test="${item.name.startsWith('G')}"> class="orange"</c:if>><c:out value="${item.name}" /></td>
                        <td <c:if test="${item.name.startsWith('G')}"> class="orange"</c:if>><c:out value="${item.price}" /></td>
                    </tr>
                    
                    
                </c:forEach>
            </table>
    </div>
</body>
</html>