<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" type="text/css" href="css/homestyle.css">
<title>Insert title here</title>
</head>
<body>
 <nav>
        <label class='label_of_value' for="value">Your gold:<input type="text" style="max-width: 60px;" name='value'
                id="textInput" value='<c:out value="${result}"></c:out>'></label>
    </nav>
    <div class="sec">
        <div class="card text-white bg-dark mb-3 cardcss" style="max-width: 18rem;">
            <h2>Farm</h2>
            <p>(earns 10-20 golds)</p>
            <form action="/process_money" method="POST">
        
                <input type="hidden" name="action" value="farm">
                <button type="submit" class="btn btn-secondary">Find Gold!</button>
            </form>
        </div>
        <div class="card text-white bg-dark mb-3 cardcss" style="max-width: 18rem;">
            <h2>Cave</h2>
            <p>(earns 5-10 golds)</p>
            <form action="/process_money" method="POST">
             
                <input type="hidden" name="action" value="Cave">
                <button type="submit" class="btn btn-secondary">Find Gold!</button>
            </form>
        </div>
        <div class="card text-white bg-dark mb-3 cardcss" style="max-width: 18rem;">
            <h2>House</h2>
            <p>(earns 2-5 golds)</p>
            <form action="/process_money" method="POST">
                
                <input type="hidden" name="action" value="House">
                <button type="submit" class="btn btn-secondary">Find Gold!</button>
            </form>
        </div>
        <div class="card text-white bg-dark mb-3 cardcss" style="max-width: 18rem;">
            <h2>Casino</h2>
            <p>(earns/takes 0-50 golds)</p>

            <form action="/process_money" method="POST">
               
                <input type="hidden" name="action" value="Casino">
                <button type="submit" class="btn btn-secondary">Find Gold!</button>
            </form>
        </div>

    </div>
    <footer>

        <label for="activities"> Activities</label>
        
        <div class="P_A">
               <c:forEach items="${activte}" var="item">
        		  
        
        <c:choose>
		    <c:when test="${item.contains('lost')}">
		        <p style="color: red;"><c:out value="${item}"/></p>
		    </c:when>
		    <c:otherwise>
		        <p><c:out value="${item}"/></p>
		    </c:otherwise>
		</c:choose>
        
        
               
		</c:forEach>
        </div>
    </footer>

</body>
</html>