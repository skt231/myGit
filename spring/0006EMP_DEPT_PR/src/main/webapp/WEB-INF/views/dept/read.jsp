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
<table border="1" width="90%" id="dept">
	<tr>
	<th>부서 번호</th>
	<th>부서명</th>
	<th>부서 위치</th>
	</tr>
	<tr>
		<td>${deptDto.deptno }</td>
		<td>${deptDto.dname}</td>
		<td>${deptDto.loc }</td>
	</tr>
</table>
<a href='/ex/dept/selectAll'>목록가기</a>
<a href='/ex/dept/delete?deptno=${deptDto.deptno}'>삭제</a>
<a href='/ex/dept/modify?deptno=${deptDto.deptno}'>수정</a>
</body>
</html>









