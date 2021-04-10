<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



<link rel="stylesheet" href="style.css">


</head>
<body>

	<div class="header">
		<nav>
			<div class="headerLeft">WELCOME ${loggedIn.getUserName()}!</div>
			<div class="headerRight">
				<a
					href="http://localhost:8080/common-module-registration/getUserByEmail.jsp">EDIT
					PROFILE </a>&nbsp; &nbsp; &nbsp;
			
				<a
					href="http://localhost:8080/common-module-registration/">LOGOUT </a>
			</div>
		</nav>

	</div>

	<div class="container">

		<div class="row">


			<form action="getProductsByType.do">
				<input type="text" name="productTypeToRetrieve"
					placeholder="Enter type of Product" size="40" style="height: 30px"> <input type="submit"
					value="GET">
			</form>
		</div>
		
		<div class="row"></div>
		
		<div class="row">
		
			<h4>${msg}</h4>

			<center>
			<table style="border: 1px solid;  ">
			
				<!-- <tr> NAME</tr>
				<tr> TYPE</tr>
				<tr> PRICE</tr>
				<tr> QUANTITY</tr>
				<tr> AVAILABILTY</tr> -->

				<c:forEach var="product" items="${productsList}">
					<tr>
						<td>${product.getProductName()}</td>
						<td>${product.getProductType()}</td>
						<td>${product.getProductPrice()}</td>
						<td>${product.getProductQuantity()}</td>
						<td>${product.getProductAvailability()}</td>

					</tr>

				</c:forEach>

			</table>
			</center>

		</div>
		<div class="row">
		<br><br>
			<button
				onclick="location.href ='http://localhost:8080/common-module-registration/addProduct.jsp'">ADD
				PRODUCT</button>

		</div>
	</div>

	<div class="footer">
		<pre>CONTACT US                                               since 2021                                           © All rights reserved</pre>
	</div>


</body>
</html>