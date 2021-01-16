<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Calculator-1</h3>
<form action="servlet1" method="get">
	<!-- request.getParameter("txt_n1") -->
	<p>Number 1: <input type="text" name="txt_n1"></p>
	<p>Number 2: <input type="text" name="txt_n2"></p>
	
	<p><input type="submit" value="SEND"></p>
</form>
</body>
</html>