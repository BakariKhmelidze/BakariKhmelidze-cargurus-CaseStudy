<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<html>
	<head>
	
	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	</head>
	<body>
			<input type="button" value="Add Car"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="btn btn-primary btn-lg btn-block"
			/>
			<table class="table table-hover">
			  <thead>
			    <tr>
			      <th scope="col">Make</th>
			      <th scope="col">Model</th>
			      <th scope="col">Year</th>
			      <th scope="col">Engine</th>
			      <th scope="col">Transmission</th>
			      <th scope="col">Drivetraine</th>
			      <th scope="col">Interior Color</th>
			      <th scope="col">Exterior Color</th>
			      <th scope="col">Mileage</th>
			      <th scope="col">Price</th>
			      <th scope="col">Vin</th>
			      <th scope="col">Action</th>
			    </tr>
			  </thead>
			  <tbody>
					<c:forEach items="${cars}" var="make">
       					<c:forEach items="${make.modellist}" var="model">
       						<c:forEach items="${model.carlist}" var="car">
       							<c:url var="updateLink" value="/admin/showFormForUpdate">
									<c:param name="carId" value="${car.id}" />
						 		</c:url>
						 		<c:url var="deleteLink" value="/admin/delete">
									<c:param name="carId" value="${car.id}" />
								</c:url>
    							 <tr>
								    <td>${make.make}</td>
								    <td>${model.model}</td>
								    <td>${car.year}</td>
								    <td>${car.engine}</td>
								    <td>${car.transmission}</td>
								    <td>${car.drivetrain}</td>
								    <td>${car.int_color}</td>
								    <td>${car.ex_color}</td>
								    <td><p><fmt:setLocale value = "en_US"/> 
         								<fmt:formatNumber value = "${car.mi}" type = "NUMBER"/></td>
								    <td><b><fmt:setLocale value = "en_US"/>
         									<fmt:formatNumber value = "${car.price}" type = "currency"/></b></td>
								    <td>${car.vin}</td>
								    <td><a href="${updateLink}">Update</a>
										|
										<a href="${deleteLink}"
							   			onclick="if (!(confirm('Are you sure you want to delete this car?'))) return false">Delete</a></td>
								  </tr>
    	   					</c:forEach>
       					</c:forEach>	
       				</c:forEach>
			  </tbody>
			</table>
	</body>
</html>