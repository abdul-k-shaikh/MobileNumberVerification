<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mobile number verification</title>
</head>
<body>
	<h1>This is JSP page</h1>
	<form action="/verify" method="post">
		 <label for="mobileNumber">Enter Mobile Number:</label>
        <input type="text" id="mobileNumber" name="mobileNumber" required>
        <button type="submit">Validate Mobile</button>

	</form>
	
	<br>
    <input type="checkbox" id="validCheckbox" disabled ${isValid ? 'checked' : ''}>
    <label for="validCheckbox">Mobile number is valid</label>
</body>
</html>