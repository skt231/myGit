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
<form action="/ex/dept/modify" method="post">
<input type=hidden name=deptno value= '${deptDto.deptno}'>
부서 번호 : ${deptDto.deptno} <BR>
부서명 : <input type = "text" name = "dname" value = '${deptDto.dname }'><br>
부서 위치 : <input type = "text" name = "loc" value = '${deptDto.loc }'><br>
<input type="submit" value=수정 >
</form>
<a href="/ex/dept/selectAll">목록가기</a>
</body>
</html>