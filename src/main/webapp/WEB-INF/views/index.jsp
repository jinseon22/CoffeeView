<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- 이미지 슬라이더 -->
<div class="image-slider-wrapper">
	<img src="${pageContext.request.contextPath}/img/index/imageSlider01.png">
</div>

<!-- 최고의 커피 -->
<section class="best-coffee-section">

	<div class="index-label-wrapper">
		<hr class="index-label-hr">
		<span class="index-label-span">최고의 커피</span>
		<hr class="index-label-hr">
	</div>

	<div class="coffee-list-container">
		<ul class="coffee-ul">
			<c:forEach items="${bestCoffee}" var="coffee">
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

</section>

<!-- 새로운 커피 -->
<section class="new-coffee-section">

	<div class="index-label-wrapper">
		<hr class="index-label-hr">
		<span class="index-label-span">새로운 커피</span>
		<hr class="index-label-hr">
	</div>

	<div class="coffee-list-container">
		<ul class="coffee-ul">
			<c:forEach items="${newCoffee}" var="coffee">
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

</section>

<section class="best-community-section"></section>
