<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.button {
	background: none !important;
	color: Blue;
	border: none;
	padding: 0 !important;
	/*optional*/
	font-family: arial, sans-serif;
	/*input has OS specific font-family*/
	color: #069;
	text-decoration: underline;
	cursor: pointer;
}
.DAE{

    display: flex;
    flex-direction: row;
    justify-content: space-between;
    width: 5rem;

}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${languages}" var="lang">
				<tr>
					<td>
						<form action="/languages/${lang.id}">
							<button type="submit" class="button">
								<c:out value="${lang.name}"></c:out>
							</button>
						</form>
					</td>
					<td><c:out value="${lang.creator}"></c:out></td>
					<td><c:out value="${lang.version}"></c:out></td>
					<td class="DAE">
						<form action="/languages/${lang.id}/edit" method="get" >
						<input type="hidden" name="method" value="put" >
							<button type="submit" class="button">
								Edit
							</button>
						</form>|| <form  action="/languages/${lang.id}"  method="post">
						  <input type="hidden" name="_method" value="delete">
							<button type="submit" class="button">
								Delete
							</button>
						</form>
					</td>




				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form:form action="/languages/create" method="post"
		modelAttribute="lang">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="Name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="Creator" />
			<form:textarea path="creator" />
		</p>
		<p>
			<form:label path="version">Version</form:label>
			<form:errors path="Version" />
			<form:input path="version" />
		</p>

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>