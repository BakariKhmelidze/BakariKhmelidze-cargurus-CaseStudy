<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<style>
.img1{
		background-image: url(<c:url value="/resources/images/mike@2x.jpg"></c:url>); 
		top:0; 
		left:0; 
		bottom: 0; 
		height: 65%; 
		width: 100%; 
		background-size: 100% 100%;
}
</style>

<head>

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
</div>
  <div class="img1">
  	<div class="container">
  	<div class="row">
  	  	
  	  </div>
  	  <div class="row" style="margin-top: 100px;">
  	  	<div>
  	  	<h1 style="color: white; text-shadow: 1px 1px 2px #0a0a0a;">Welcome Back!</h1>
  	  	</div>
  	  </div>
  	  <form:form action="cars/list" modelAttribute="make1">
	  <div class="row" style="background-color: white; max-width: 700px;">
	  			<hr class="tophr">
	  			<form:form action="cars/list" modelAttribute="make1">
			    <div class="col-sm">
				      <form:select	path="make" onChange="myFunction(value)" cssClass='drp' >
						   <form:option value = "All Make" label = "All Makes" cssClass='label'/>
						   <form:options items = "${make}" itemLabel="Make" itemValue="Make" />
					  </form:select> 
				 </div>
				    <div class="col-sm">
				      <form:select path="make" id="drp" cssClass='drp' >
						   <form:option id="const" value = "Model" label = "All Models"/>
					  </form:select> 
				    </div>
				    <div class="col-sm">
				      <input type="Submit" value="Search"></input>
				    </div>
			    </form:form>
			    <hr class="bothr">
			  </div>
			  </form:form>
	  	</div>
  </div>
</body>
 <script type="text/javascript">
function myFunction(v){
	var element = document.getElementById("drp");
	var parent = document.getElementById("drp");
	console.log(parent);
	while(parent.children[1]){
		parent.removeChild(parent.children[1]);
	}

	<c:forEach items="${make}" var="m">
		var make = '<c:out value="${m.make}"/>';
		<c:forEach items="${m.modellist}" var="model">
			if (make == v){
				var selection = document.createElement("option");
				selection.innerHTML = "${model.model}";
				selection.value = "${model.model}";
				element.appendChild(selection);
			}
		</c:forEach>
	</c:forEach>
}
</script>
</html>


