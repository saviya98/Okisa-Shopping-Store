<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
	body{
		background-image: url('images/17512.jpg');
		background-size: cover;
  		background-attachment: fixed;
  		background-repeat: no-repeat;
	}
</style>
<link rel = "stylesheet" type = "text/css" href = "css/log.css" />
<meta charset="ISO-8859-1">
<title>Signin to Okisa</title>
</head>
<body>
	<div class="login-page" >
    	<img src="images/okisa.png" alt="okisa logo" style="width:300px;height:100px; text-align: center;"><br>
  		<div class="form">
    	<h2 style="text-align: center;">Welcome</h2>
    	
    	<form class="login-form" action="log" method="post">
    	
      		<input type="text" placeholder="username" name="uname" />
      		<input type="password" placeholder="password" name="pass"/>
      		<div>
      			<p style="color:white;"><%=(request.getAttribute("errorMsg")==null ? "" :request.getAttribute("errorMsg")) %></p>
      		</div>
      		<button type="submit" name="submit">Login</button>

      		<p class="message">Not registered? <a href="Register.jsp">Create an account</a></p>
    	
    	</form>
 		 </div>
	</div>
	
	
</body>
</html>