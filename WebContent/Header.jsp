<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style >
	.head{
		background-image: url("images/15120a.jpg");
	}
</style>
<link rel = "stylesheet" type = "text/css" href = "css/Accountq.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<header class="head">
	<div class="overlay">
		<img src="images/okisa.png" height="100px" width="300px">
		<p>Welcome <%=session.getAttribute("userName") %></p>
		<%String uname = (String)session.getAttribute("userName"); %>
	</div>
	</header>
	<form action="acc" method="post" id="nameform">
	<input type="hidden" name="uname" value="<%=request.getAttribute("userName") %>">
	</form>
	<div class="navbar">
		<button><a href="Home.jsp">Home</a></button>
		<div class="dropdown">
			<button class="dropbtn">Tops</button>
			<div class="dropdown-content">
				 <a href="#">Ladies</a>
				 <a href="#">Gents</a>
			</div>
		</div>
			<div class="dropdown">
			  <button class="dropbtn">Trousers</button>
			  <div class="dropdown-content">
			  <a href="#">Ladies</a>
			  <a href="#">Gents</a>
			  </div>
			</div>
			<div class="dropdown">
			  <button class="dropbtn">Kids</button>
			  <div class="dropdown-content">
			  <a href="#">Girls</a>
			  <a href="#">Boys</a>
			  </div>
			</div>
		<button type="submit" form="nameform" value="submit">My Account</button>
		<button><a>Payments</a></button>
		<button><a>My Cart</a></button>
		<button><a href="<%=request.getContextPath()%>/logout">Logout</a></button>
	</div>

	

</body>
</html>