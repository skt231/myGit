<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "/ex/dept/insert" method = "post">
부서 번호 : <input type = "number" name = "deptno"><br>
부서명 : <input type = "text" name = "dname"><br>
부서 위치 : <input type = "text" name = "loc"><br>
<input type = "submit" value = "추가">
</form>
</body>
</html>