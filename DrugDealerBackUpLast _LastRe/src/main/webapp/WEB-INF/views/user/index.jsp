<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>Main</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Bootstrap icons-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
	rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="${pageContext.request.contextPath}/resources/css/styles.css"
	rel="stylesheet" type="text/css" />
<style>
div {
	display: block;
	border: none;
}

ul {
	list-style-type: square;
	padding: 5px 0px 5px 5px;
	margin-bottom: 5px;
	border-bottom: 1px solid #efefef;
	font-size: 12px;
}

p a {
	color: inherit;
	text-decoration: none;
	font-size: 12px;
}

p a:hover {
	color: inherit;
	text-decoration: underline;
}

ul li a {
	color: inherit;
	text-decoration: none;
}
/* .row gx-5 row-cols-1 row-cols-md-2*/
.row_gx-5_row-cols-1_row-cols-md-3 img {
	position: relative;
	width: 340px;
	height: 300px;
}

.col-lg-10_col-xl-7 {
	width: 900px;
	height: 340px;
	align-content-center: center;
	justify-content: center;
	position: relative;
	display: block;
	margin-block: 10px 20px;
	writing-mode: horizontal-tb;
}

.col-lg-10_col-xl-7 img {
	width: 150px;
	height: auto;
	margin: 0 1.3em;
}
</style>
<script>
var index = 0; //이미지에 접근하는 인덱스
window.onload = function() {
	slideShow();
}

function slideShow() {
	var i;
	var x = document.getElementsByClassName("img-fluid rounded-3 my-5"); //slide1에 대한 dom 참조
	for (i = 0; i < x.length; i++) {
		x[i].style.display = "none"; //처음에 전부 display를 none으로 한다.
	}
	index++;
	if (index > x.length) {
		index = 1; //인덱스가 초과되면 1로 변경
	}
	x[index - 1].style.display = "block"; //해당 인덱스는 block으로
	setTimeout(slideShow, 100); //함수를 4초마다 호출

}
</script>
</head>
<body class="d-flex flex-column h-100">
	<main class="flex-shrink-0"> <!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container px-5">
			<a class="navbar-brand" href="/ex/"><Strong>The Trippy</Strong></a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link" href="/ex/">Home</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/ex/login/login">Sign In</a></li>
					<!-- <li class="nav-item"><a class="nav-link" href="pricing.html">Pricing</a></li> -->
					<li class="nav-item"><a class="nav-link" href="/ex/qna/faq">FAQ</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/ex/notice/list">Notice</a></li>
					<!-- <li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
						role="button" data-bs-toggle="dropdown" aria-expanded="false">Blog</a>
						<ul class="dropdown-menu dropdown-menu-end"
							aria-labelledby="navbarDropdownBlog">
							<li><a class="dropdown-item" href="blog-home.html">Blog
									Home</a></li>
							<li><a class="dropdown-item" href="blog-post.html">Blog
									Post</a></li>
						</ul></li> -->
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" id="navbarDropdownPortfolio"
						href="#" role="button" data-bs-toggle="dropdown"
						aria-expanded="false"> info</a>
						<ul class="dropdown-menu dropdown-menu-end"
							aria-labelledby="navbarDropdownPortfolio">
							<li><a class="dropdown-item" href="/ex/users/info">
									myinfo </a></li>
							<!-- <li><a class="dropdown-item" href="portfolio-item.html">Portfolio
									Item</a></li> -->
						</ul></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- Header--> <header class="bg-dark py-5">
		<div class="container px-5">
			<div class="row gx-5 align-items-center justify-content-center">
				<div class="col-lg-8 col-xl-7 col-xxl-6">
					<div class="my-5 text-center text-xl-start">
						<h1 class="display-5 fw-bolder text-white mb-2">
							함께하면 행복해지는 <br>국민행복연구소 💊
						</h1>
						<p class="lead fw-normal text-white-50 mb-4">🤪과다한 약물의 오냠용을
							환영합니다.💰</p>
						<div
							class="d-grid gap-3 d-sm-flex justify-content-sm-center justify-content-xl-start">
							<a class="btn btn-primary btn-lg px-4 me-sm-3" href="#features">Get
								Started</a> <a class="btn btn-outline-light btn-lg px-4"
								href="/ex/selectAll">Go Shoping</a>
						</div>
					</div>
				</div>
				<div class="col-xl-5 col-xxl-6 d-none d-xl-block text-center">
					<iframe width="420" height="380"
						src="https://www.youtube.com/embed/miomuSGoPzI?autoplay=1&mute=1"
						title="Chicken Attack // Song Voyage // Japan // ft. Takeo Ischi"
						frameborder="0"
						allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
						allowfullscreen></iframe>
				</div>
			</div>
		</div>
	</header> <!-- Features section-->
	<section class="py-5" id="features">
		<div class="container px-5 my-5">
			<div class="row gx-5 row-cols-1 row-cols-md-2">
				<div class="col mb-5 h-100">
					<h6>공지</h6>
					<br>
					<ul>
						<c:forEach items="${list}" var="dto">
							<li><a
								href="/ex/notice/read${pageMaker.makeSearch()}&bno=${dto.bno}">${dto.title }</a>

							</li>
						</c:forEach>
					</ul>
					<p>
						<a href="/ex/notice/list">더 보기</a>
					</p>
				</div>
				<div class="col mb-5 h-100">
					<img width="500px" src="http://old.kpanews.co.kr/common_files/upload_files/article/img/220127_M1_1.gif">					
				</div>
				<div class="col mb-5 mb-md-0 h-100">
					<img width="500px" height="280px"
						src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvmtGgQlpzIv95cX0xTVNrs7ccjLj9GD_CUOK4jpC1Ug&s">
				</div>
				<div class="col h-100">
					<img width="500px" src="https://cdn.greenpostkorea.co.kr/news/photo/201606/61994_43469_art_1464946021.gif">						
				</div>
			</div>
		</div>
		</div>
		</div>
	</section>
	</main>
	<!-- Footer-->
	<footer class="bg-dark py-4 mt-auto">
		<div class="container px-5">
			<div
				class="row align-items-center justify-content-between flex-column flex-sm-row">
				<div class="col-auto">
					<div class="small m-0 text-white">Copyright &copy; Your
						Website 2022</div>
				</div>
				<div class="col-auto">
					<a class="link-light small" href="#!">Privacy</a> <span
						class="text-white mx-1">&middot;</span> <a
						class="link-light small" href="#!">Terms</a> <span
						class="text-white mx-1">&middot;</span> <a
						class="link-light small" href="#!">Contact</a>
				</div>
			</div>
		</div>
	</footer>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script
		src="${pageContext.request.contextPath}/resources/js/scripts.js"></script>
</body>
</html>
