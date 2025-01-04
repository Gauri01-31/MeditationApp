<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Logout</title>
</head>
<body>
    <%
        // Invalidating the session to log out the user
        session.invalidate();
    %>
    <h1>You have been logged out.</h1>
    <a href="loginpage.html">Go to Login</a>
</body>
</html>
