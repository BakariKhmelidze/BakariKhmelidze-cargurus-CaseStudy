<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
	<style>
	      td{
	          border: 0px !important;
	      }
	  </style>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <link rel="stylesheet" href="<c:url value="/resources/css/index.css"></c:url>">
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
   <nav style="diplay: flex;">
   		<ul style="display: flex; line-height: 1.5; list-style: none;">
   			<li>
   				<button>Buy</button>
   				<div class="dropdown-content">
	   				<a href="/spring-crm-rest">Used Cars</a>
				    <a href="#">New Cars</a>
				    <a href="#">Certified Cars</a>
   				</div>
   			</li>
   			<li>
   			<button>Sell</button>
   			<div class="dropdown-content">
	   				<a href="#">Sell My Car</a>
				    <a href="#">Car Value</a>
				    <a href="#">Sell My Car FAQ</a>
   				</div>
   			</li>
   			<li>
   			<button>Finance</button>
   			   	<div class="dropdown-content">
	   				<a href="#">Loan Calculator</a>
				    <a href="#">Financing FAQ</a>
				    <a href="#">Prequalified for Financing</a>
   				</div>
   			</li>
   			<li>
   			<button>Research</button>
   			   	<div class="dropdown-content">
	   				<a href="#">Test Drive Reviews</a>
				    <a href="#">Price Trend</a>
				    <a href="#">Tips & Advices</a>
   				</div>
   			</li>
   		</ul>
   </nav>
   <h3 style="margin-left: 50px;">
   Used <span style="color: rgb(155,125,137)">
   <c:out value="${cars.make}"/>
   <c:forEach items="${cars.modellist}" var="model"> <c:out value="${model.model}"/></c:forEach></span> for Sale
   </h3>
   <table class="table" id="table" style="margin-left: 40px !important;">
       <tbody id="body">
       		<c:forEach items="${cars.modellist}" var="model">
       			<c:forEach items="${model.carlist}" var="car" varStatus="loopCounter">
       			<c:url var="Car" value="list/car">
						<c:param name="carId" value="${car.id}" />
				</c:url>
       			<c:if test = "${loopCounter.getIndex() % 3 == 0}">
         					<tr>
       				 			<td>
	       							<div class="card" style="width: 18rem;">
									  <img class="card-img-top" src="${car.img} ">
									  <div class="card-body">
									    <h5 class="card-title" style="font-size: 18px;">${car.year} ${cars.make} ${model.model} ${car.drivetrain}</h5>
									    <p class="card-text" style="margin-bottom: 0px !important;"> <b><fmt:setLocale value = "en_US"/>
         													  <fmt:formatNumber value = "${car.price}" type = "currency"/></b></p>
         								<p class="card-text"> <fmt:setLocale value = "en_US"/> <fmt:formatNumber value = "${car.mi}" type = "NUMBER"/> mi</p>
									    <a href="${ Car }" class="btn btn-primary">See More</a>
									  </div>
									</div>
								</td>
      			</c:if>
      			<c:if test = "${loopCounter.getIndex() % 3 == 1}">
       				 			<td>
	       							<div class="card" style="width: 18rem;">
									  <img class="card-img-top" src="${car.img} ">
									  <div class="card-body">
									    <h5 class="card-title" style="font-size: 18px;">${car.year} ${cars.make} ${model.model} ${car.drivetrain}</h5>
										<p class="card-text" style="margin-bottom: 0px !important;"> <b><fmt:setLocale value = "en_US"/>
         													  <fmt:formatNumber value = "${car.price}" type = "currency"/></b></p>
         								<p class="card-text"> <fmt:setLocale value = "en_US"/> <fmt:formatNumber value = "${car.mi}" type = "NUMBER"/> mi</p>
									    <a href="${ Car }" class="btn btn-primary">See More</a>
									  </div>
									</div>
								</td>
      			</c:if>
      			<c:if test = "${loopCounter.getIndex() % 3 == 2}">
       				 			<td>
	       							<div class="card" style="width: 18rem;">
									  <img class="card-img-top" src="${car.img} ">
									  <div class="card-body">
									    <h5 class="card-title" style="font-size: 18px;">${car.year} ${cars.make} ${model.model} ${car.drivetrain}</h5>
										<p class="card-text" style="margin-bottom: 0px !important;"> <b><fmt:setLocale value = "en_US"/>
         													  <fmt:formatNumber value = "${car.price}" type = "currency"/></b></p>
         								<p class="card-text"> <fmt:setLocale value = "en_US"/> <fmt:formatNumber value = "${car.mi}" type = "NUMBER"/> mi</p>
									    <a href="${ Car }" class="btn btn-primary">See More</a>
									  </div>
									</div>
								</td>
							</tr>
      			</c:if>
       			</c:forEach>
       		</c:forEach>
       </tbody>
   </table>
   
</div>
</body>
</html>

