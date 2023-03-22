<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String popupMode = "on";//레이어 팝업창 띄울지 여부
	
	Cookie[] cookies=request.getCookies();
	if(cookies != null){
		for(Cookie c:cookies){
			String cookieName=c.getName();
			String cookieValue=c.getValue();
			if(cookieName.equals("PopupClose")){
				popupMode=cookieValue;
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키를 이용한 팝업 관리 ver 0.1</title>
<style>
div#popup {
	position: absolute;
	top: 100px;
	left: 50px;
	color: yellow;
	width: 270px;
	height: 100px;
	background-color: gray;
}

div#popup>div {
	position: relative;
	background-color: #ffffff;
	top: 0px;
	border: 1px solid gray;
	padding: 10px;
	color: black;
}
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script>
	$(function() {
		$('#closeBtn').click(function() {
			$('#popup').hide();
			var chkVal= $("input:checkbox[id=inactiveToday]:checked").val();
			//[id가 "inactiveToday"이면서 '체크된'체크박스의] val()[값을 읽어옴]
			$.ajax({	//비동기로 요청을 보낸다.
				url: './PopupCookie.jsp',	//PopupCookie.jsp 파일에
				type:'get',	//HTTP GET방식으로
				data:{inactiveToday:chkVal},	//inactiveToday=<chkVal 변수의 값> 데이터를
				dataType:"text",	//응답 데이터의 타입은 일반 텍스트 이며
				success:function(resDate){	//요청 성공시
					if(resData !='') location.reload();	//응답데이터가 있다면 페이지를 새로도친다.
				}
			});
		});
	});
</script>
</head>
<body>
	<h2>팝업 메인 페이지(ver 0.1)</h2>
	<%
		for (int i = 0; i <= 10; i++) {
			out.print("현재 팝업창은 " + popupMode + "상태입니다.<br/>");
		}
		if (popupMode.equals("on")) {
	%>
	<div id="popup">
		<h2 align="center">공지사항 팝업입니다.</h2>
		<div align="right">
			<form name="popFrm">
				<input type="checkbox" id="inactiveToday" value="1" /> 하루동안 열지않음 <input
					type="button" value="닫기" id="closeBtn" />
			</form>
		</div>
	</div>
	<%
		}
	%>

</body>
</html>