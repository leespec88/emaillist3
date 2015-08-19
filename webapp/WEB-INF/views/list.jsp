<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메일 리스트에 가입되었습니다.</h1>
	<p>입력한 정보 내역입니다.</p>
	<!-- 메일정보 리스트 -->
	<%-- list에서 하나씩 빼서 테이블를 채운다--%>
	<c:forEach var="list" items="${list }" varStatus="status">
	<table border="1" cellpadding="5" cellspacing="2">
		<tr>
			<td align=right>First name: </td>
			<td>${list.firstName }</td>
		</tr>
		<tr>
			<td align=right width="110">Last name: </td>
			<td width="110">${list.lastName }</td>
		</tr>
		<tr>
			<td align=right>Email address: </td>
			<td>${list.email }</td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="delete/${list.no }">삭제</a>
			</td>
		</tr>
	</table>
	<br>
	</c:forEach>
	<p>
		<a href="form">추가메일 등록</a>
	</p>
	<br>
</body>
</html>