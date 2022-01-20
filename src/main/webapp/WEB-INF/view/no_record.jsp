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
   <h3>No Records For the Selected Model and Make</h3>
   <a href="/spring-crm-rest">Go Back</a>
</div>
</body>
</html>

