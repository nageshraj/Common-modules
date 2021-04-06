<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	function formValidation() {
		var uName = document.registration.userName;
		var uEmail = document.registration.userEmailId;
		var uPhone = document.registration.userPhoneNumber;
		var uDOB = document.registration.userDOB;
		var uGender = document.registration.gender;
		var uPassword = document.registration.userPassword;
		var uPasswordConfirm = document.registration.confirmUserPassword;

		if (userName_validation(uName)) {
			if (userEmailId_validation(uEmail)) {
				if (userPhoneNumber_validation(uPhone)) {
					if (userPassword_validation(uPassword)) {
						if (uPasswordConfirm_validation(uPassword,
								uPasswordConfirm))
							return true;
					}
				}
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

	function uPasswordConfirm_validation(uPassword, uPasswordConfirm) {
		if (uPassword.value == uPasswordConfirm.value) {
			return true;
		} else {
			alert("PASSWORDS DO NOT MATCH");
			return false;
		}
	}
</script>

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
		<div class="headerLeft"> <a href="https://web.whatsapp.com/">HOME </a></div>
			<div class="headerRight"> <a href="https://web.whatsapp.com/">SIGN OUT </a></div> 
		</nav>

	</div>

	<form name="registration" action="register.do"
		onsubmit="return formValidation();">

		<div class="container">
			<div class="row">
				USERNAME: <input type="text" name="userName" size="30">
				EMAIL ID: <input type="text" name="userEmailId" size="30">
			</div>
			<br>
			<div class="row">
				PHONE NUMBER: <input type="text" name="userPhoneNumber" size="30">
				DATE-OF-BIRTH: <input type="date" name="userDOB">
			</div>
			<div class="row">
			<br> GENDER: <input type="radio" name="gender" value="male">
			<label for="male">MALE</label> <input type="radio" name="gender"
				value="female"> <label for="female">FEMALE</label> <input
				type="radio" name="gender" value="other"> <label for="other">OTHER</label><br><br>
				
			</div>
			<div class="row">
			PASSWORD: <input type="password" name="userPassword" size="42"><br><br>
			CONFIRM PASSWORD: <input type="password" name="confirmUserPassword"
				size="30">
				</div>
				<br> <br> <br> <input type="reset"
				value="RESET"> <input type="submit" name="submit"
				value="SUBMIT">
		</div>
	</form>

	<div class="footer">
		<pre>CONTACT US                                               since 2021                                           © All rights reserved</pre>
	</div>

</body>
</html>