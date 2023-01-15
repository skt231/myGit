<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
update
<form action="/ex/update" method="post">
이름<input type="text" name=name value="${pocketdto.name }" readonly>
나이<input type="text" name=knife value="${pocketdto.knife }">
키<input type="text" name=penil value="${pocketdto.pencil }">
키<input type="text" name=ballpen value="${pocketdto.ballpen }">
<!-- 생일<input type="datetime-local" name=birthday value="2000-01-01T12:13:22"> -->
<input type="submit" value="수정">
</form>
</body>
</html>
