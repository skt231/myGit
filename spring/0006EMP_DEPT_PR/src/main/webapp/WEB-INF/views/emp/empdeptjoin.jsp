<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사원 + 부서 정보</h1>
<table border="1" width="90%" id="empdeptjoin">
	<tr>
	<th>사번</th>
	<th>이름</th>
	<th>직무</th>
	<th>관리자사번</th>
	<th>입사일자</th>
	<th>연봉</th>
	<th>커미션</th>
	<th>부서번호</th>
	<th>부서명</th>
	<th>부서위치</th>
	</tr>
	<c:forEach items="${list }" var="empDeptVo">
	<tr>
		<td>${empDeptVo.empno }</td>
		<td><a href='/ex/emp/read?empno=${empDeptVo.empno }'>
		${empDeptVo.ename}</a></td>
		<td>${empDeptVo.job }</td>
		<td>${empDeptVo.mgr }</td>
		<td >
			<fmt:parseDate value="${empDeptVo.hiredate }" pattern="yyyy-MM-dd'T'HH:mm" var="now" type="both" />
			<fmt:formatDate pattern="yyyy-MM-dd" value= "${now}"/></td>
		<td>${empDeptVo.sal }</td>
		<td>${empDeptVo.comm}</td>
		<td>${empDeptVo.deptno }</td>
		<td>${empDeptVo.dname }</td>
		<td>${empDeptVo.loc }</td>
	</tr>
	</c:forEach>
</table>
<a href='/ex/emp/selectAll'>목록가기</a>
</body>
</html>