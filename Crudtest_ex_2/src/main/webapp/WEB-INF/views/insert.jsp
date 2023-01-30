<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
insert
<form action="/ex/insert" method="post">
이름<input type="text" name=name >
칼<input type="text" name=knife >
연필<input type="text" name=pencil >
볼펜<input type="text" name=ballpen >
<input type="submit" value="제출">
</form>
</body>
</html>
