<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Find Gold</title>
</head>
<body>
		<h1>NINJA GOLD!!!</h1>
		<h3>Your Gold:</h3>
		<div class="side">${total}</div>
		<div class="row">
		    <div class="col-4-md">
		    	<form action="/farm" method="POST">
		    		
		    		<h3> Farm</h3>
		    		<p>(earns 10-20 golds)</p>
		    		<button type="submit" name="farm"  class="btn btn-success">Find gold!</button>
		    	</form>
		    </div>
		    <div class="col-4-md">
		    	<form action="/cave" method="POST">
		    		
		    		<h3> Cave </h3>
		    		<p>(earns 5-10 golds)</p>
		    		<button type="submit" name="cave" class="btn btn-success">Find gold!</button>
		    	</form>
		    </div >
		    <div class="col-4-md">
		    	<form action="/house" method="POST">
		    		
		    		<h3> House</h3>
		    		<p>(earns 2-5 golds)</p>
		    		<button type="submit" name="house" class="btn btn-success">Find gold!</button>
		    	</form>
		    </div>
		    <div class="col-4-md">
		    	<form action="/casino" method="POST">
		    		
		    		<h3> Casino</h3>
		    		<p>(earns/takes 0-50 golds)</p>
		    		<button type="submit" name="casino" class="btn btn-success">Find gold!</button>
		    	</form>
		    </div>
		    <div class="col-4-md" id="spa">
		    	<form action="/spa" method="POST">
		    		
		    		<h3>Spa</h3>
		    		<p>(enter and find out)</p>
		    		<button type="submit" name="spa" class="btn btn-success">Find gold!</button>
		    	</form>
		    </div>
	  	</div>
	  	
	  	<form action="reset" method="POST">
	  		 
	  		<button type="submit" name="submit" value="reset" class="btn btn-warning">RESET</button>
	  	</form>
	  	
	
		<h3>Activities:</h3>
		<div class="bottom">
		<pre>${msg}</pre>
		</div>
</body>
</html>