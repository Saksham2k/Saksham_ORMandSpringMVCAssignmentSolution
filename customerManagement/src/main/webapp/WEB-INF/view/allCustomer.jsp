<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="./base.jsp" %>		
</head>
<body>

	<div class="container mt-3">
	
		<div class = "row">
		
			<div class = "col-md-12">
			
				<h1 class = "text-center mb-3">Welcome to Customer Relation Management Application</h1>
				<table class = "table">
				
					<thead class = "thead-dark">
					<tr>
					
						<th scope = "col">Id</th>
						<th scope = "col">First name</th>
						<th scope = "col">Last name</th>
						<th scope = "col">Email</th>
						<th scope = "col">Action</th>
					
					</tr>
					</thead>
					<tbody>
					
						<c:forEach items = "${customers}" var = "customer">
						
							<tr>
							
								<th scope = "row">${customer.id}</th>
								<td>${customer.firstName }</td>
								<td>${customer.lastName }</td>
								<td>${customer.email }</td>
								<td>
								
									<a href = "Delete/${customer.id }"><i class = "fas fa-trash text-danger"></i></a>
									<a href = "Update/${customer.id }"><i class = "fas fa-pen-nib text-primary"></i></a>
								
								</td>
							
							</tr>
						
						</c:forEach>
					
					</tbody>
				</table>
				
				<div class = "container text-center">
				
					<a href = "Add" class = "btn btn-outline-success">Add Customer</a>
				
				</div>
			
			</div>
		
		</div>
	
	</div>

</body>
</html>