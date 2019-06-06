<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN | MPL</title>
<script type="text/javascript" src="static/js/Login.js"></script>
<link rel="stylesheet" href="static/css/Login.css">
</head>
<body>
	<div id="container">
		<div id="upper">
				<h2>Welcome to My Personalized Library</h2>
		</div>
		<form action="UserAuthentication" method="post" >
			<label id="error"><% if(request.getAttribute("loginErrMsg") != null){out.println("Invalid Login Details");}%></label>
			<br>
			<label for="username">Username :</label>
			<input type="text" id="username" name="username" required="required"> 
			<label for="password">Password :</label>
			<input type="password" id="password" name="password" required="required">
			<div id="lower">
				<div style="float:left; display:inline">
					<label>New User?</label> 
					<input type="submit" onclick="location.href = './view/register.jsp';" value="Register">
				</div>
				<input type="submit" value="Login">
			</div>
			<!--/ lower-->
		</form>
	</div>
</body>
</html>