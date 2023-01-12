<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Login</title>
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="sweetalert2.all.min.js"></script>
<script src="js/alert.js" type="text/javascript" defer></script>
<script src="js/loginValidation.js" type="text/javascript" defer></script>
<!-- Font Icon -->
<link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Main css -->
<link rel="stylesheet" href="styles/loginStyle.css">
</head>
<body>
	<input type="hidden" id="status"
		value="<%=request.getAttribute("status")%>">

	<div class="main">

		<!-- Login  Form -->
		<section class="sign-in">
			<div class="container">
				<div class="signin-content">
					<div class="signin-image">
						<figure>
							<img src="images/signin-image.jpg" alt="login image">
						</figure>
						<a href="registration.jsp" class="signup-image-link">Not
							Registered?<br> Create an account
						</a>
					</div>

					<div class="signin-form">
						<h2 class="form-title">Login</h2>

						<form method="post" action="LoginServlet" class="register-form"
							id="login-form">
							<div class="form-group">
								<label for="Email"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="email" name="email" id="email"
									value="<%if (request.getParameter("email") != null) {
												out.println(request.getParameter("email"));
											}%>"
									placeholder="Your Email"  required/>
							</div>
							<div class="form-group">
								<label for="password"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="password" id="password"
									placeholder="Password" required/>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signin" id="signin"
									class="form-submit" value="Login" />
							</div>
						</form>
					</div>
				</div>
			</div>
		</section>

	</div>


</body>
</html>