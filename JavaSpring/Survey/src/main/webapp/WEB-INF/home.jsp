<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <link rel="stylesheet" type="text/css" href="css/homestyle.css">
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/result" method="POST">

<input placeholder="Your Name" type="text" name="name">

<label for="location">Dojo location:</label>
<select name="location" id="location">
  <option value="San Jose">San Jose</option>
  <option value="Anabta">Anabta</option>
  <option value="Nablus">Nablus</option>
</select>

<label for="language">Favorite language:</label>
<select name="language" id="location">
  <option value="python">Python</option>
  <option value="java">Java</option>
  <option value="c#">C#</option>
</select>
<textarea rows="4" cols="8" name="comment">Comments</textarea>
<button type="submit">Button</button>
</form>
</body>
</html>