<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include test home2</title>
</head>
<body>
<h2>Home2</h2>
<jsp:include page = "header.jsp"></jsp:include>
이 부분은 body 영역입니다.<br>
<a href = "home.jsp">home1</a><br><br><br><br><br>
<jsp:include page = "footer.jsp"></jsp:include>
</body>
</html>