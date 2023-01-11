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
    <link rel="stylesheet" href="styles/review_styles.css">
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
              <li class="nav-item">
                <a class="nav-link" href="#">Reviews</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Contact</a>
              </li>
              <!--
              <li class="nav-item">
                <a class="nav-link disabled">Disabled</a>
              </li>
              -->
            </ul>
            <form class="d-flex" role="search">
                <!--
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                -->
                <span class="new-123">
                    <button class="basic-btn-2" type="submit">Manage Booking</button>
                    <button class="basic-btn" type="submit" onclick="bookPopup()">Book a vehicle</button>
                    <button class="basic-btn" type="submit">Login | Register</button>
                </span>
            </form>
          </div>
        </div>
    </nav>

    <!--Add your code here :)-->
    <br>

    <div class="overlay-1" id="overlay-123" style="display: none;"></div>
    <div class="popup-1" id="popup-123" style="display: none;">
        
        <div class="popup-container">
            <div><label class="title-1" style="color: black; text-align: center;">Booking a Vehicle?</label></div>
            <div class="popup-container-2">
                <label>If you're in a hurry, do a quick booking without being login/registered to the website.</label>
                <button class="basic-btn">Quick Booking</button>
            </div>
            <div class="hz-line"></div>
            <div class="popup-container-2">
                <label>Or you can make a booking as a registered user and track your process.</label>
                <button class="basic-btn">Registered Booking</button>
            </div>
        </div>
    </div>

	<div class="text-center">
        <label style="margin-bottom: -200px;" class="title-1">Take a look at what our customers have to say</label><br>
        <label class="title-2">You can write your own experience with our services</label>
        <div>
<!--         	<button onclick="window.location='writeReviews.jsp';" class="basic-btn" id="write">Write a review</button> -->
				<button onclick="window.location='reviewUserVerification.jsp';" class="basic-btn">Write a review</button>
        </div>
        <br>
    </div>

	<center>
    <div class="r-form-container">
   
   	<c:forEach var="vr" items="${reviewDetails}">
   
	<div class="r-container">
		<div class="r-container-1">
			<label class="r-label-h">${vr.rname}</label><br>
			<label class="r-label" style="color: grey">${vr.remail}</label>
			<div class="r-container-2">
				<label class="r-label-c">${vr.rcomment}</label>
			</div>
		</div>
	</div>
	
	</c:forEach>
	
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
      
    <script src="js/basic_script.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>