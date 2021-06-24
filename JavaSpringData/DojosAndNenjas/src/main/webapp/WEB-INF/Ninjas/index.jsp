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
	<h1>NEW Ninja</h1>

	<form:form action="/ninjas" method="post" modelAttribute="ninja">
		<table>



			<tr>
				<td><form:label path="firstName" /> first Name <form:errors
						path="firstName" /></td>
				<td><form:input path="firstName" /></td>

			</tr>

			<tr>
				<td><form:label path="lastName" /> last Name <form:errors
						path="lastName" /></td>
				<td><form:input path="lastName" /></td>

			</tr>
			<tr>
				<td><form:label path="age" /> age <form:errors path="age" />
				</td>
				<td><form:input path="age" /></td>

			</tr>

	
			<tr>
				<td><form:label path="dojo" />Dojo</td>
				<td><form:select path="dojo">


						<c:forEach items="${Dojos}" var="dojo">
							<form:option value="${dojo.id }">${dojo.name } </form:option>


						</c:forEach>
					</form:select></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />



	</form:form>
</body>
</html>