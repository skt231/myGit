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
id<input type="text" name=id value="${AdminDto.id }" readonly>
pw<input type="text" name=pw value="${AdminDto.pw }">
ad_num<input type="text" name=ad_num value="${AdminDto.ad_num }">



<input type="submit" value="수정">
</form>
</body>
</html>
