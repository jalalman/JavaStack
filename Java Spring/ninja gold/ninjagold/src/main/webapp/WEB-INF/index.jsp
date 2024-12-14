<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/style.css">
    <title>Ninja Gold Game</title>
</head>
<body>
    <div class="gold-cont">
        <p>Your Gold:</p>
        <p class="gold-stack">0</p>
    </div>

    <div class="places-cont">
        <div class="place">
            <h2>Farm</h2>
            <h3>(earns 10-20 gold)</h3>
            <form action="#" method="post">
                <input type="hidden" name="place" value="farm">
                <button type="submit">Find Gold !</button>
            </form>
        </div>

        <div class="place">
            <h2>Cave</h2>
            <h3>(earns 5-10 gold)</h3>
            <form action="#" method="post">
                <input type="hidden" name="place" value="cave">
                <button type="submit">Find Gold !</button>
            </form>
        </div>

        <div class="place">
            <h2>House</h2>
            <h3>(earns 2-5 gold)</h3>
            <form action="#" method="post">
                <input type="hidden" name="place" value="house">
                <button type="submit">Find Gold !</button>
            </form>
        </div>

        <div class="place">
            <h2>Quest</h2>
            <h5>(earns/takes

                0-50 gold)</h5>
            <form action="#" method="post">
                <input type="hidden" name="place" value="quest">
                <button type="submit">Find Gold !</button>
            </form>
        </div>




    </div>
    <div class="activites-cont">
        <h2>Activites:</h2>
        <div class="activites-event-cont">
            <p class="green">you earned sadsa</p>
            <p class="red">you earned sadsa</p>
            <p class="green">you earned sadsa</p>
        </div>
    </div>
</body>
</html>