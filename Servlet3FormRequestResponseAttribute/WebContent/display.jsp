<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Result</h3>
	<p>First No : <%=request.getParameter("txt_n1")%></p>
	<p>Second No :<%=request.getParameter("txt_n2")%> </p>
	<p>Sum : <%=request.getAttribute("result")%></p>
</body>
</html>