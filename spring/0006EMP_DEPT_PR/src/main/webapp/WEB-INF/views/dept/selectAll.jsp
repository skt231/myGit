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
<h1>부서 정보</h1>
<table border="1" width="90%" id="dept">
	<tr>
	<th>부서 번호</th>
	<th>부서명</th>
	<th>부서 위치</th>
	</tr>
	<c:forEach items="${list }" var="deptDto">
	<tr>
		<td>${deptDto.deptno }</td>
		<td><a href='/ex/dept/read?deptno=${deptDto.deptno }'>
		${deptDto.dname}</a></td>
		<td>${deptDto.loc }</td>
	</tr>
	</c:forEach>
</table>
<a href="/ex/dept/insert">부서 추가</a>
<a href='/ex/emp/selectAll'>사원 정보 페이지로 이동</a>
</body>
</html>

