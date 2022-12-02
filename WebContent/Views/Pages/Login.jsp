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


	<form class="materialContainer" action="LoginController" method="post">
		<div class="box">
			<div class="title">LOGIN</div>
			<div class="input">
				<label for="name">Username</label> <input type="text"
					name="userName" id="name"> <span class="spin"></span>
			</div>

			<div class="input">
				<label for="pass">Password</label> <input type="password"
					name="password" id="pass"> <span class="spin"></span>
			</div>

			<div class="button login">
				<button type="submit">
					<span>GO</span> <i class="fa fa-check"></i>
				</button>
			</div>
			<div class="button login"
				style="margin-top: 20px; margin-bottom: 40px;">
				<input class="login-register-redirect" type="button" value="Sign Up"
					onclick="window.location='RegisterRedirectController'">
			</div>
			<a href="" class="pass-forgot">Forgot your password?</a>

		</div>

	</form>

</body>
</html>