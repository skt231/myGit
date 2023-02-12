  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
  <%@include file="../include/header.jsp"%>
  <html>
  <head>
   <link href="${pageContext.request.contextPath}/resources/css/styles1.css" rel="stylesheet" type="text/css"/>
<script>
$(document).ready(function() {
	var fObject=$(".form");
	
	$(".btnCancel").on("click",function(){

		fObject.attr("method","get");
		fObject.attr("action","/ex/qna/list");
		fObject.submit();
		
	})			
	$(".btnSave").on("click",function(){
		fObject.attr("method","post");
		fObject.attr("action","/ex/qna/modify");
		fObject.submit();
	})
	
});
</script>
</head>
<body>
<div class="main">
  
<form class="form" method="post">

					<input type='hidden' name='bno' value="${qnaDTO.bno}"> <input
						type='hidden' name='page' value="${pageMaker.page}"> <input
						type='hidden' name='perPageNum' value="${pageMaker.perPageNum}">
					<input type='hidden' name='searchType' value="${pageMaker.searchType}">
					<input type='hidden' name='keyword' value="${pageMaker.keyword}">



	<h1>modify</h1>
	<h2>
		<input type="text"
			name='title'  style="width:100%" value="${qnaDTO.title}"></h2>
	
		<h2>
		Content
		<textarea  style="width:100%" name="content" rows="3">${qnaDTO.content}</textarea>	</h2>
	
		<h2>
		Writer <input type="text"
			name="writer" style="width:100%" value="${qnaDTO.writer}">
		<h2>
</form>
<!-- /.box-body -->
<div class="box-footer">
	<button type="submit" class="btnSave">Save</button>
	<button type="submit" class="btnCancel">Cancel</button>
</div>

</div>
<%@include file="../include/footer.jsp"%>
</body>
</html>

