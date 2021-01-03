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
<title>Insert title here</title>
</head>
<body>
	<div class="login-page" >
    	<img src="images/okisa.png" alt="okisa logo" style="width:300px;height:100px; text-align: center;"><br>
  		<div class="form">
    	<h2 style="text-align: center;">Register Here</h2>
    	
    	<form class="login-form" action="reg" method="post">
    	
      		<input type="text" placeholder="name" name="name" />
      		<input type="text" placeholder="username" name="uname" />
      		<input type="text" placeholder="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"/>
      		<input type="text" placeholder="male or female" name="gender" />
      		<input type="text" placeholder="contact number" name="phone" />
      		<input type="text" placeholder="address" name="address" />
      		<input type="password" placeholder="password" name="password"/>
      		<div>
      		<%=(request.getAttribute("errorMsg")==null ? "" :request.getAttribute("errorMsg")) %>
      		</div>
      		<button type="submit" name="submit">Register</button>
      		
      		<p class="message">already have a account? <a href="Login.jsp">login</a></p>
    	
    	</form>
 		 </div>
	</div>
	<!-- form action="reg" method="post">
		Name <input type="text" name="name" value="">
		User Name <input type="text" name="uname" value="">
		Email <input type="text" name="email" value="">
		Gender <select name="gender" id="" >
			   		<option value="" disabled selected></option>
					<option value="male">Male</option>
					<option value="female">Female</option>
					<option value="other">Other</option>
			   </select>
		Phone <input type="text" name="phone" value="">
		Address <input type="text" name="address" value="">
		Password <input type="password" name="password" value="">
		<%=(request.getAttribute("errorMsg")==null ? "" :request.getAttribute("errorMsg")) %>
		<input type="submit" name="submit" value="Register">
	</form>
	<a href="Login.jsp">already have account</a>
	 -->
</body>
</html>