<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../Components/ImportJSLogin.jsp" />
<link rel="stylesheet" href="Resources/assets/css/login.css">


</head>
<body>

	
	<form class="materialContainer" action="RegisterController"
		method="post">
		<div class="box">
			<div class="title">SIGN UP</div>
			<div class="input" style="margin-top: 15px;">
				<label for="username">Username</label> <input type="text"
					name="userName" id="username"> <span class="spin"></span>
			</div>

			<div class="input" style="margin-top: 15px;">
				<label for="pass">Password</label> <input type="password"
					name="password" id="pass"> <span class="spin"></span>
			</div>
			
			<div class="input" style="margin-top: 15px;">
				<label for="name">Full Name</label> <input type="text"
					name="fullname" id="name"> <span class="spin"></span>
			</div>
			
			<div class="input" style="margin-top: 15px;">
				<label for="email">Email</label> <input type="text"
					name="email" id="email"> <span class="spin"></span>
			</div>

			
			<div class="button login">
				<button type="submit">
					<span>Next</span> <i class="fa fa-check"></i>
				</button>
			</div>
			<div class="button login"
				style="margin-top: 20px; ">
				<input class="login-register-redirect" type="button" value="Sign In"
					onclick="window.location='LoginRedirectController'">
			</div>

		</div>
	</form>

</body>
</html>