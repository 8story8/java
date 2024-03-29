<%@page import="model.PersonVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>step5-forEach</title>
</head>
<body>
<%
	String names[] = {"Kid", "Vermouth", "Bourbon"};
	request.setAttribute("namesArr", names);
%>
<b>JSTL로 배열 요소를 출력</b><br>
<c:forEach items="${namesArr}" var = "name">
	${name}<br>
</c:forEach>
<hr><br>

<%
	ArrayList<PersonVO> perList = new ArrayList<PersonVO>();
	perList.add(new PersonVO("Kid", 200));
	perList.add(new PersonVO("Z", 300));
	request.setAttribute("pList", perList);
%>
<%--jstl forEach 반복문
	   items 속성 : Array, Collection
	   var 속성 : Array, Collection 요소를 순차적으로 저장
	   varStatus 속성 : index와 count 속성이 있다.
	   begin 속성 : 몇 번째 요소부터 반복문을 실행할지 명시
	   end 속성 : 몇 번째 요소까지 반복문을 실행할지 명시
--%>
<b>JSTL로 리스트 요소의 name, money를 출력</b><br>
<c:forEach items="${pList}" var = "person" varStatus="order">
	<br> ${order.count} ${person.name}, ${person.money} ${order.index}
<hr>
jstl forEach begin end 속성<br>
</c:forEach>
<c:forEach begin = "1" end = "5" var = "num">
	${num}
</c:forEach>
<br><br>
<%
	request.setAttribute("startPage", 5);
	request.setAttribute("endPage", 10);
%>
<c:forEach begin="${requestScope.startPage}"  end="${requestScope.endPage}"  var = "page">
	<c:choose>
		<c:when test="${page == 8 }">
			${page} <br><br>
		</c:when>
		<c:otherwise>
			<a href = "">${page}</a> <br><br>
		</c:otherwise>
	</c:choose>
</c:forEach>
</body>
</html>