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
		<th style="width: 10px">id</th>
		<th style="width: 100px">pw</th>
		<th style="width: 200px">name</th>
		<th style="width: 200px">email</th>
		<th style="width: 200px">address</th>
		<th style="width: 200px">phone</th>
		<th style="width: 200px">useyn</th>
		<th style="width: 200px">regdate</th>
		
	</tr>
		<tr>
		    <td><a href="/ex/users/delete?id=${dto.id }">삭제</a></td>
			<td >${dto.pw}</td>
			<td >${dto.name }</td>
			<td >${dto.email }</td>
			<td >${dto.address }</td>
			<td >${dto.phone }</td>
			<td >${dto.useyn }</td>
			<td >${dto.regdate }</td>
			
		</tr>
	</table>
	<a href="/ex/users/update?id=${dto.id }&pw=${dto.pw }&email=${dto.email }&address=${dto.address }&phone=${dto.phone }">수정</a>
	 




</body>
</html>
