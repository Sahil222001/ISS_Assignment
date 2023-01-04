<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">


</head>

<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
	<div class="main">			
				<div class="signup-content">
					<div class="signup-form">
					<h2 >Register</h2>
						<form method="post" action="registration"  id="register-form">
							<div >
								<label for="name"></label> <input
									type="text" name="name" id="name" placeholder="Your Name" />
							</div><br><br>
							<div class="form-group">
								<label for="email"></label> <input
									type="email" name="email" id="email" placeholder="Your Email" />
							</div><br><br>
							<div class="form-group">
								<label for="pass"></label> <input
									type="password" name="pass" id="pass" placeholder="Password" />
							</div><br><br>
							<div class="form-group">
								<label for="re-pass"></i></label>
								<input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password" />
							</div><br><br>
							<div class="form-group">
								<label for="contact"></label>
								<input type="text" name="contact" id="contact"
									placeholder="Contact no" />
							</div><br><br>
							
							<div>
								<input type="submit" name="signup" id="signup"
									 value="Register" />
							</div>
						</form>
					</div>
					<div><br><br>
						
						<a href="login.jsp" >Have an account? Login</a>
					</div>
				</div>



	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	<script>
   var status=document.getElementById("status").value;
   if(status=="success"){
	   alert("Account Created!");
   }
   </script>



</body>
</html>