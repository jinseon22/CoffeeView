<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<header>

	<!-- 상단 메뉴 -->
	<nav>
		<div class="header-top-container">
			<ul>
				<!-- 로그인 전 -->
				<c:if test="${empty loginUser}">
					<li><a href="${pageContext.request.contextPath}/user/login">로그인</a></li>
					<li><a href="${pageContext.request.contextPath}/user/join">회원가입</a></li>
				</c:if>

				<!-- 로그인 후 -->
				<c:if test="${!empty loginUser}">
					<li><a href="">${loginUser.nickname}님</a></li>
					<li><a class="header-logout-a">로그아웃</a></li>
					<li><a href="">마이페이지</a></li>
				</c:if>

				<!-- 관리자 메뉴 -->
				<c:if test="${loginUser.is_admin==true}">
					<li><a href="">관리자 페이지</a></li>
				</c:if>

				<li><a href="">고객센터</a></li>
			</ul>
		</div>
	</nav>
	
	<!-- 메인 메뉴 -->
	<div class="header-main-container">
		<div class="header-logo-wrapper">
			<a href="${pageContext.request.contextPath}/index"><img class="header-logo"
				src="${pageContext.request.contextPath}/img/header/logo.png"></a>
		</div>
		<nav>
			<ul class="header-main-ul">
				<li><a href="">커피뷰</a></li>
				<li><a href="${pageContext.request.contextPath}/coffee/list">순위</a></li>
				<li><a href="">후기</a></li>
				<li><a href="">이야기</a></li>
				<li><a href="">검색</a></li>
			</ul>
		</nav>
	</div>
	<hr class="header-bottom-hr">
</header>

<script>
	// 로그아웃
	$(".header-logout-a").click(function() {
		$.ajax({
			type : "POST",
			url : "${pageContext.request.contextPath}/user/logout",
			success : function(data) {
				document.location.reload();
			}
		});
	});
</script>