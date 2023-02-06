<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false" %>
<%-- <%@include file="../include/header.jsp"%> --%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function() {
	var fObject=$(".form");
	
	$(".btnList").on("click",function(){

		fObject.attr("method","get");
		fObject.attr("action","/ex/sboard/list");
		fObject.submit();
		
	})			
	$(".btnRemove").on("click",function(){
		fObject.attr("action","/ex/sboard/remove");
		fObject.submit();
	})
	$(".btnModify").on("click",function(){
		fObject.attr("method","get");
		fObject.attr("action","/ex/sboard/modify");
		fObject.submit();
	})
});
</script>
			
<div class="main">
  
<form class="form" method="post">

					<input type='hidden' name='bno' value="${qnaDTO.bno}"> <input
						type='hidden' name='page' value="${pageMaker.page}"> <input
						type='hidden' name='perPageNum' value="${pageMaker.perPageNum}">
					<input type='hidden' name='searchType' value="${pageMaker.searchType}">
					<input type='hidden' name='keyword' value="${pageMaker.keyword}">


</form>
	<h1>제목</h1>
	<h2>
		<input type="text"
			style="width:100%" name='title' value="${qnaDTO.title}"
			readonly="readonly"></h2>
	
		<h2>
		내용
		<textarea  style="width:100%" name="content" rows="3"
			readonly="readonly">${qnaDTO.content}</textarea>
		</h2>
	
		<h2>
		작성자 <input type="text"
			name="writer" style="width:100%" value="${qnaDTO.writer}"
			readonly="readonly">
		<h2>

<!-- /.box-body -->
<div class="box-footer">
	<button type="submit" class="btnModify">수정</button>
	<button type="submit" class="btnRemove">삭제</button>
	<button type="submit" class="btnList">LIST page로 이동</button>
</div>

</div>

<%@include file="../include/footer.jsp"%>


