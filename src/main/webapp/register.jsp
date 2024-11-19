<%@ page session="false"%>
<!DOCTYPE html>
<html>
<body>
<head>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f9;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.form-container {
	background: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 350px;
}

.form-container h2 {
	margin-bottom: 20px;
	font-size: 24px;
	color: #333;
}

.form-container label {
	font-size: 14px;
	color: #666;
}

.form-container input {
	width: 100%;
	padding: 10px;
	margin: 15px 0;
	border: 1px solid #ddd;
	border-radius: 4px;
}

.form-container button {
	width: 100%;
	padding: 10px;
	background-color: #5cb85c;
	color: white;
	border: none;
	border-radius: 4px;
	font-size: 16px;
	cursor: pointer;
}

.form-container button:hover {
	background-color: #4cae4c;
}
</style>
</head>
<body>
	<div class="form-container">
		<h2>Register</h2>
		<form id="registrationForm">
			<label for="name">Name:</label> 
			<input type="text" id="name"name="name" required>
			 <label for="email">Email:</label> 
			 <input type="email" id="email" name="email" required>
			  <label for="dob">Date of Birth:</label> 
			  <input type="date" id="dob"name="dob" required> 
			  <label for="phone">PhoneNumber:</label>
			   <input type="text" id="phone" name="phone" pattern="\d*"maxlength="15">

			<button type="submit">Register</button>
		</form>
	</div>

	
</body>


</html>