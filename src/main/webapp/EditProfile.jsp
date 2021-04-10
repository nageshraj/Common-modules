<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<script type="text/javascript">
	function formValidation() {
		var uName = document.editProfile.userName;
		var uPhone = document.editProfile.userPhoneNumber;
		var uDOB = document.editProfile.userDOB;
		var uGender = document.editProfile.gender;

		if (userName_validation(uName)) {
				if (userPhoneNumber_validation(uPhone)) {
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

	

	function userPhoneNumber_validation(uPhone) {
		var uPhoneLength = uPhone.value.length;
		var phonenoformat = /^\d{10}$/;

		if (uPhoneLength == 0 || uPhoneLength < 10) {
			alert("PHONE MUST BE 10 DIGITS");
			return false;
		} else {
			if (uPhone.value.match(phonenoformat)) {
				return true;
			} else {
				alert("PHONE NUMBER CAN ONLY CONTAIN DIGITS");
				return false;
			}
		}
	}


</script>

<link rel="stylesheet" href="style.css">


<body>

<div class="header">
		<nav>
		<div class="headerLeft"> <a href="http://localhost:8080/common-module-registration/">HOME </a></div>
			<div class="headerRight"> <a href="http://localhost:8080/common-module-registration/loginPage.jsp">PROFILE </a></div> 
		</nav>

	</div>

	<form name="editProfile" action="editProfile.do"
		onsubmit="return formValidation();">

		<div class="container">
			<div class="row">
				USERNAME: <input type="text" name="userName" size="33" placeholder="${userToUpdate.getUserName()}">
				<br><br>
				EMAIL: <input type="text" name="userEmail" size="38" value="${userToUpdate.getUserEmailId()}">
			</div>
			<br>
			<div class="row">
				PHONE NUMBER: <input type="text" name="userPhoneNumber" size="28" placeholder="${userToUpdate.getUserPhoneNumber()}"><br><br>
				
				DATE-OF-BIRTH: <input type="date" name="userDOB" style="width:200px" value="${userToUpdate.getUserDOB()}">
			</div>
			<div class="row">
			<br> GENDER: <input type="radio" name="gender" value="male">
			<label for="male">MALE</label> <input type="radio" name="gender"
				value="female"> <label for="female">FEMALE</label> <input
				type="radio" name="gender" value="other"> <label for="other">OTHER</label><br><br>
				
			</div>
				<br> <br> <input type="reset"
				value="RESET"> <input type="submit" name="submit"
				value="UPDATE">
		</div>
	</form>

	<div class="footer">
		<pre>CONTACT US                                               since 2021                                           © All rights reserved</pre>
	</div>


</body>
</html>