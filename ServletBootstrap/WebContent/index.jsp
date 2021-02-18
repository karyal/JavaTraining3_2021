<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bootstrap Test</title>
<!--   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous"> -->
<link href="${request.getContextPath()}assets/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<h2>Servlet</h2>
	<a href="servletStaticLoad">Bootstrap in Servlet</a>

	<h2>JSP</h2>
	<h3>Loading Static Contents</h3>
	<h4>Image in JSP</h4>
	<p>
		<img src="assets/images/image1.png" border="2" width="50%">
	</p>
	<p>
		<img src="${request.getContextPath()}assets/images/image2.png"
			alt='image' border='2' />
	</p>
	<h3>Java Script</h3>
	<input type="button" value="Click Me" onclick="test()">

	<h3>Login Form</h3>
	<form>
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Email
				address</label> <input type="email" class="form-control"
				id="exampleInputEmail1" aria-describedby="emailHelp">
			<div id="emailHelp" class="form-text">We'll never share your
				email with anyone else.</div>
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Password</label>
			<input type="password" class="form-control"
				id="exampleInputPassword1">
		</div>
		<div class="mb-3 form-check">
			<input type="checkbox" class="form-check-input" id="exampleCheck1">
			<label class="form-check-label" for="exampleCheck1">Check me
				out</label>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>



	<!--  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script> -->
	<script
		src="${request.getContextPath()}assets/js/bootstrap.bundle.min.js"></script>
	<script src="${request.getContextPath()}assets/js/test.js"></script>
</body>
</html>