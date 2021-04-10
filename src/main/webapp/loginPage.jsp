<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="style.css">

<script type="text/javascript">
	function formValidation() {
		var uName = document.login.loginUserName;
		var uPassword = document.login.loginUserPassword;

		if (userName_validation(uName)) {
			if (userPassword_validation(uPassword)) {
				return true;
			}
		}
		return false;
	}

	function userName_validation(uName) {
		var uNameLength = uName.value.length;
		var letters = /^[0-9a-zA-Z]+$/;
		if (uNameLength == 0 || uNameLength<3 || uNameLength>18) {
			alert("USERNAME MUST BE BETWEEN LENGTH 3-18");
			return false;
		} else {
			if (uName.value.match(letters)) {
				return true;
			} else {
				alert("USERNAME MUST HAVE ONLY ALPHANUMERIC CHARACTERS");
				return false;
			}

		}

	}

	function userPassword_validation(uPassword) {

		var uPasswordLength = uPassword.value.length;
		var passwordFormat = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,18}$/;
		if (uPassword.value.match(passwordFormat)) {
			return true;

		} else {
			alert("PASSWORD MUST HAVE ATLEAST 1 UPPERCASE, 1 DIGIT and 1 LOWERCASE and LENGTH: 8-18");
			return false;
		}
	}
</script>

</head>
<body>

	<div class="header">
		<nav>
			<div class="headerLeft">
				<a href="http://localhost:8080/common-module-registration/">HOME
				</a>
			</div>
			<div class="headerRight">
				<a
					href="http://localhost:8080/common-module-registration/registrationPage.jsp">REGISTER
				</a>
			</div>

		</nav>

	</div>

	<form action="login.do" name="login"
		onsubmit="return formValidation();">
		USERNAME: <input type="text" name="loginUserName"><br> <br>
		PASSWORD: <input type="password" name="loginUserPassword"> <br>
		<br> <input type="reset" value="RESET"> <input
			type="submit" value="LOGIN">

	</form>


	<div class="footer">
		<pre>CONTACT US                                                 since 2021                                           © All rights reserved</pre>
	</div>

</body>
</html>