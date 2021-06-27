<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/product" method="post" modelAttribute="product">
	<form:label path="name"/>Name
	<form:input path="name"/>
	<form:errors path="name" />
	
	<form:label path="description"/>Description
	<form:input path="description"/>
	<form:errors path="description" />
	
	<form:label path="price"/>Price
	<form:input path="price"/>
	<form:errors path="price" />
	
    <button >Add product!</button>
</form:form>

</body>
</html>