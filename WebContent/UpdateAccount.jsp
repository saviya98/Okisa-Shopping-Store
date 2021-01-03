<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
function validatePassword() {
  var x = document.getElementById("p1").value;
  var y = document.getElementById("p2").value;
  		if(x==y){
			return true;
		}
		else{
			alert("mismatched");
			return false;
		}
}
</script>
<link rel = "stylesheet" type = "text/css" href = "css/Account.css" />
<meta charset="ISO-8859-1">
<title>Update Okisa Account</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<div style="text-align: center;">
		<h3>Update Account Details</h3>
	</div>
	<%
		String uid = request.getParameter("uid");
		String uname = request.getParameter("uname");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
	%>
	<div class="center">
	<h4>Update Contact Details</h4>
	<form action="upacc" method="post">
		<input type="hidden" name="uname" value="<%= uname%>">
		<input type="hidden" name="uid" value="<%= uid%>">
		Name <input type="text" name="upname" value="<%= name%>">
		Email <input type="text" name="upemail" value="<%= email%>">
		Phone <input type="text" name="upphone" value="<%= phone%>">
		Address <input type="text" name="upaddress" value="<%= address%>">
		<input type="submit" name="submit" value="UPDATE">
		 
	</form>
	</div>
	<div class="center">
	<h4>Change Password</h4>
	<form name="upPass" action="uppass" method="post">
		<input type="hidden" name="uname" value="<%= uname%>">
		<input type="hidden" name="uid" value="<%= uid%>">
		New Password <input type="password" name="p1" id="p1">
		Confirm Password <input type="password" name="p2" id="p2">
		<input type="submit" name="submit" value="UPDATE Password" onclick="validatePassword()">
	</form>
	</div>
	<div class="center">
	<h4>Delete your Account</h4>
	<form action="del" method="post">
		<input type="hidden" name="uid" value="<%= uid%>">
		<input type="submit" name="submit" value="Delete Account">
	</form>
	</div>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>