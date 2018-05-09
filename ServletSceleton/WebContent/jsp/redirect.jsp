<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<br>
<br>


<h2>Your reversed text is</h2>
<h3><%= session.getAttribute("reversedText")%></h3>
<h3>recieved by method<%= session.getAttribute("method")%></h3>
<br>
<br>
<a href="/ServletSceleton/index.jsp">Back to landing page</a>

</body>
</html>