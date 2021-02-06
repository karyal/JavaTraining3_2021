<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Contact Form</title>
</head>
<body><h3>New Contact Entry Form</h3>
	<form action="insertContact" method="get">
		<p>SN : <input type="text" name="txt_sn"></p>
		<p>NAME : <input type="text" name="txt_name"></p>
		<p>ADDRESS : <input type="text" name="txt_address"></p>
		<p>EMAIL : <input type="text" name="txt_email"></p>
		<p>PHONE : <input type="text" name="txt_phone"></p>
		<p><input type="submit" value="SAVE"></p>
	</form>
</body>
</html>