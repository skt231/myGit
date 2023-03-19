<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    <%@ page import="java.text.SimpleDateFormat" %>
    <%@ page import="java.util.Date" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page 지시어-import속성/errorpage/trimDirectveWhitespaces</title>
</head>
<body>
<%
	Date today=new Date();
	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
	String todayStr=dateFormat.format(today);
	out.println("오늘 날씨 : " + todayStr);
%>
<%
try{
	int myAge=Integer.parseInt(request.getParameter("age")) +10;
	out.println("10년 후 당신의 나이는 " +myAge + "입니다.");
}
catch(Exception e){
	out.println("예외발생 : 매개변수 age가 null입니다.");
}

%>
<h2>page 지시어로 생긴 불필요한 공백 제거 </h2>
</body>
</html>