<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Account</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="styles/UserAccount.css">
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
<script src="sweetalert2.all.min.js"></script>
<script src="js/alert.js" type="text/javascript" defer></script>
<script src ="js/deleteConfirmation.js" type="text/javascript" defer></script>
</head>
<body>
	<input type = "hidden" id="status" value ="<%=request.getAttribute("status")%>">
	<c:forEach var="us" items="${userDetails}">

		<div class="container rounded bg-white mt-5 mb-5">
			<div class="row">

				<div class="col-md-3 border-right">
					<div
						class="d-flex flex-column align-items-center text-center p-3 py-5">
						<img class="rounded-circle mt-5" width="150px"
							src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg">
						<span class="font-weight-bold">${us.name} </span> <span
							class="text-black-50">${us.email}</span> <span> </span>
							<form method="post" action="DeleteServlet">
							<div class="mt-5 text-center">
								<input type="hidden" name="UID" class="form-control"
									value="${us.name}"> <input type="submit"
									class="btn btn-primary profile-button" id="logOut"
									name="log Out" value="Log out">
							</div>
						</form>
					</div>
				</div>
				
				


				<div class="col-md-5 border-right">
					<div class="p-3 py-5">
						<div
							class="d-flex justify-content-between align-items-center mb-3">
							<h4 class="text-right">Profile Settings</h4>
						</div>

						<form action="UpdateUserServlet" method="post" id="AccountForm">
							<div class="row mt-3">
								<div class="col-md-12">
									<label class="labels">Name</label><input type="text"
										name="name" class="form-control" placeholder="Enter Name"
										value="${us.name}">
								</div>
								<div class="col-md-12">
									<label class="labels">Email</label><input type="email"
										name="email" class="form-control" placeholder="Enter Email"
										value="${us.email}">
								</div>
								<div class="col-md-12">
									<label class="labels">NIC</label><input type="text" name="NIC"
										class="form-control" placeholder="Enter NIC" value="${us.NIC}">
								</div>
								<div class="col-md-12">
									<label class="labels">Password</label><input type="text"
										name="password" class="form-control"
										placeholder="Enter Password" value="${us.password}">
								</div>
								<div class="col-md-12">
									<label class="labels">Telephone</label><input type="text"
										name="telephone" class="form-control"
										placeholder="Enter Telephone" value="${us.telephone}">
								</div>
								<input type="hidden" name="UID" class="form-control"
									value="${us.UID}">
							</div>
							<div class="mt-5 text-center">
								<input type="submit" class="btn btn-primary profile-button"
									id="update" name="update" value="Update Profile">
							</div>
						</form>
						<form method="post" action="SetSessionServlet">
							<div class="mt-5 text-center">
								<input type="hidden" name="UID" class="form-control"
									value="${us.UID}"> <input type="submit"
									class="btn btn-primary profile-button" id="continue"
									name="continue" value="Continue">
							</div>
						</form>
						<form method="post" action="DeleteUserServlet" id = "deleteForm"> 
							<div class="mt-5 text-center">
								<input type="hidden" name="UID" class="form-control"
									value="${us.UID}"> <input type="submit"
									class="btn btn-primary profile-button" id="delete"
									name="delete" value="Delete Profile">
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		
	</c:forEach>
	
</body>
</html>