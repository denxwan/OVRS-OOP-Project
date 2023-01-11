<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta charset="ISO-8859-1"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<!-- <body> -->

<!DOCTYPE html>
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="styles/basic_styles.css"> 
    <link rel="stylesheet" href="styles/searchResults_styles.css">
    <link rel="shortcut icon" type="image/png" href="images/logo_symbol.png">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/navbar-fixed/">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
    <link rel="preconnect" href="https://fonts.googleapis.com"> 
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin> 
	<link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,400;0,600;0,800;1,100;1,200&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com"> 
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin> 
    <link href="https://fonts.googleapis.com/css2?family=Yanone+Kaffeesatz:wght@300;400;700&display=swap" rel="stylesheet">
    <title>
        Destinare : Car Rentals
    </title>
    <link href="assets/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="icon" type="image/x-icon" href="images/Logo_icon.ico">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
      
      	table, th, td {
 			border: 2px solid;
		}
		
		th, td {
			text-align: center;
		}
    </style>

    <link href="styles/navbar-top-fixed.css" rel="stylesheet">
    <link href="styles/sticky-footer.css" rel="stylesheet">
</head>

<body class="d-flex flex-column h-100">
    <!--Header-->
    <nav class="navbar navbar-expand-md navbar-light fixed-top" style="background-color: white;">
        <div class="container-fluid">
          <a class="navbar-brand" href="index.jsp"><img class="d-inline-block" src="images/Logo_1.png" width="120px" height=auto style="padding-left: 15px"></a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse justify-content-md-center" id="navbarCollapse">
            <ul class="navbar-nav me-auto mb-2 mb-md-0">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Vehicle Fleet</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Services</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Rates</a>
              </li>
<!--               <li class="nav-item"> -->
<!--                 <a class="nav-link" href="viewReviews.jsp">Reviews</a> -->
<!--               </li> -->
              <li class="nav-item">
                <a class="nav-link" href="#">Contact</a>
              </li>
              <!--
              <li class="nav-item">
                <a class="nav-link disabled">Disabled</a>
              </li>
              -->
            </ul>
            <!--
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                -->
                <span class="new-123">
                	<div style="display: flex; flex: wrap;">
            			<form action="vreview" method="post">
                    		<button class="basic-btn-2" type="submit">Reviews</button>
            			</form>
           				<form class="d-flex" action ="ManageSessionServlet" method="POST">
                    		<button class="basic-btn" type="submit" onclick="bookPopup()">Book a vehicle</button>
                    		<button class="basic-btn" type="submit"><%if (session.getAttribute("Name") != null) { out.println(session.getAttribute("Name").toString()); } else { out.println("Login | Register"); } %></button>
            			</form>
            		</div>
                </span>
          </div>
        </div>
    </nav>

    <!--Add your code here :)-->
    
    
<!--     <div class="popup-1" id="popup-123" hidden> -->
        
<!--         <div class="popup-container"> -->
<!--             <div><label class="title-1" style="color: black; text-align: center;">Booking a Vehicle?</label></div> -->
<!--             <div class="popup-container-2"> -->
<!--                 <label>If you're in a hurry, do a quick booking without being login/registered to the website.</label> -->
<!--                 <button class="basic-btn">Quick Booking</button> -->
<!--             </div> -->
<!--             <div class="hz-line"></div> -->
<!--             <div class="popup-container-2"> -->
<!--                 <label>Or you can make a booking as a registered user and track your process.</label> -->
<!--                 <button class="basic-btn">Registered Booking</button> -->
<!--             </div> -->
<!--         </div> -->
<!--     </div> -->
    
    <br>

    <div class="overlay-1" id="overlay-123" style="display: none">
    	<div style="display: flex; flex-flow: column; height: 100%;" class="overlay-1"></div>
    </div>
    <div class="popup-1" id="popup-123" style="display: none;">
        
        <button class="basic-btn" style="position: absolute; margin-left: 20px; margin-top: -30px" id="cancel" onclick="cancel()">X</button>
        <div class="popup-container">
            <div><label class="title-1" style="color: black; text-align: center;">Booking a Vehicle?</label></div>
            <div class="popup-container-2">
                <label>If you're in a hurry, do a quick booking without being login/registered to the website.</label>
                <form action="tobooking" method="post">
                	<input id="bookingtype" name="bookingType" type="text" value="quick" hidden>
                	<input id="vid1" name="vehicleID" type="text" value="" hidden>
                	<button class="basic-btn">Quick Booking</button>
                </form>
            </div>
            <div class="hz-line"></div>
            <div class="popup-container-2">
                <label>Or you can make a booking as a registered user and track your process.</label>
                <form action="tobooking" method="post">
                	<input id="bookingtype" name="bookingType" type="text" value="full" hidden>
                	<input id="vid2" name="vehicleID" type="text" value="" hidden>
                	<button class="basic-btn">Registered Booking</button>
                </form>
            </div>
        </div>
    </div>


	<div class="text-center">
        <label style="margin-bottom: -200px;" class="title-1">Search Results</label><br>
        <label class="title-2">Free cancellations on most bookings   |   60,000+ locations   |   Customer support 24/7</label>
    </div>

	<center>
    <div class="form-container">
    <div>
	<label style="font-size: 30px">Showing available vehicles for <b><label id="tt" style="font-style: bold; color: rgb(255, 97, 39);">x</label></b> trip type,</label>
	</div>
	<table class="table-basic">
		<tr>
			<th>Image</th>
<!-- 			<th>Vehicle ID</th> -->
			<th>Vehicle Type</th>
			<th>No Of Passengers</th>
<!-- 			<th>Trip Type</th> -->
<!-- 			<th>Status</th> -->
			<th></th>
		</tr>
		
		<c:forEach var="av" items="${avDetails}">
	
<%-- 		${av.aid} --%>
<%-- 		${av.vid} --%>
<%-- 		${av.tt} --%>
<%-- 		${av.status} --%>
	
		<tr>
			<td width=400px><center> <img src="" id="${av.vid}"> </center></td>
<%-- 			<td>${av.vid}</td> --%>
			<td>${av.vt}</td>
			<td>${av.nop}</td>
<%-- 			<td>${av.tt}</td> --%>
<%-- 			<td>${av.status}</td> --%>
<!-- 			<form id="booking" action="tobooking" method="post"> -->
				<td width="200px">
					<input hidden type="text" name="vehicleID" value="${av.vid}"></input>
					<button class="basic-btn" onclick="clickNew(${av.vid})">Book this</button>
				</td>
<!-- 			</form> -->
		</tr>

	</c:forEach>
	</table>
	
	<div class="form-dynamic" style="justify-content:center; padding-top: 30px;">
		<button class="basic-btn" name="submit">Proceed to booking</button>
		<a href="index.jsp"><button class="basic-btn" name="submit">Search again</button></a>
	</div>
	
	</div>
	</center>

<br><br><br><br><br><br><br><br><br><br>

<!--Footer-->
    <div class="footer-clean">
      <footer>
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-sm-4 col-md-3 item">
                    <h3>Services</h3>
                    <ul>
                        <li><a href="#">Weddings & VIP Hires</a></li>
                        <li><a href="#">Airport Pickups</a></li>
                        <li><a href="#">Corporate Rental</a></li>
                        <li><a href="#">Self Drive Rental</a></li>
                        <li><a href="#">Moving Truck and Lorry Services</a></li>
                    </ul>
                </div>
                <div class="col-sm-4 col-md-3 item">
                    <h3>Business Center</h3>
                    <ul>
                        <li><a href="#">Corporate Account</a></li>
                        <li><a href="#">Business Solutions</a></li>
                        <li><a href="#">Tour Operators</a></li>
                        <li><a href="#">Travel Agents</a></li>
                    </ul>
                </div>
                <div class="col-sm-4 col-md-3 item">
                    <h3>Legal Information</h3>
                    <ul>
                        <li><a href="#">Damage Management Policy</a></li>
                        <li><a href="#">Deposit Policy</a></li>
                        <li><a href="#">Security and Privacy Policy</a></li>
                        <li><a href="#">Terms and Conditions</a></li>
                        <li><a href="#">Important Information</a></li>
                    </ul>
                </div>
                <!--
                <div class="col-lg-3 item social"><a href="#"><i class="icon ion-social-facebook"></i></a><a href="#"><i class="icon ion-social-twitter"></i></a><a href="#"><i class="icon ion-social-snapchat"></i></a><a href="#"><i class="icon ion-social-instagram"></i></a>
                    <p class="copyright">Company Name © 2018</p>
                </div>
                -->
                <center><p class="message">OOP Group Project by Group_151 © 2022</p></center>
            </div>
            
        </div>
        
      </footer>
    </div>
      
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
	<script src="sweetalert2.all.min.js"></script>
    <script src="js/basic_script.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<script>
	
		function clickNew(vehicleID) {
			document.getElementById("popup-123").style.display = "block";
			document.getElementById("overlay-123").style.display = "block";
			console.log("testing");
			
			//var form = document.getElementById("booking");
			//form.addEventListener("submit", (event) => { event.preventDefault(); });
			
			document.body.style.overflow = "hidden";
			
			console.log(vehicleID);
			document.getElementById("vid1").value = vehicleID;
			document.getElementById("vid2").value = vehicleID;
		}
		
		function cancel() {
			document.getElementById("popup-123").style.display = "none";
			document.getElementById("overlay-123").style.display = "none";
			document.body.style.overflow = "scroll";
		}
	
	
		<c:forEach var="av" items="${avDetails}">
			//var form = document.getElementById("${av.vid}");
		
			//var img_placeholder = document.getElementById("${av.vid}");	
			var type = "${av.vt}";
			var typeVer = ${av.tv};
			var tt = "";
			
			if("${av.tt}"=="ap")
			{
				tt = "Airport Pickup";
				console.log(tt);
			}
			else if("${av.tt}"=="pp")
			{
				tt = "Normal Pickup";
			}
			else if("${av.tt}"=="sd")
			{
				tt = "Self Drive";
			}
			
			
			//console.log("this is inside the script" + type);
			switch("${av.vt}")
			{
				case "Car" : 	switch(typeVer)
								{
									case 1 : 	document.getElementById("${av.vid}").src ="images/car_image.png";
												break;
												
									case 2 : 	document.getElementById("${av.vid}").src ="images/car2_image.png";
												break;
												
									case 3 : 	document.getElementById("${av.vid}").src ="images/car3_image.png";
												break;
								} break;
														
				case "Mini-Van" : 	switch(typeVer)
									{
										case 1 : 	document.getElementById("${av.vid}").src ="images/minivan_image.png";
													break;
							
										case 2 : 	document.getElementById("${av.vid}").src ="images/minivan2_image.png";
													break;
							
									} break;
									
				case "Van" : 	switch(typeVer)
								{
									case 1 : 	document.getElementById("${av.vid}").src ="images/van_image.png";
												break;
												
									case 2 : 	document.getElementById("${av.vid}").src ="images/van2_image.png";
												break;
								} break;
								
				case "SUV" : 	switch(typeVer)
								{
									case 1 : 	document.getElementById("${av.vid}").src ="images/suv_image.png";
												break;
								
									case 2 : 	document.getElementById("${av.vid}").src ="images/suv2_image.png";
												break;
								} break;
			}
			
			</c:forEach>
			
			
			
// 			form.addEventListener("submit", (event) => {
// 	    		event.preventDefault();
// 	    		Swal.fire({
// 	    			title: 'Are you sure?',
// 	    			text: "You won't be able to revert this!",
// 	    			icon: 'warning',
// 	    			showCancelButton: true,
// 	    			confirmButtonColor: '#FF4200',
// 	    			cancelButtonColor: '#d33',
// 	    			confirmButtonText: 'Yes, delete it!'
// 	    		}).then((result) => {
// 	    			if (result.isConfirmed) {
// 	    				Swal.fire(
// 	    					'Deleted!',
// 	    					'Your review has been deleted.',
// 	    					'success'
// 	    				)
// 	    				form.submit();
// 	    				//wait(2000);
// 	    			}
// 	    		})
// 	    	});
			
			document.getElementById("tt").innerHTML = tt;
	</script>
</body>
</html>