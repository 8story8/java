<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<script src="//code.jquery.com/jquery.min.js"></script>
<a href = "${pageContext.request.contextPath}/member/findMemberById_form.do">회원 검색</a><br><br>
<c:choose>
	<c:when test="${sessionScope.mvo != null}">
		<b>${sessionScope.mvo.name}님 로그인</b><br>
		<a href = "${pageContext.request.contextPath}/logout.do">로그아웃</a>
	</c:when>
	<c:otherwise>
		<form action = "${pageContext.request.contextPath}/login.do" method = "post">
			아이디 <input type = "text" name = "id"><br>
			비밀번호 <input type = "text" name = "password"><br>
			<input type = "submit" value = "로그인">
		</form>
		<br>
		<a href = "${pageContext.request.contextPath}/registerForm.do">회원가입</a>
	</c:otherwise>
</c:choose>


