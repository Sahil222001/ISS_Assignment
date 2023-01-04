
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<!-- Main css -->

</head>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status")%>">
	<div class="main">

		
			
		
					<div>
						<h2 >Sign in</h2>
						<form method="post" action="login" 
							id="login-form">
							<div>
								<label for="username"></label> <input
									type="text" name="username" id="username"
									placeholder="Your Name" />
							</div><br> 
							<div>
								<label for="password"></i></label> <input
									type="password" name="password" id="password"
									placeholder="Password" />
							</div><br>
						
							<div >
								<input type="submit" name="signin" id="signin"
									 value="Log in" />
							</div>
						</form>
						
					</div>
				</div><br><br>
			<a href="registration.jsp" >Create an
							account</a>

	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	<script type="text/javascript">
   var status=document.getElementById("status").value;
   if(status=="failed"){
	   alert("Wrong username or password!");
	   console.log("Wrong username or password!");
   }
</script>
</body>

</html>