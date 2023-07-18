<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!--Font Awesome-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
	integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ"
	crossorigin="anonymous" />

<!--Style CSS-->
<!-- <link rel="stylesheet" href="style.css" /> -->

<style>
@import
	url("https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap")
	;

* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
	font-family: "Roboto", sans-serif;
}

.container {
	width: 320px;
	height: 480px;
	background: #fff;
	box-shadow: 0 10px 15px rgba(179, 179, 179, 0.7);
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	border-radius: 7px;
	display: flex;
	flex-direction: column;
	justify-content: space-evenly;
	padding: 1rem;
}

.container h2 {
	color: #0a66c3;
	font-size: 1.6rem;
}

.container h2 i {
	font-size: 1.8rem;
	padding-left: 0.1rem;
}

.text p {
	font-size: 0.8rem;
	padding-top: 0.3rem;
}

.input {
	position: relative;
	width: 100%;
	height: 50px;
	margin-bottom: 0.7em;
}

.your-input input {
	width: 100%;
	height: 50px;
	padding-top: 1.1rem;
	padding-left: 9px;
	outline: none;
	border: 1px solid #8c8c8c;
	border-radius: 3px;
	transition: 0.2s;
}

.your-input label {
	position: absolute;
	top: 30%;
	left: 10px;
	font-size: 1.1rem;
	color: #8c8c8c;
	transition: 0.2s;
}

.input input:focus ~ label, .input input:valid ~ label {
	top: 10%;
	font-size: 0.8rem;
	color: #000;
}

.input input:focus {
	border-width: 2px;
	border-color: #0a66c3;
}

.forgot-password-link {
	width: 140px;
	padding: 0.2rem;
	text-align: center;
	text-decoration: none;
	font-weight: bolder;
	color: #0a66c3;
	transition: 0.3s;
	border-radius: 12px;
}

.forgot-password-link:hover {
	background: rgba(10, 102, 195, 0.3);
}

button {
	height: 50px;
	background: #0a66c3;
	outline: none;
	border: none;
	border-radius: 30px;
	color: #fff;
	font-size: 1rem;
	font-weight: bolder;
}

.join-link {
	text-decoration: none;
	font-weight: bolder;
	color: #0a66c3;
}

.join-now {
	text-decoration: none;
	font-weight: bolder;
	color: #0a66c3;
	border-radius: 12px;
	transition: 0.3s;
	font-weight: bolder;
	padding: 0.2rem;
}

.join-now:hover {
	background: rgba(10, 102, 195, 0.3);
}
</style>
<title>Login Form</title>
</head>
<body>
	<div class="container">
		<h2>
			Linked<span> <i class="fab fa-linkedin"></i>
			</span>
		</h2>
		<div class="text">
			<h1>Sign in</h1>
			<p>Stay updated on your professional world</p>
		</div>
		<div class="your-input">
			<div class="input">
				<input type="text" name="email" id="email" required /> <label
					for="email">Email</label>
			</div>
			<div class="input">
				<input type="password" name="password" id="password" required /> <label
					for="password"> Password </label>
			</div>
		</div>
		<a href="#" class="forgot-password-link"> Forgot Password? </a>
		<button>Sign in</button>
		<p class="join-link">
			New to linkedin? <a href="#" class="join-now"> Join now </a>
		</p>
	</div>
</body>
</html>