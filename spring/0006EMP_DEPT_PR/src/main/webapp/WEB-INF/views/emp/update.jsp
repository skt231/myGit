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
<form action="/ex/emp/modify" method="post">
<input type=hidden name=empno value= '${empDto.empno}'>
사번 : ${empDto.empno} <BR>
이름 : <input type = "text" name = "ename" value = '${empDto.ename }'><br>
직무 : <input type = "text" name = "job" value = '${empDto.job }'><br>
관리자 : <input type = "number" name = "mgr" value = '${empDto.mgr }'><br>
<fmt:parseDate value="${empDto.hiredate }" pattern="yyyy-MM-dd'T'HH:mm" var="now" type="both" />
입사일자 : <input type = "datetime-local" name = "hiredate" 
value = '<fmt:formatDate pattern="yyyy-MM-dd'T'HH:mm" value="${now }" />'><br>
급여 : <input type = "text" name = "sal" value = '${empDto.sal }'><br>
커미션 : <input type = "text" name = "comm" value = '${empDto.comm }'><br>
부서번호 : <input type = "number" name = "deptno" value = '${empDto.deptno }'><br>
<input type="submit" value=수정 >
</form>
<a href="/ex/emp/selectAll">목록가기</a>
</body>
</html>