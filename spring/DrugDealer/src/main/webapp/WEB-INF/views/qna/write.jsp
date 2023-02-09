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
	<style type="text/css">
	a:link { color: grey; text-decoration:none}
	a:visited{color:grey; text-decoration:none} 
	}
	
	
	</style>
<script>

	$(document).ready(function() {
		var fObject = $(".form");

		$(".btnCancel").on("click", function() {

			fObject.attr("method", "get");
			fObject.attr("action", "/ex/qna/list");
			fObject.submit();

		})
		$(".btnSave").on("click", function() {
			fObject.attr("method", "post");
			fObject.attr("action", "/ex/qna/modify");
			fObject.submit();
		})

	});
</script>
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
					<h1 class="fw-bolder">문의하기</h1>
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
						<!-- to get an API token!-->
						<form id="contactForm" action="/ex/qna/write" method="post">

							<div class="main">
								<div class="box-header">
									<h1 class="box-title">
									
										</h3>
								</div>
								<!-- /.box-header -->
								<!-- action에 경로가 없으면 현재 페이지 주소로 이동한다.-->
								<form role="form" action="/ex/qna/write" method="post">
									<h6>
										제목 <input type="text" name='title' placeholder="제목을 입력해 주세요"
											style="width: 100%">
									</h6>
									<h6>
										내용
										<textarea name="content" rows="8" style="width: 100%"
											placeholder="내용을 50자 이상 입력해 주세요." minlength : "50"></textarea><br>
											<span style="color:#aaa;" id="counter">(0 / 최대 200자)</span>
									</h6>
									<h6>
										작성자 <input type="text" name="writer" placeholder="작성자"
											style="width: 100%">
									</h6>
									<!-- /.box-body -->
									<button type="submit" class="btn">새글등록</button>
								</form>
								<button class="btn"><a href="/ex/qna/list">취소</a></button>
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
</html>

