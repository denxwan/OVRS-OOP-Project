<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Registration</title>
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="sweetalert2.all.min.js"></script>
<script src="js/alert.js" type="text/javascript" defer></script>
<script src="js/registraionValidation.js" type="text/javascript" defer></script>
<!-- Font Icon -->
 <link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- Main css -->
<link rel="stylesheet" href="styles/loginStyle.css">
</head>
<body>
	<input type="hidden" id="status"
		value="<%=request.getAttribute("status")%>">
	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Sign up</h2>
					
						<form method="post" action="UserRegistrationServlet" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Your Name"
									value="<%if (request.getParameter("name") != null) {
												out.println(request.getParameter("name"));
											}%>"
									 required />
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email" 
									value="<%if (request.getParameter("email") != null) {
												out.println(request.getParameter("email"));
											}%>"
									required/>
							</div>
							<div class="form-group">
								<label for="NIC"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="NIC" id="NIC" placeholder="NIC" 
									value="<%if (request.getParameter("NIC") != null) {
												out.println(request.getParameter("NIC"));
											}%>"
									required/>
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="password" id="password"
									placeholder="Password" 
									value="<%if (request.getParameter("password") != null) {
												out.println(request.getParameter("password"));
											}%>"
									required/>
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re-password" id="re-password"
									placeholder="Confirm Password" required/>
							</div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="text" name="telephone" id="telephone"
									placeholder="Contact no" 
									value="<%if (request.getParameter("telephone") != null) {
												out.println(request.getParameter("telephone"));
											}%>"
									required/>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img src="images/signup-image.jpg" alt="sign up image">
						</figure>
						<a href="login.jsp" class="signup-image-link">Already
							a member?</a>
					</div>
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>



</body>
</html>