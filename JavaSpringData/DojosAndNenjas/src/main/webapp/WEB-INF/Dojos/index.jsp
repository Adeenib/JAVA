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
<h1>NEW Dojo</h1>

	<form:form action="/dojo" method="post" modelAttribute="dojo">
		<table>



			<tr>
				<td><form:label path="name" /> Name 
					<form:errors	path="name" />
				</td>
				<td><form:input path="name" /></td>

			</tr>
	
		</table>
		<input type="submit" value="Submit" />



	</form:form>

</body>
</html>