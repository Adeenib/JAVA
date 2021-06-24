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
<h1>NEW PEARSON</h1>

	<form:form action="/creatperson" method="post" modelAttribute="person">
		<table>



			<tr>
				<td><form:label path="first_name" />First Name 
					<form:errors	path="first_name" />
				</td>
				<td><form:input path="first_name" /></td>

			</tr>
			<tr>
				<td><form:label path="last_name" /> Last Name 
				 	<form:errors   path="last_name" />
				 </td>
				<td><form:input path="last_name" /></td>
			</tr>

		</table>
		<input type="submit" value="Submit" />



	</form:form>

</body>
</html>