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

<form:form action="/creatlicense" method="post" modelAttribute="license">

		<table> 
		<tr>
		<td>
		<form:label path="person"/>Persons
		</td>
		<td>
	<form:select path="person">
	
	
		<c:forEach items="${persons}" var="person">
			<form:option value="${person.id }">"${person.first_name } ${person.last_name } "</form:option>
		
		
		</c:forEach>
		</form:select>
		</td>
		</tr>
		<tr>
		<td>
	<form:label path="state"/>State
	</td>
	<td>
	<form:input path="state"/>
	</td>
	</tr>
	<tr>
	<td>
	<form:label path="expirationDate"/>Expiration Date
	</td>
	<td>
	<form:input type="date" path="expirationDate"/>
	</td>
	</tr>
	
	



</table>
	<input type="submit" value="Submit" />
</form:form>

</body>
</html>