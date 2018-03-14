<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판목록</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/board.css">
</head>
<body>
	<jsp:include page="/template/header.jsp" />
	<table class="list">
		<caption>목록</caption>
		<thead>

			<tr>
				<th class="no">NO</th>
				<th class="title">제목</th>
				<th class="name">이름</th>
				<th class="date">작성일</th>
				<th class="hit">HIT</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="lvo" items="${requestScope.lvo.list}">
				<tr>
					<td>${lvo.no }</td>
					<td><a
						href="${initParam.root}DispatcherServlet?command=showContent&no=${lvo.no }">
							${lvo.title }</a></td>
					<td>${lvo.writer }</td>
					<td>${lvo.timePosted }</td>
					<td>${lvo.hits }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br></br>
	<a href="${pageContext.request.contextPath}/board/write.jsp"> <img
		src="${pageContext.request.contextPath}/img/write_btn.jpg" border="0"></a>
	<br>
	<br>
	<p class="paging">
		<!--for each로 1, 2, 3 ,4 -->

		<c:if test="${lvo.pagingBean.previousPageGroup == true}">
			<a href="DispatcherServlet?command=list&pageNo=${lvo.pagingBean.startPageOfPageGroup-1}"><img src="" alt="이전"></a>
		</c:if>
		<c:forEach begin="${lvo.pagingBean.startPageOfPageGroup}" end="${lvo.pagingBean.endPageOfPageGroup}" var="num">
			<c:choose>
				<c:when test="${lvo.pagingBean.nowPage == num}">
						${num} &nbsp;
					</c:when>
				<c:otherwise>
					<a href="DispatcherServlet?command=list&pageNo=${num}">${num}</a> &nbsp;
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:if test="${lvo.pagingBean.nextPageGroup == true}">
			 &nbsp; <a href="DispatcherServlet?command=list&pageNo=${lvo.pagingBean.endPageOfPageGroup+1}"><img src="" alt="다음"></a>
		</c:if>
	</p>
</body>
</html>






