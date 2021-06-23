<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/dashboard.css">
<title>Insert title here</title>
</head>
<body>

<div class="nav">
<div class="navlink">
<a href="/songs/new">Add New</a>   

<a href="/topten">Top Songs</a></div>
<form:form  action="/search" modelAttribute="song">
<form:label path="artist"/>
<form:errors path="artist"/>
<form:input path="artist"/>

<button type="submit">Search Artist</button>
</form:form>
</div>
<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Rating</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${songs}" var="song">
        <tr>
            <td><a href="/songs/show/${song.id}">
            <c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.rating}"/></td>
            <td><a href="/songs/delete/${song.id}">delete</a></td>
            

        </tr>
         </c:forEach>
             </tbody>
</table>



</body>
</html>