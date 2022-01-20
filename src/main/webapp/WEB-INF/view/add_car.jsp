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
		<div class="container" style="margin-top: 100px; border: 3px black solid">
		<form:form action="saveCar" modelAttribute="make" method="POST">
						  <h2 style="text-align: center; margin-bottom: 30px;">Add Car</h2>
						  <hr>
						  <div class="form-row">
						    <div class="col-md-6 mb-3">
						      <label>Make:</label>
						      <form:input type="text" class="form-control" placeholder="Make" path="make"/>
						    </div>
						    <div class="col-md-6 mb-3">
						      <label for="validationDefault02">Model:</label>
						      <form:input type="text" class="form-control" placeholder="Model" path="model"/>
						    </div>
						  </div>
						  <div class="form-row">
						    <div class="col-md-12 mb-3">
						      <label>Image:</label>
						      <form:input type="text" class="form-control" placeholder="Image" path="img"/>
						    </div>
						  </div>
						  <div class="form-row">
						    <div class="col-md-4 mb-3">
						      <label>Engine:</label>
						      <form:input type="text" class="form-control" placeholder="Engine" path="engine"/>
						    </div>
						    <div class="col-md-4 mb-3">
						      <label>Drivertrain:</label>
						      <form:input type="text" class="form-control" placeholder="Drivertrain" path="drivetrain"/>
						    </div>
						    <div class="col-md-4 mb-3">
						      <label >Transmission:</label>
						      <form:input type="text" class="form-control"  placeholder="Transmission" path="transmission"/>
						    </div>
						  </div>
						  <div class="form-row">
						    <div class="col-md-6 mb-3">
						      <label>Interior Color:</label>
						      <form:input type="text" class="form-control" placeholder="Interior Color" path="int_color"/>
						    </div>
						    <div class="col-md-6 mb-3">
						      <label>Exterior Color:</label>
						      <form:input type="text" class="form-control" placeholder="Exterior Color" path="ex_color"/>
						    </div>
						  </div>
						  <div class="form-row">
						    <div class="col-md-4 mb-3">
						      <label>Price:</label>
						      <form:input  class="form-control" placeholder="Price" path="price"/>
						    </div>
						    <div class="col-md-4 mb-3">
						      <label>Year:</label>
						      <form:input  class="form-control" placeholder="Year" path="year"/>
						    </div>
						    <div class="col-md-4 mb-3">
						      <label>mileage:</label>
						      <form:input  class="form-control" placeholder="mileage" path="mi"/>
						    </div>
						  </div>
						  <div class="form-row">
						    <div class="col-md-12 mb-3">
						      <label>VIN#:</label>
						      <form:input  class="form-control" placeholder="VIN#" path="vin"/>
						    </div>
						  </div>
						  <input type="Submit" value="Save" class="btn btn-primary"></input>
						  <a href="/spring-crm-rest/admin/list">Go Back</a>
		</form:form>
		</div>
	</body>
</html>