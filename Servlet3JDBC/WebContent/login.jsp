<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>User Login</h3>
	<form action="loginServlet" method ="post">
		<p>USER : <input type="text" name="txt_user"></p>
		<p>PASSWORD : <input type="password" name="txt_pass"></p>
		<p><input type="submit" value="LOGIN"></p>
	</form>
</body>
</html>