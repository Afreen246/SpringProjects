


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<style>
html, body {
	background-image:
		url('http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg');
	background-size: cover;
	background-repeat: no-repeat;
	height: 100%;
	font-family: 'Numans', sans-serif;
}

.social_icon span {
	font-size: 60px;
	margin-left: 10px;
	color: #FFC312;
}

.social_icon span:hover {
	color: white;
	cursor: pointer;
}

.card-header h3 {
	color: white;
}

.social_icon {
	position: absolute;
	right: 20px;
	top: -45px;
}

.input-group-prepend span {
	width: 50px;
	background-color: #FFC312;
	color: black;
	border: 0 !important;
}

input:focus {
	outline: 0 0 0 0 !important;
	box-shadow: 0 0 0 0 !important;
}

.remember {
	color: white;
}

.remember input {
	width: 20px;
	height: 20px;
	margin-left: 15px;
	margin-right: 5px;
}

.login_btn {
	color: black;
	background-color: #FFC312;
	width: 100px;
}

.login_btn:hover {
	color: black;
	background-color: white;
}

.links {
	color: white;
}

.links a {
	margin-left: 4px;
}
</style>

	<div style="text-align: center">
		<div class="container">
			<div class="d-flex justify-content-center h-100">
				<div class="">
					<div class="">
						<h3>Sign In</h3>
						<div class="d-flex justify-content-end social_icon">
							<span><i class="fab fa-facebook-square"></i></span> <span><i
								class="fab fa-google-plus-square"></i></span> <span><i
								class="fab fa-twitter-square"></i></span>
						</div>
					</div>
					<div class="card-body">


						<form action="lg" method="get">
							<div class="input-group form-group">
								<div class="input-group-prepend">
									<span class="input-group-text"> <i class="fas fa-user"></i></span>
								</div>
<%-- 								<form:input path="name" type="text" --%>
<%-- 									class="form-control placeholder=" username"/> --%>
<%-- 								<form:errors path="name" cssClass="error" /> --%>

							<input type="text" name="usr" class="form-control"
								placeholder="username">

							</div>
							<div class="input-group form-group">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fas fa-key"></i></span>
								</div>
								<input type="password" name="psw" class="form-control"
									placeholder="password">
							</div>
							<div class="row align-items-center remember">
								<input type="checkbox">Remember Me
							</div>
							<div class="form-group">
								<input type="submit" value="Login"
									class="btn float-right login_btn">
							</div>
						</form>



					</div>
					<div class="card-footer">
						<div class="d-flex justify-content-center links">
							Don't have an account?<a href="#">Sign Up</a>
						</div>
						<div class="d-flex justify-content-center">
							<a href="#">Forgot your password?</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>