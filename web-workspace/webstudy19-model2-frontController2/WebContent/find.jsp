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
아이디 <input type = "text" name = "id">
<input type = "hidden" name = "command" value = "find">
<input type = "submit" value = "검색">
</form>
</body>
</html>