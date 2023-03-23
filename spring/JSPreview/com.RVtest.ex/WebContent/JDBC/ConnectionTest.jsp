<%@ page import="common.DBConn"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JDBC</title>
</head>
<body>
	<h2>회원추가 테스트</h2>
	<%
	//테스트용 입력갑 준비
	String id="test1";
	String pass="1111";
	String name="테스트1회원";
	
	//쿼리문생성
	String sql="INSERT INTO member VALUES(?,?,?,sysdate)";
	PreparedStatement psmt = PrepareStatement(sql);
	%>
</body>
</html>