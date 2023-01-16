<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="90%" id="emp">
	<tr>
	<th>사번</th>
	<th>이름</th>
	<th>직무</th>
	<th>관리자사번</th>
	<th>입사일자</th>
	<th>연봉</th>
	<th>커미션</th>
	<th>부서번호</th>
	</tr>
	<tr>
		<td>${empDto.empno }</td>
		<td>${empDto.ename}</td>
		<td>${empDto.job }</td>
		<td>${empDto.mgr }</td>
		<td>
			<fmt:parseDate value="${empDto.hiredate }" pattern="yyyy-MM-dd'T'HH:mm" var="now" type="both" />
			<fmt:formatDate pattern="yyyy-MM-dd" value= "${now}"/></td>
		<td>${empDto.sal}</td>
		<td>${empDto.comm}</td>
		<td>${empDto.deptno }</td>
	</tr>
</table>
<a href='/ex/emp/selectAll'>목록가기</a>
<a href='/ex/emp/delete?empno=${empDto.empno}'>삭제</a>
<a href='/ex/emp/modify?empno=${empDto.empno}'>수정</a>
</body>
</html>









