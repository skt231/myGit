<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@include file="../include/header.jsp"%>
   
   <html>
   <head>
   <link
	href="${pageContext.request.contextPath}/resources/css/styles1.css"
	rel="stylesheet" type="text/css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js">
    </script>
<script>
var fObject=$(".form");
function remove(){	
	fObject.attr("action","/ex/qna/remove");		
	fObject.submit();
}


$(document).ready(function() {
	var fObject=$(".form");
	
	$(".btnList").on("click",function(){
		fObject.attr("method","get");
		fObject.attr("action","/ex/qna/list");
		fObject.submit();
		
	});
	
	/* $(".btnRemove").on("click",function(){ */
	
	function remove(){	
		fObject.attr("action","/ex/qna/remove");		
		fObject.submit();
	}
	/* }); */
	
	$(".btnModify").on("click",function(){
		fObject.attr("method","get");
		fObject.attr("action","/ex/qna/modify");
		fObject.submit();
	});
});
</script>

	<style>
	
	</style>


</head>
<body class="d-flex flex-column">
	<main class="flex-shrink-0">
	<section class="py-5">
		<div class="container px-5">
			<!-- Contact form-->
			<div class="bg-light rounded-3 py-5 px-4 px-md-5 mb-5">
				<div class="text-center mb-5">
					<div
						class="feature bg-primary bg-gradient text-white rounded-3 mb-3">
						<i class="bi bi-envelope"></i>
					</div>
					<h1 class="fw-bolder">QnA 게시판</h1>
					<p class="lead fw-normal text-muted mb-0">
						</p>
				</div>
				 <div class="row gx-5 justify-content-center">
					<div class="col-lg-8 col-xl-6">
						<!-- * * * * * * * * * * * * * * *-->
						<!-- * * SB Forms Contact Form * *-->
						<!-- * * * * * * * * * * * * * * *-->
						<!-- This form is pre-integrated with SB Forms.-->
						<!-- To make this form functional, sign up at-->
						<!-- https://startbootstrap.com/solution/contact-forms-->
						<!-- to get an API token!--><!-- 
						<form id="contactForm" action="/ex/qna/write" method="post"> -->
 
							<div class="main">
								<!-- <div class="box-header">
									
								</div>  -->
								<!-- /.box-header -->
								<!-- action에 경로가 없으면 현재 페이지 주소로 이동한다.-->
 <form class="form" method="post">

					<input type='hidden' name='bno' value="${list_read.bno}"> 
					<input type='hidden' name='page' value="${pageMaker.page}"> 
					<input type='hidden' name='perPageNum' value="${pageMaker.perPageNum}">
					<input type='hidden' name='searchType' value="${pageMaker.searchType}">
					<input type='hidden' name='keyword' value="${pageMaker.keyword}">
 


	<h6>제목</h6>
 	<h6>
		<input type="text"
			style="width:100%" name='title' value="${list_read.title}"
			readonly="readonly"></h6>
	
		<h6>
		내용
		<textarea  style="width:100%" name="content" rows="3"
			readonly="readonly">${list_read.content}</textarea>
		</h6>
	
		<h6>
		작성자 <input type="text"
			name="writer" style="width:100%" value="${list_read.writer}"
			readonly="readonly">
		</h6>
		</form>
<%--  </c:forEach>  --%>
<!-- /.box-body -->
<div class="box-footer">
	<button type="button" class="btnModify"><a href="/ex/qna/modify?bno=${list_read.bno }&title=${list_read.title}&content=${list_read.content}&writer=${list_read.writer}">수정</a></button>
	<button type="submit" class="btnRemove"><a href="/ex/qna/remove?bno=${list_read.bno }&title=${list_read.title}&content=${list_read.content}&writer=${list_read.writer}">삭제</a></button>
	<button type="submit" class="btnReply">답글</button>
	<button type="submit" class="btnList">LIST page로 이동</button>
</div>

</div>
<!-- Contact cards-->
					<div class="row gx-5 row-cols-2 row-cols-lg-4 py-5">
						<div class="col">
							<div
								class="feature bg-primary bg-gradient text-white rounded-3 mb-3">
								<i class="bi bi-chat-dots"></i>
							</div>
							<div class="h5 mb-2">Chat with us</div>
							<p class="text-muted mb-0">Chat live with one of our support
								specialists.</p>
						</div>
						<div class="col">
							<div
								class="feature bg-primary bg-gradient text-white rounded-3 mb-3">
								<i class="bi bi-people"></i>
							</div>
							<div class="h5">Ask the community</div>
							<p class="text-muted mb-0">Explore our community forums and
								communicate with other users.</p>
						</div>
						<div class="col">
							<div
								class="feature bg-primary bg-gradient text-white rounded-3 mb-3">
								<i class="bi bi-question-circle"></i>
							</div>
							<div class="h5">Support center</div>
							<p class="text-muted mb-0">Browse FAQ's and support articles
								to find solutions.</p>
						</div>
						<div class="col">
							<div
								class="feature bg-primary bg-gradient text-white rounded-3 mb-3">
								<i class="bi bi-telephone"></i>
							</div>
							<div class="h5">Call us</div>
							<p class="text-muted mb-0">Call us during normal business
								hours at (555) 892-9403.</p>
						</div>
					</div>
				</div>
	</section>
	</main>

	<%@include file="../include/footer.jsp"%>
</body>
</html>>
