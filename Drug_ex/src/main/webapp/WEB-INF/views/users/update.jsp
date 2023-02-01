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
<form action="/ex/users/update" method="post">
id:<input type="text" name=id value="${usersDto.id }" readonly>
pw:<input type="text" name=pw value="${usersDto.pw }">
name : ${users.name }
email:<input type="text" name=email value="${usersDto.email }">
address:<input type="text" name=address value="${usersDto.address}">
phone:<input type="text" name=phone value="${usersDto.phone }">
useyn : ${usersDto.useyn }
regdate : ${users.regdate }

<input type="submit" value="수정">
</form>
</body>
</html>
