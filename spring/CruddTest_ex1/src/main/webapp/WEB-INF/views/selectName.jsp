<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}
#customers tr:nth-child(even){background-color: #f2f2f2;}
#customers tr:hover {background-color: #ddd;}
#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>
  select
  <table id='customers' width=100% border="1">
	<tr>
	    <th style="width: 10px">선택</th>
		<th style="width: 10px">name</th>
		<th style="width: 100px">knife</th>
		<th style="width: 200px">pencil</th>
		<th style="width: 40px">ballpen</th>
	</tr>
		<tr>
		    <td><a href="/ex/delete?name=${dto.name }">삭제</a></td>
			<td>${dto.name }</td>
			<td >${dto.knife}</td>
			<td >${dto.pencil }</td>
			<td >${dto.ballpen }</td>
		</tr>
	</table>
	<a href='/ex/update?name=${dto.name }&knife=${dto.knife }&pencil=${dto.pnecil }
	&ballpen=${dto.ballpen }/>' >수정</a>
	 




</body>
</html>
