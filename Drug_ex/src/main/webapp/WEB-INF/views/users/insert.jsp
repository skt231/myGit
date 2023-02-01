<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
insert
<form action="/ex/users/insert" method="post">
id<input type="text" name=id >
pw<input type="text" name=pw >
name<input type="text" name=name >
email<input type="text" name=email >
address<input type="text" name=address >
phone<input type="text" name=phone >
useyn<input type="text" name=useyn >
regdate<input type="date" name=regdate >
<input type="submit" value="제출">
</form>
</body>
</html>