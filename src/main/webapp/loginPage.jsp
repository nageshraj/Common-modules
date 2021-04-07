<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
body {
	padding-top: 80px;
	padding-bottom: 40px;
	text-align: center;
}

.header {
	width: 100%;
	position: fixed;
	background: #333;
	padding: 10px 0;
	color: #fff;
	top: 0;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: red;
	color: white;
	text-align: center;
}

a {
	color: white;
}

 input[type = submit], input[type = reset] {
            background-color: grey;
            border: none;
            text-decoration: none;
            color: white;
            padding: 20px 20px;
            margin: 20px 20px;
            cursor: pointer;
         }
         
 .headerLeft{
 text-align: left;
 margin-left: 20px;
 }

.headerRight{
text-align: right;
margin-right: 20px;
}

</style>
</head>
<body>

<div class="header">
		<nav>
		<div class="headerLeft"> <a href="http://localhost:8080/common-module-registration/">HOME </a></div>
			<div class="headerRight"> <a href="http://localhost:8080/common-module-registration/registrationPage.jsp">REGISTER </a></div> 
		</nav>

	</div>

	<form action="login.do">
		USERNAME: <input type="text" name="loginUserName"><br><br> PASSWORD: <input
			type="password" name="loginUserPassword"> <br><input type="reset"
			value="RESET"> <input type="submit" value="LOGIN">

	</form>
	
	
	<div class="footer">
		<pre>CONTACT US                                               since 2021                                           © All rights reserved</pre>
	</div>

</body>
</html>