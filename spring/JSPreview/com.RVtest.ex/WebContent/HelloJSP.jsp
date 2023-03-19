<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- <%@ 지시어 종류 속성1="값1" 속성2="값2"...%>-->
    <!--지시어:JSP페이지에 대한 정보를 설정한다.  -->
    <!-- include 지시어: 외부파일을 현재 JSP페이지에  포함시킨다.  -->
    <!-- taglib 지시어 : 표현언어에서 사용할 자바클래스나 JSTL을 선언한다. -->
    
    <%!
    String str1="JSP";
    String str2="안녕하세요";
    %>
    <!--스크립트요소(선언부)-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HelloJSP</title>
</head>
<body>
	<h2>처음 만들어보는 <%=str1 %></h2>
	<!--스크립트요소(표현식)-->
		<p>
			<%
				out.println(str2+str1+"입니다. 열공합시다.");
			%>
			<!--스크립트 요소(스크립틀릿)-->
		</p>
</body>
</html>