<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 분류 보기 -->
<section class="coffee-category-section">

	<div class="coffee-category-container">
		<div class="coffee-category-title">
			<p>분류 보기</p>
		</div>

		<div class="coffee-category-toggle-wrapper">
			<a><img
				src="${pageContext.request.contextPath}/img/coffee/list/category_toggle_fold.png"></a>
		</div>

		<div class="coffee-category-toggle-content-container">
			<div class="coffee-category-container-for-border">
				<div class="coffee-category-ul-container">
					<ul class="coffee-category-ul">
						<li><input type="checkbox" id="all-kind"><label for="all-kind">전체
								종류</label></li>
					</ul>
				</div>

				<div class="coffee-category-ul-container">
					<ul class="coffee-category-ul">
						<li><input type="checkbox" id="espresso"><label for="espresso">에스프레소</label></li>
						<li><input type="checkbox" id="americano"><label for="americano">아메리카노</label></li>
						<li><input type="checkbox" id="latte"><label for="latte">라떼</label></li>
						<li><input type="checkbox" id="cappuccino"><label for="cappuccino">카푸치노</label></li>
						<li><input type="checkbox" id="blended"><label for="blended">블렌디드</label></li>
						<li><input type="checkbox" id="macchiato"><label for="macchiato">마끼아또</label></li>
					</ul>
				</div>

				<div class="coffee-category-ul-container">
					<ul class="coffee-category-ul">
						<li><input type="checkbox" id="vanilla"><label for="vanilla">바닐라</label></li>
						<li><input type="checkbox" id="mocha"><label for="mocha">모카</label></li>
						<li><input type="checkbox" id="caramel"><label for="caramel">카라멜</label></li>
						<li><input type="checkbox" id="hazelnut"><label for="hazelnut">헤이즐넛</label></li>
					</ul>
				</div>

				<div class="coffee-category-ul-container">
					<ul class="coffee-category-ul">
						<li><input type="checkbox" id="cold-brew"><label for="cold-brew">콜드브루</label></li>
						<li><input type="checkbox" id="decaf"><label for="decaf">디카페인</label></li>
						<li><input type="checkbox" id="etc"><label for="etc">기타</label></li>
					</ul>
				</div>
			</div>
			<div class="coffee-category-container-for-border">
				<div class="coffee-category-ul-container">
					<ul class="coffee-category-ul">
						<li><input type="checkbox" id="rate-high"><label for="rate-high">평점
								높은 순</label></li>
						<li><input type="checkbox" id="rate-low"><label for="rate-low">평점
								낮은 순</label></li>
						<li><input type="checkbox" id="review-many"><label for="review-many">리뷰
								많은 순</label></li>
						<li><input type="checkbox" id="review-few"><label for="review-few">리뷰
								적은 순</label></li>
					</ul>
				</div>
			</div>
			<div class="coffee-category-ul-container">
				<ul class="coffee-category-ul">
					<li><input type="checkbox" id="all-brand"><label for="all-brand">전체
							브랜드</label></li>
					<li><input type="checkbox" id="mega-mgc"><label for="mega-mgc">메가MGC</label></li>
					<li><input type="checkbox" id="starbucks"><label for="starbucks">스타벅스</label></li>
					<li><input type="checkbox" id="ediya"><label for="ediya">이디야</label></li>
				</ul>
			</div>
		</div>
	</div>
</section>

<!-- 커피 리스트 -->
<section id="coffee-list-section">
	<div class="coffee-list-container">
		<ul class="coffee-ul">
			<c:forEach items="${allCoffee}" var="coffee">
				<li>
					<div class="coffee-list-item-container"
						onclick="location.href='${pageContext.request.contextPath}/coffee/detail?id=${coffee.id}'">
						<div class="coffee-list-img-wrapper">
							<img
								src="${pageContext.request.contextPath}/img/coffee/brand/${coffee.brand_eng}/${coffee.thumbnail}.png">
						</div>
						<div class="coffee-list-brand">${coffee.brand_kr}</div>
						<div class="coffee-list-name">${coffee.name}</div>
					</div>
				</li>
			</c:forEach>
		</ul>
	</div>

	<!-- 페이징 -->
	<div class="coffee-list-paging-container">
		<ul>
			<!-- 이전 페이지 -->
			<c:if test="${pageMaker.prev}">
				<li><a
					href="${pageContext.request.contextPath}/coffee/list?pageNum=${pageMaker.startPage-1}">이전</a></li>
			</c:if>

			<!-- 현재 페이지 목록 -->
			<c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
				<!-- 현재 페이지 css active -->
				<li><a
					class="coffee-list-paging-a${pageMaker.cri.pageNum==num ? '-clicked' : ''}"
					href="${pageContext.request.contextPath}/coffee/list?pageNum=${num}">${num}</a></li>
			</c:forEach>

			<!-- 다음 페이지 -->
			<c:if test="${pageMaker.next}">
				<li><a
					href="${pageContext.request.contextPath}/coffee/list?pageNum=${pageMaker.endPage+1}">다음</a></li>
			</c:if>
		</ul>

		<form method="get">
			<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
			<input type="hidden" name="amount" value="${pageMaker.cri.amount}">
		</form>
	</div>
</section>

<script>
	//카테고리 토글 접기, 펼치기
	$(".coffee-category-toggle-wrapper").click(function() {
		$(".coffee-category-toggle-content-container").toggle();
	});

	// 토글 버튼 이미지 변경
	var toggleCheck = false;
	var toggleImg = $(".coffee-category-toggle-wrapper img");

	$(".coffee-category-toggle-wrapper")
			.click(
					function() {
						if (toggleCheck == false) {
							toggleImg
									.attr("src",
											"${pageContext.request.contextPath}/img/coffee/list/category_toggle_unfold.png");
							toggleCheck = !toggleCheck;
						} else {
							toggleImg
									.attr("src",
											"${pageContext.request.contextPath}/img/coffee/list/category_toggle_fold.png");
							toggleCheck = !toggleCheck;
						}
					});
</script>