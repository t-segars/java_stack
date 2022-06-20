<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Crunchy Garden</title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans:400,600" rel="stylesheet">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="icon" href="https://freepngimg.com/download/leaf/41645-9-growing-plant-free-download-image.png">
<style>
	body {
		font-family: 'Open Sans', sans-serif;
	}
	.form-control {
		box-shadow: none;
		border-radius: 4px;        
        border-color: #dfe3e8;
	}
	.form-control:focus {
		border-color: #29c68c;
		box-shadow: 0 0 8px rgba(0,0,0,0.1);
	}

	.navbar {
		background: #fff;
		padding-left: 16px;
		padding-right: 16px;
		border-bottom: 1px solid #dfe3e8;
		border-radius: 0;
	}
	.navbar .navbar-brand {
		font-size: 20px;
		padding-left: 0;
		padding-right: 50px;
	}
	.navbar .navbar-brand b {
		font-weight: bold;
		color: #29c68c;		
	}
	.navbar ul.nav li a {
		color: #999;
	}
	.navbar ul.nav li a:hover, .navbar ul.nav li a:focus {
		color: #29c68c !important;
	}
	.navbar ul.nav li.active > a, .navbar ul.nav li.open > a {
		color: #26bb84 !important;
		background: transparent !important;
	}
    .navbar .form-inline .input-group-addon {
		box-shadow: none;
        border-radius: 2px 0 0 2px;
		background: #f5f5f5;
        border-color: #dfe3e8;
        font-size: 16px;
    }
	.navbar .form-inline i {
		font-size: 16px;
	}
	.navbar .form-inline .btn {
		border-radius: 2px;
		color: #fff;
        border-color: #29c68c;
		background: #29c68c;
		outline: none;
	}
	.navbar .form-inline .btn:hover, .navbar .form-inline .btn:focus {
        border-color: #26bb84;
		background: #26bb84;
    }
	.navbar .search-form {
		display: inline-block;
	}
	.navbar .search-form .btn {
		margin-left: 4px;
	}
	.navbar .search-form .form-control {
		border-radius: 2px;
	}
	.navbar .login-form .input-group {
		margin-right: 4px;
		float: left;
	}
	.navbar .login-form .form-control {
		max-width: 158px;
		border-radius: 0 2px 2px 0;
	}    	
	.navbar .navbar-right .dropdown-toggle::after {
		display: none;
	}
	.navbar .dropdown-menu {
		border-radius: 1px;
		border-color: #e5e5e5;
		box-shadow: 0 2px 8px rgba(0,0,0,.05);
	}
	.navbar .dropdown-menu li a {
		padding: 6px 20px;
	}
	.navbar .navbar-right .dropdown-menu {
		width: 505px;
		padding: 20px;
		left: auto;
		right: 0;
        font-size: 14px;
	}
	@media (min-width: 1200px){
		.search-form .input-group {
			width: 300px;
			margin-left: 30px;
		}
	}
	@media (max-width: 768px){
		.navbar .navbar-right .dropdown-menu {
			width: 100%;
			background: transparent;
			padding: 10px 20px;
		}
		.navbar .input-group {
			width: 100%;
			margin-bottom: 15px;
		}
		.navbar .input-group .form-control {
			max-width: none;			
		}
		.navbar .login-form .btn {
			width: 100%;
		}
	}
    .jumbotron{
  margin:15px 30px 0px 30px;
  border-radius:10px;
    background: 
linear-gradient(
  rgba(0, 0, 250, 0.25), 
  rgba(125, 250, 250, 0.45)
),
url(https://source.unsplash.com/1600x1050/?herbs);
background-repeat: no-repeat;
background-attachment: fixed;
color:white !important;
height:340px;
}




</style>
</head> 
<body>
<nav class="navbar navbar-default navbar-expand-lg navbar-light">
	<div class="navbar-header">
		<a class="navbar-brand" href="#">Crunchy<b>Garden</b></a>  		
		<button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
			<span class="navbar-toggler-icon"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
		</button>
	</div>
	<!-- Collection of nav links, forms, and other content for toggling -->
	<div id="navbarCollapse" class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li><a href="#">Home</a></li>
			<li><a href="#">About</a></li>			
			<li class="dropdown">
				<a data-toggle="dropdown" class="dropdown-toggle-1" href="#">Account <b class="caret"></b></a>
				<ul class="dropdown-menu">					
					<li><a href="/garden">My Garden</a></li>
					<li><a href="#">My Cabinet</a></li>
					<li><a href="#">Saved recipes</a></li>
					<li><a href="#">Wishlist</a></li>
				</ul>
			</li>
			<li class="active"><a href="#">Herbs</a></li>
			<li><a href="/blog">Blog</a></li>
			<li><a href="#">Contact</a></li>
            <li><a href="/join">Join</a></li>
		</ul>
		<!-- <form class="navbar-form form-inline search-form">
            <div class="input-group">
                <input type="text" class="form-control" placeholder="Search...">
			    <span class="input-group-btn">
                    <button type="button" class="btn btn-default"><i class="fa fa-search"></i></button>
				</span> -->
            <!-- </div> -->
			
		</form>
		<ul class="nav navbar-nav navbar-right">                       
			<li class="dropdown">
                <a data-toggle="dropdown" class="dropdown-toggle" href=""><i class="fa fa-user-o"></i> Login</a>
				<ul class="dropdown-menu">
                    <li>
                        <form class="form-inline login-form" action="/login" method="post">
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                                <input type="text" name="email" class="form-control" placeholder="Email" required>
                            </div>
                            <div class="input-group">
                                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                                <input type="text" name="password" class="form-control" placeholder="Password" required>
                            </div>
                            <button type="submit" class="btn btn-primary">Login</button>
                        </form>
					</li>
				</ul>
			</li>
		</ul>
	</div>
</nav>
<div class="jumbotron">
    <div class="container text-center">
      <h1>Holistic Gardening</h1>      
      <p> identify and learn to grow the herbs your body needs </p>
    </div>
  </div>
    
  <div class="container-fluid bg-3 text-center">    
    <h3>Whats inside!</h3><br>
    <div class="row">
      <div class="col-sm-3">
        <p>A full database of all medicinal herbs and plants</p>
        <img src="https://images.pexels.com/photos/256318/pexels-photo-256318.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" height="150px" width="150px"></a>
      </div>
      <div class="col-sm-3"> 
        <p>See what you can grow where you live</p>
        <img src="https://images.pexels.com/photos/4113898/pexels-photo-4113898.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" height="150px" width="150px"></a>
      </div>
      <div class="col-sm-3"> 
        <p>Create and track your garden inside the app</p>
        <img src="https://images.pexels.com/photos/3233275/pexels-photo-3233275.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" height="150px" width="150px"></a>
      </div>
      <div class="col-sm-3">
        <p>Create a Cabinet of all of your herbs and plants</p>
        <img src="https://images.pexels.com/photos/1793034/pexels-photo-1793034.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" height="150px" width="150px"></a>
        <!-- <img src="./static-file.png" class="img-responsive" style="width:100%" alt="Image"> -->
        <div class=".img-herb"></div>
      </div>
    </div>
  </div><br>
  
  <div class="container-fluid bg-3 text-center">    
    <div class="row">
      <div class="col-sm-3">
        <p>Share you medicinal garden with your friends</p>
        <img src="https://images.pexels.com/photos/105028/pexels-photo-105028.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" height="150px" width="150px"></a>
      </div>
      <div class="col-sm-3"> 
        <p>Search our data base for uses or by symptoms</p>
        <img src="https://images.pexels.com/photos/1660533/pexels-photo-1660533.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" height="150px" width="150px"></a>
      </div>
      <div class="col-sm-3"> 
        <p>Identify plants by uploading pictures</p>
        <img src="https://images.pexels.com/photos/928251/pexels-photo-928251.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" height="150px" width="150px"></a>
      </div>
      <div class="col-sm-3">
        <p>Recipes and more inside Blog</p>
        <img src="https://images.pexels.com/photos/977903/pexels-photo-977903.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2" height="150px" width="150px"></a>
      </div>
    </div>
  </div><br><br>
  
  <footer class="container-fluid text-center">
    <p>All of the above and more | Join Now</p>
  </footer>
  
  </body>
  </html>
  <script src="flask_app\static\javaScript\script.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>                         