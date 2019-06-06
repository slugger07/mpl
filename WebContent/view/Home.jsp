<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*,com.yash.plm.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="static/css/Home.css">
<title>Welcome</title>
</head>
<body>
<a id="logout" style="margin-top:30px; margin-left:1290px" href="LogoutController">Logout</a>
<%
User user = (User)request.getSession().getAttribute("user");
String username = null;
if(user==null){%>
<jsp:forward page="./login.jsp"></jsp:forward>
	<%}
else{
	username = user.getName();
}
%>
	<h1>Personal Library Management</h1>
	<br><br>
	<p>" Good friends, good books, and a sleepy conscience: this is the ideal life."</p>
	<br>
	<p style="margin-left:250px">Hello <%= username %> </p>
	<form action="HomeController" method="post">
		<br><br>
		<button id="add" type="submit" name=add value="add">Add Book To Collection</button> 
		<button id="view" type="submit" name = view value="view">View Book Collection</button>
	</form>
	</body>
</html>