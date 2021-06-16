<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Submitted info</h1>
<ul>
<li>Name:<c:out value="${user.name}"/></li>
<li>language:<c:out value="${user.language}"/></li>
<li>location:<c:out value="${user.location}"/></li>
<li>comment:<c:out value="${user.comment}"/></li>


</ul>


</body>
</html>