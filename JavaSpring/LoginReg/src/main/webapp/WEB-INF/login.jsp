<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/login" method="POST">
	email<input type="email" name="email" placeholder="email@somthing.com">
	password<input type="password" name="password" placeholder="password">
	<button type="submit">Login</button>
</form>
</body>
</html>