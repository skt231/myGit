<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<table id='customers' width=100% border="1">
		<tr>
			<th>name</th>
			<th>sex</th>
			<th>phone</th>
			<th>regisration</th>
			<th>statement</th>
		</tr>
		<c:forEach items="${list}" var="dto">
			<td>${dto.name}</td>
			<td>${dto.sex}</td>
			<td>${dto.phone}</td>
			<td>${dto.registeration}</td>
			<td>${dto.statement}</td>
		</c:forEach>
	</table>
</body>
</html>