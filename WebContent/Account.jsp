<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel = "stylesheet" type = "text/css" href = "css/Account.css" />
<meta charset="ISO-8859-1">
<title>Account Okisa</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
		<h1>MY ACCOUNT</h1>
	</div>
	<div class="center">
	<table>
	<c:forEach var="user" items="${userDetails}">
	
	<c:set var="uid" value="${user.userID}"/>
	<c:set var="name" value="${user.name}"/>
	<c:set var="uname" value="${user.userName}"/>
	<c:set var="email" value="${user.email}"/>
	<c:set var="gender" value="${user.gender}"/>
	<c:set var="phone" value="${user.phone}"/>
	<c:set var="address" value="${user.address}"/>
	<c:set var="password" value="${user.password}"/>
	<tr>
		<td>User ID</td>
		<td> ${user.userID}</td>
	</tr>
	<tr>
		<td>Name</td>
		<td> ${user.name}</td>
	</tr>
	<tr>
		<td>User Name</td>
		<td> ${user.userName}</td>
	</tr>
	<tr>
		<td>Email</td>
		<td> ${user.email}</td>
	</tr>
	<tr>
		<td>Gender</td>
		<td> ${user.gender}</td>
	</tr>
	<tr>
		<td>Phone</td>
		<td> ${user.phone}</td>
	</tr>
	<tr>
		<td>Address</td>
		<td> ${user.address}</td>
	</tr>
	</c:forEach>
				
	
	<c:url value="UpdateAccount.jsp" var="updateAccount">
		<c:param name="uid" value="${uid}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="uname" value="${uname}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="gender" value="${gender}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="password" value="${password}"/>
	</c:url>

	<tr>
	<td>
	<a href ="${updateAccount}">
	<input type="button" name="submit" value="Update Account Details">
	</a>
	</td>
	</tr>
	</table>
	</div>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>