<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/languages/${lang.id}" method="post">
		<input type="hidden" name="_method" value="delete">
		<button type="submit" class="button">Delete</button>
		</form>
		<a href="/languages">Dashboard</a>
		
		<form:form action="/languages/editlang/${lang.id}" method="put"
			modelAttribute="lang">
			<p>
				<form:label path="name">Name</form:label>
				<form:errors path="Name" />
				<form:input path="name" placeholder="${lang.name}" />
			</p>
			<p>
				<form:label path="creator">creator</form:label>
				<form:errors path="Creator" />
				<form:textarea path="creator" placeholder="${lang.creator}" />
			</p>
			<p>
				<form:label path="version">version</form:label>
				<form:errors path="Version" />
				<form:input path="version" placeholder="${lang.version}" />
			</p>

			<input type="submit" value="Submit" />
		</form:form>
</body>
</html>