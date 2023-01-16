<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "/ex/emp/insert" method = "post">
사번 : <input type = "number" name = "empno"><br>
이름 : <input type = "text" name = "ename"><br>
직무 : <input type = "text" name = "job"><br>
관리자 : <input type = "number" name = "mgr"><br>
입사일자 : <input type = "datetime-local" name = "hiredate"><br>
급여 : <input type = "text" name = "sal"><br>
커미션 : <input type = "text" name = "comm"><br>
부서번호 : <input type = "number" name = "deptno"><br>
<input type = "submit" value = "추가">
</form>
</body>
</html>