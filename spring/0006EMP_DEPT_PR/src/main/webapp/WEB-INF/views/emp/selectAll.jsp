<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
var result='${msg}';
if(result=='success'){
	alert('처리가 완료되었습니다.');
}
</script>
</head>
<body>
<h1>사원 정보</h1>
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
	<c:forEach items="${list }" var="empDto">
	<tr>
		<td>${empDto.empno }</td>
		<td><a href='/ex/emp/read?empno=${empDto.empno }'>
		${empDto.ename}</a></td>
		<td>${empDto.job }</td>
		<td>${empDto.mgr }</td>
		<td >
			<fmt:parseDate value="${empDto.hiredate }" pattern="yyyy-MM-dd'T'HH:mm" var="now" type="both" />
			<fmt:formatDate pattern="yyyy-MM-dd" value= "${now}"/></td>
		<td>${empDto.sal }</td>
		<td>${empDto.comm}</td>
		<td>${empDto.deptno }</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/emp/insert">사원추가</a>
<a href="/ex/emp/empdeptjoin">부서정보와 함께보기</a>
<a href="/ex/dept/home">부서 정보 페이지로 이동</a>
</body>
</html>

