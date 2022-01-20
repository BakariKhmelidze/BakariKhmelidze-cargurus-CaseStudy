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
<div class="container" style="border: 0.5px solid transparent">
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
	   <h2 style="text-align: center">
		   <c:forEach items="${car.modellist}" var="model"> 
		   		<c:forEach items="${model.carlist}" var="c">
		   			<c:out value="${c.year}"/>
			   		<c:out value="${car.make}"/>
			   		<c:out value="${model.model}"/>
			   		<c:out value="${c.drivetrain}"/>
			   		-
			   		<fmt:setLocale value = "en_US"/>
		            <fmt:formatNumber value = "${c.price}" type = "currency"/>
		   		</c:forEach>
		   	</c:forEach>
	   </h2>
	   <h4 style="color: rgb(87,92,92); text-align: center;">Home delivery available</h4>
	     <div class="row" style="margin-top: 70px;">
	     	<c:forEach items="${car.modellist}" var="model"> 
		   		<c:forEach items="${model.carlist}" var="c">
		   			<div class="col-sm">
				      <img src="${c.img}" style="border: 1px solid rgb(218,224,229)">
				    </div>
				    <div class="col-sm" style="background-color: rgb(245,246,246); border: 1px solid rgb(218,224,229);" >
				    	<div class="row" style="margin-top: 50px;">
								<div class="col" style="text-align: center;">
									<h3>Vehicle Description</h3>
								</div>
							</div>
				    	<div class="row" style="margin-top: 15px;">
				    		<div class="col-4" style="font-weight: bold; font-size: 18px;">
				    			<p>Dealers price:<p>
				    			<p>Mileage:<p>
				    			<p>Transmission:<p>
				    			<p>Exterior Color:<p>
				    			<p>Interior Color:</p>
				    			<p>Drivetrain:</p>
				    		</div>
				    		<div class="col-8" style="font-size: 18px;">
				    			<p><b><fmt:setLocale value = "en_US"/>
         							  <fmt:formatNumber value = "${c.price}" type = "currency"/></b><p>
         						<p><fmt:setLocale value = "en_US"/> 
         							<fmt:formatNumber value = "${c.mi}" type = "NUMBER"/></p>
         						<p>${c.transmission}</p>
         						<p>${c.ex_color}</p>
         						<p>${c.int_color}</p>
         						<p>${c.drivetrain}</p>
				    		</div>
				    	</div>
				    </div>
		   		</c:forEach>
		   	</c:forEach>
  		</div>
   </div>
   </body>
   </html>