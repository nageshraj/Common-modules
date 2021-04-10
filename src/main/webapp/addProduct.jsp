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
		var pName = document.addProduct.productName;
		var pType = document.addProduct.productType;
		var pPrice = document.addProduct.productPrice;
		var pQuantity = document.addProduct.productQuantity;
		var pAvailability = document.addProduct.productAvailability;

		if (pName_validation(pName)) {
			if (pType_validation(pType)) {
				if (pPrice_validation(pPrice)) {
					if (pQuantity_validation(pQuantity)) {
						if (pAvailability_validation(pAvailability)) {

							return true;
						}
					}
				}
			}
		}
		return false;

	}

	function pName_validation(pName) {
		var pNameLength = pName.value.length;
		var letters = /^[0-9a-zA-Z]+$/;
		if (pNameLength == 0 || pNameLength<3 || pNameLength>18) {
			alert("PRODUCT NAME MUST BE BETWEEN LENGTH 3-18");
			return false;
		} else {
			if (pName.value.match(letters)) {
				return true;
			} else {
				alert("PRODUCT NAME MUST HAVE ONLY ALPHANUMERIC CHARACTERS");
				return false;
			}

		}

	}

	function pType_validation(pType) {

		var pTypeLength = pType.value.length;
		var letters = /^[A-Za-z]+$/;
		if (pTypeLength == 0 || pTypeLength<3 || pTypeLength>18) {
			alert("PRODUCT TYPE MUST BE BETWEEN LENGTH 3-18");
			return false;
		} else {
			if (pType.value.match(letters)) {
				return true;
			} else {
				alert("PRODUCT NAME MUST HAVE ONLY ALPHABET CHARACTERS");
				return false;
			}

		}
	}

	function pPrice_validation(pPrice) {
		var pPriceLength = uPhone.value.length;
		var priceformat = /^\d{10}$/;

		if (pPriceLength == 0 || pPriceLength < 10) {
			alert("PRICE MUST BE BETWEEN LENGTH 0 - 10");
			return false;
		} else {
			if (uPhone.value.match(priceformat)) {
				return true;
			} else {
				alert("PRICE CAN ONLY CONTAIN DIGITS");
				return false;
			}
		}
	}

	function pQuantity_validation(pQuantity) {

		var pQuantityLength = pQuantity.value.length;
		var quantityFormat = /^\d{5}$/;
		if (pQuantity.value.match(quantityFormat)) {
			return true;

		} else {
			alert("QUANTITY MUST BE CONTAIN ONLY DIGITS AND BE BETWEEN 1-99999");
			return false;
		}
	}

	
	function pAvailability_validation(pAvailability) {
		if (pAvailability=="NO" || pAvailability=="YES"){
			return true;

		} else {
			alert("AVAILABILITY CAN ONLY BE 'YES' OR 'NO'");
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
					href="http://localhost:8080/common-module-registration/successfulLogin.jsp">PROFILE
				</a> &nbsp; &nbsp; &nbsp; <a
					href="http://localhost:8080/common-module-registration/">LOGOUT
				</a>
			</div>
		</nav>

	</div>

	<form name="addProduct" action="addProduct.do"
		onsubmit="return formValidation();">

		<div class="container">
			<div class="row">
				PRODUCT NAME: <input type="text" name="productName" size="35"><br>
				<br> PRODUCT TYPE: <input type="text" name="productType"
					size="35">
			</div>
			<br>
			<div class="row">
				PRODUCT PRICE: <input type="text" name="productPrice" size="34"><br>
				<br>PRODUCT QUANTITY: <input type="text" name="productQuantity"
					size="30"><br> <br>
			</div>

			<div class="row">
				AVAILABILITY: <input type="text" name="productAvailability"
					size="36" style="text-transform: uppercase"><br>
			</div>
			<br> <br> <br> <input type="reset" value="RESET">
			<input type="submit" name="submit" value="SUBMIT">
		</div>
	</form>

	<div class="footer">
		<pre>CONTACT US                                               since 2021                                           © All rights reserved</pre>
	</div>







</body>
</html>