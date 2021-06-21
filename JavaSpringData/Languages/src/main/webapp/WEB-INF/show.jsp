<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="/languages">Dashboard</a>
	<br>
	<h1>
		<c:out value="${lang.name}"></c:out>
	</h1>
	<p>
		<c:out value="${lang.creator}"></c:out>
	</p>
	<p>
		<c:out value="${lang.version}"></c:out>
	</p>
	<br>
	<form action="/languages/${lang.id}/edit" method="get">
		<input type="hidden" name="method" value="put">
		<button type="submit" class="button">Edit</button>
	</form>
	
	<form action="/languages/${lang.id}" method="post">
		<input type="hidden" name="_method" value="delete">
		<button type="submit" class="button">Delete</button>
		</form>
</body>
</html>