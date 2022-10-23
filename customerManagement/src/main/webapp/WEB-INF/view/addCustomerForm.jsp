<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="./base.jsp" %>
</head>
<body>
<div class = "container mt-3">

	<div class = "row">
	
		<div class = "col-md-6  offset-md-3">
		
			<h1 class = "text-center mb-3">Fill the Customer detail</h1>
			<form action="handle-customer" method="post">
			
				<div class = "form-group">
				
					<label for = "firstName">First Name</label>
					<input type = "text"
						   class = "form-control"
						   id = "firstName"
						   name = "firstName"
						   placeholder = "Enter the first name here">
				</div>
				<div class = "form-group">
				
					<label for = "lastName">Last Name</label>
					<input type = "text"
						   class = "form-control"
						   id = "lastName"
						   name = "lastName"
						   placeholder = "Enter the last name here">		   
				</div>
				<div class = "form-group">
				
					<label for = "email">Email</label>
					<input type = "email"
					       class = "form-control"
					       id = "email"
					       name = "email"
					       placeholder = "Enter the email here">
				</div>
				<div class = "container text-center">
				
					<a href = "${pageContext.request.contextPath}/All" class = "btn btn-outline-danger">Back</a>
					<button type = "submit"
						    class = "btn btn-primary">Add</button>
				
				</div>
			
			</form>
		
		</div>
	
	</div>

</div>
</body>
</html>