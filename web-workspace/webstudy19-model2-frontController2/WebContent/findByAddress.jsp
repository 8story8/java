<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "DispatcherServlet">
	주소 <input type = "text" name = "addr">
	<input type = "hidden" name = "command" value = "findByAddress">
	<input type = "submit" value = "검색">
</form>
</body>
</html>