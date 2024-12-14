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
    
    <form action="/omikuji/show" method="post">
        <div>
            <label for="number">pick any number from 5 to 25</label>
            <input type="number" min="5" max="25" name="number">
        </div>
        <div>
            <label for="city">Enter the name of city</label>
            <input type="text" name="city">
        </div>
        <div>
            <label for="name">Enter the name of real person</label>
            <input type="text" name="name">
        </div>
        <div>
            <label for="hobby">Enter your hobby</label>
            <input type="text" name="hobby">
        </div>
        <div>
            <label for="living">Enter any type of living thing</label>
            <input type="text" name="living">
        </div>
        <div>
            <label for="sthnice">Say something nice to someone</label>
            <textarea name="sthnice"></textarea>   
        </div>
        <p>Send and show to a friend</p>
        <input type="submit" value="submit"> 
    </form>
</body>
</html>