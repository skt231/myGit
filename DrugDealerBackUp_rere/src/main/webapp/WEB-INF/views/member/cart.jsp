<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>My Page</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" />
        <link href="${pageContext.request.contextPath}/resources/css/cart.css" rel="stylesheet" />
        <style>
            li a{
                text-decoration: none;
                color: rgba(0, 0, 0, 0.767);
            }
        </style>
        <script src="/resources/jquery/jquery-3.3.1.min.js"></script>
    </head>
    <body class="d-flex flex-column h-100">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="container px-5">
                    <a class="navbar-brand" href="/ex/">Start Bootstrap</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                            <li class="nav-item"><a class="nav-link" href="/ex/">Home</a></li>
                            <li class="nav-item"><a class="nav-link" href="/ex/login/login">Sign In</a></li>
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
            <section class="cart">
                <table class="cart__list">
                    <form>
                        <thead>
                            <tr>
                                <td><input type="checkbox" name="allCheck">
                                <script>
                                $("#allCheck").click(function(){
                                	var chk = $("#allCheck").prop("checked");
                                	if(chk){
                                		$(".chBox").prop("checked", true);
                                	}else {
                                		$(".chBox").prop("checked", false);
                                	}
                                });
                                </script>
                                </td>
                                <td colspan="2">상품 정보</td>
                                <td>옵션</td>
                                <td>상품 금액</td>
                            </tr>
                        </thead>
                        <tbody>
                      
                        <c:set var="finalPrice" value="0"/>
                        <c:forEach items="${list}" var="dto">
                            <tr class="cart__list__detail">
                                <td><input type="checkbox" name="chBox" data-cn="${dto.cn }"></td>
                                <script>
                                $("#chBox").click(function(){
                                	$("#allCheck").prop("checked", false);
                                });
                                </script>
                                <td><img src="image/keyboard.jpg" alt="magic keyboard"></td>
                                <td>
                                    <p><a href="#">${dto.name }</a></p>
                                    <c:set var="totalPrice" value="${dto.quantity * dto.price }"/>
                                    <font color="lightgray"> ${dto.price}원</font>
                                </td>
                                <td class="cart__list__option">
                                    <p>수량 : ${dto.quantity }개</p>
                                    <button class="cart__list__optionbtn">주문조건 추가/변경</button>
                                </td>
                                <td><span class="price">${totalPrice }원</span><br>
                                    <button class="cart__list__orderbtn">주문하기</button>
                                </td>
                            </tr>
                            <c:set var="finalPrice" value="${finalPrice+dto.price }"/>
                           	<c:set var="id" value="${dto.id }"/>
						</c:forEach>
						
                        </tbody>
                        <tfoot>
                            <tr>
                                <td colspan="3"><input type="checkbox" data-cn="${dto.cn }"> <button class="cart__list__optionbtn">선택 상품 삭제</button>
                                <script>
                                $(".cart__list__optionbtn").click(function(){
                                	var confirm_val = confirm("정말 삭제하시겠습니까?");
                                	
                                	if(confirm_val) {
                                		   var checkArr = new Array();
                                		   
                                		   $("input[class='chBox']:checked").each(function(){
                                		    checkArr.push($(this).attr("data-cn"));
                                		   });
                                		    
                                		   $.ajax({
                                		    url : "/cart/delete",
                                		    type : "post",
                                		    data : { chbox : checkArr },
                                		    success : function(){
                                		     location.href = "/cart/cartList";
                                		    }
                                		   });
                                		  } 
                                		 });
                                
                                </script>
                                <button class="cart__list__optionbtn"><a href="/ex/member/cart/deleteAll?id=${id}">장바구니 비우기</button></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                        </tfoot>
                </table>
                <h5>결제 예정 금액 : ${finalPrice }원</h5>
                <div class="cart__mainbtns">
                    <button class="cart__bigorderbtn left"><a href="/ex/selectAll">쇼핑 계속하기</a></button>
                    <button class="cart__bigorderbtn right"><a href="#">주문하기</a></button>
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
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
