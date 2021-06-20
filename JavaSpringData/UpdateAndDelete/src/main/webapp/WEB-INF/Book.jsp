<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><c:out value="${book.title}" /></h1>
<table class="table" style="width:50%">
		<thead class="table table-dark">
			<tr>
				
				<th>Description</th>
				<th><c:out value="${book.description}" /></th>
				
			</tr>
		</thead>
		<tbody class="thead-light">
			
				<tr>
					<td>Language</td>
					<td><c:out value="${book.language}" /></td>
				
					
				</tr>
				<tr>
				<td>Number of Pages</td>
				<td><c:out value="${book.numberOfPages}" /></td>
				
				</tr>
		
		</tbody>
	</table>
	<a href="/books/edit/<c:out value="${book.id}" />">Edit</a>
	<br>
	<a href="/books/delete/${book.id}" type="button" class="btn btn-primary">delete</a>


</body>
</html>