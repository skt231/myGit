  <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
  <%--  <%@include file="../include/header.jsp"%>   --%>
   <html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Modern Business - Start Bootstrap Template</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="resouces/css/styles.css" rel="stylesheet" />
        <!-- Bootstrap core JS-->
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script> 
        <!-- Core theme JS-->
        <script src="resources/js/scripts.js"></script>
         <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" type="text/css"/>
         
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="container px-5">
                    <a class="navbar-brand" href="index.html">Start drug</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                            <li class="nav-item"><a class="nav-link" href="index.html">Home</a></li>
                            <li class="nav-item"><a class="nav-link" href="about.html">About</a></li>
                            <li class="nav-item"><a class="nav-link" href="contact.html">Contact</a></li>
                            <li class="nav-item"><a class="nav-link" href="pricing.html">Pricing</a></li>
                            <li class="nav-item"><a class="nav-link" href="faq.html">FAQ</a></li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Blog</a>
                                <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdownBlog">
                                    <li><a class="dropdown-item" href="blog-home.html">Blog Home</a></li>
                                    <li><a class="dropdown-item" href="blog-post.html">Blog Post</a></li>
                                </ul>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" id="navbarDropdownPortfolio" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Portfolio</a>
                                <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdownPortfolio">
                                    <li><a class="dropdown-item" href="portfolio-overview.html">Portfolio Overview</a></li>
                                    <li><a class="dropdown-item" href="portfolio-item.html">Portfolio Item</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            <!-- Page Content-->
            <section class="py-5">
                <div class="container px-5 my-5">
                    <div class="text-center mb-5">
                        <h1 class="fw-bolder">자주 물어보는 질문</h1>
                        <p class="lead fw-normal text-muted mb-0"></p>
                    </div>
                    <div class="row gx-5">
                        <div class="col-xl-8">
                            <!-- FAQ Accordion 1-->
                            <h2 class="fw-bolder mb-3">Account &amp; Billing</h2>
                            <div class="accordion mb-5" id="accordionExample">
                                <div class="accordion-item">
                                    <h3 class="accordion-header" id="headingOne"><button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">Accordion Item #1</button></h3>
                                    <div class="accordion-collapse collapse show" id="collapseOne" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
                                        <div class="accordion-body">
                                            <strong>This is the first item's accordion body.</strong>
                                            It is shown by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the
                                            <code>.accordion-body</code>
                                            , though the transition does limit overflow.
                                        </div>
                                    </div>
                                </div>
                                <div class="accordion-item">
                                    <h3 class="accordion-header" id="headingTwo"><button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">Accordion Item #2</button></h3>
                                    <div class="accordion-collapse collapse" id="collapseTwo" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
                                        <div class="accordion-body">
                                            <strong>This is the second item's accordion body.</strong>
                                            It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the
                                            <code>.accordion-body</code>
                                            , though the transition does limit overflow.
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- FAQ Accordion 2-->
                            <h2 class="fw-bolder mb-3">Website Issues</h2>
                            <div class="accordion mb-5 mb-xl-0" id="accordionExample2">
                                <div class="accordion-item">
                                    <h3 class="accordion-header" id="headingOne"><button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">Accordion Item #1</button></h3>
                                    <div class="accordion-collapse collapse show" id="collapseOne" aria-labelledby="headingOne" data-bs-parent="#accordionExample2">
                                        <div class="accordion-body">
                                            <strong>This is the first item's accordion body.</strong>
                                            It is shown by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the
                                            <code>.accordion-body</code>
                                            , though the transition does limit overflow.
                                        </div>
                                    </div>
                                </div>
                                <div class="accordion-item">
                                    <h3 class="accordion-header" id="headingTwo"><button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">Accordion Item #2</button></h3>
                                    <div class="accordion-collapse collapse" id="collapseTwo" aria-labelledby="headingTwo" data-bs-parent="#accordionExample2">
                                        <div class="accordion-body">
                                            <strong>This is the second item's accordion body.</strong>
                                            It is hidden by default, until the collapse plugin adds the appropriate classes that we use to style each element. These classes control the overall appearance, as well as the showing and hiding via CSS transitions. You can modify any of this with custom CSS or overriding our default variables. It's also worth noting that just about any HTML can go within the
                                            <code>.accordion-body</code>
                                            , though the transition does limit overflow.
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-4">
                            <div class="card border-0 bg-light mt-xl-5">
                                <div class="card-body p-4 py-lg-5">
                                    <div class="d-flex align-items-center justify-content-center">
                                        <div class="text-center">
                                            <div class="h6 fw-bolder">Have more questions?</div>
                                            <p class="text-muted mb-4">
                                                Contact us at
                                                <br />
                                                <a href="#!">support@domain.com</a>
                                            </p>
                                            <div class="h6 fw-bolder">Follow us</div>
                                            <a class="fs-5 px-2 link-dark" href="#!"><i class="bi-twitter"></i></a>
                                            <a class="fs-5 px-2 link-dark" href="#!"><i class="bi-facebook"></i></a>
                                            <a class="fs-5 px-2 link-dark" href="#!"><i class="bi-linkedin"></i></a>
                                            <a class="fs-5 px-2 link-dark" href="#!"><i class="bi-youtube"></i></a>
                                        </div>
                                    </div>
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
                <div class="row align-items-center justify-content-between flex-column flex-sm-row">
                    <div class="col-auto"><div class="small m-0 text-white">Copyright &copy; Your Website 2022</div></div>
                    <div class="col-auto">
                        <a class="link-light small" href="#!">Privacy</a>
                        <span class="text-white mx-1">&middot;</span>
                        <a class="link-light small" href="#!">Terms</a>
                        <span class="text-white mx-1">&middot;</span>
                        <a class="link-light small" href="#!">Contact</a>
                    </div>
                </div>
            </div>
        </footer>
<%--   <div class="main">
    <h2>게시판 board</h2>
    <h5>목록화면</h5>
    <div>
    	<select name="searchType">
    		<option value="n" <c:out value="${pageMaker.searchType eq '-----'?'selected':'' }"/>>-----</option>
    		<!-- <option value="n" selected>----</option>
    		<option value="n">----</option> -->
    		<option value="t" <c:out value="${pageMaker.searchType eq 't'?'selected':'' }"/>>title</option>
    		<option value="c" <c:out value="${pageMaker.searchType eq 'c'?'selected':'' }"/>>content</option>
    		<option value="w" <c:out value="${pageMaker.searchType eq 'w'?'selected':'' }"/>>writer</option>
    		<option value="tc" <c:out value="${pageMaker.searchType eq 'tc'?'selected':'' }"/>>title or content</option>
    		<option value="cw" <c:out value="${pageMaker.searchType eq 'cw'?'selected':'' }"/>>c w</option>
    		<option value="tcw" <c:out value="${pageMaker.searchType eq 'tcw'?'selected':'' }"/>>t c w</option>
    	</select>
    	
    	<!-- input 에 text를 입력하면 value로 설정된 pageMaker에 keyword의 값이 id값으로 들어간다.
    	입력값이 쿼리 스트링에 들어간다. -->
    	<input type="text" name="keyword" 	
    		id="keywordInput" value="${pageMaker.keyword}">
    	<button id="searchBtn"> 검색하기</button>
    	<button id="newBtn"> 새글</button>    	
    </div>
    
      <table class='customers' width=100% border="1">
	<tr>
		<th style="width: 10px">BNO</th>
		<th style="width: 200px">TITLE</th>
		<th style="width: 300px">CONTENT</th>
		<th style="width: 100px">WRITER</th>
		<th style="width: 200px">REGDATE</th>
		<th style="width: 40px">VIEWCNT</th>
	</tr>
	
	<c:forEach items="${list}" var="dto">	
		<tr>
			<td style="width: 10px">${dto.bno }</td>
			<td><a href="/ex/sboard/read${pageMaker.makeSearch()}&bno=${dto.bno}">${dto.title }</a></td>
			<td style="width: 300px">${dto.content }</td>
			<td style="width: 100px">${dto.writer }</td>
			<td style="width: 200px">
			<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value= "${dto.regdate }"/></td>
			<td style="width: 40px">${dto.viewcnt }</td>
		</tr>
	</c:forEach> 
	</table>
	
    <button class='writeBtn'>글쓰기</button>
    <div class="pagination">
    	<c:if test="${pageMaker.page !=1}">
    		<a href='list${pageMaker.makeSearch(1)}'>&laquo;</a>
    	</c:if>
    	<!-- 앞전 page 모양을 클릭하면 pageMarker.startPage에 -1을 처리해준다.-->
    	<c:if test="${pageMaker.prev }">
    		<a href='list${pageMaker.makeSearch(pageMaker.startPage-1)}'>&lt;</a>
    	</c:if>
    	
    	<c:forEach begin="${pageMaker.startPage }" end="${ pageMaker.endPage}" var="idx">
    		<a href='list${pageMaker.makeSearch(idx)}' 
    		 <c:out value="${pageMaker.page==idx?' class=active ':'' }"/> >
    		 ${idx}</a>
    	</c:forEach>
    	
    	<a href='#'>1</a>
    	 <a href='list${pageMaker.makeSearch(2)}'>2</a>
    	<a href='#' class="active">3</a>
    	
    	<c:if test="${pageMaker.next }">
    		<a href='list${pageMaker.makeSearch(pageMaker.endPage+1)}'>&gt;</a>
    		
    	</c:if>
    	
    	
    	<c:if test="${pageMaker.page != pageMaker.totalEndPage}">
    		<a href='list${pageMaker.makeSearch(pageMaker.totalEndPage)}'>&raquo;</a>
    	</c:if>
    	
    </div>
  </div>
   <%@include file="../include/footer.jsp"%>  --%>
   </body>
   </html>
  
  
  
  
  
  
  
  
  
  
  
  
