<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register 2</title>
</head>
<body>
	<center>
		<h1>Complete the Registration Processes to fill the following form</h1>
		<form action="./advanceRegisterServlet">
			<input type="hidden" name="sno" value="<%=request.getAttribute("sno") %>">
			<input type="hidden" name="sname" value="<%=request.getAttribute("sname") %>">
			Student age :<input type="text" name="sage"><br>
			Student Course :<input type="text" name="scourse"><br> 
			<input type="submit" value="register">
			
		</form>
	</center>
</body>
</html>