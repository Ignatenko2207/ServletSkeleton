<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome page</title>
</head>
<body>
<br>
<br>
<br>
<form action="reverse" method="get">
	<input type="text" name="text" size="20" placeholder="input text" >
	<input type="submit" value="GET RESPONSE" >
</form>
<br>
<br>
<form action="reverse" method="post">
	<input type="text" name="text" size="20" placeholder="input text" >
	<input type="submit" value="POST RESPONSE" >
</form>
<br>
<br>
<form action="reverse/put" method="post">
	<input type="text" name="text" size="20" placeholder="input text" >
	<input type="submit" value="PUT RESPONSE" >
</form>
<br>
<br>
<form action="reverse/delete" method="post">
	<input type="text" name="text" size="20" placeholder="input text" >
	<input type="submit" value="DELETE RESPONSE" >
</form>
</body>
</html>