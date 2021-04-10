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
		var uEmail = document.getUser.emailToGetUser;

		if (userEmailId_validation(uEmail)) {
			return true;
		}
		return false;

	}

	function userEmailId_validation(uEmail) {
		var uEmailLength = uEmail.value.length;
		var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
		if (uEmailLength == 0 || uEmailLength<5 ||uEmailLength>56) {
			alert("EMAIL MUST BE BETWEEN LENGTH 5-56");
			return false;
		} else {
			if (uEmail.value.match(mailformat)) {
				return true;
			} else {
				alert("EMAIL FORMAT NOT MATCHING");
				return false;
			}
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
					href="http://localhost:8080/common-module-registration/successfulLogin.jsp">PROFILE
				</a>
			</div>
		</nav>

	</div>

	<form action="getUser.do" name="getUser"
		onsubmit="return formValidation();">
		EMAIL: <input type="text" name="emailToGetUser" size="30" style="height: 30px"> <input
			type="submit" value="GET">

	</form>


	<div class="footer">
		<pre>CONTACT US                                               since 2021                                           © All rights reserved</pre>
	</div>

</body>
</html>