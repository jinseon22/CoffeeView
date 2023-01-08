<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<section class="coffee-detail-section">
	<div class="coffee-detail-container">
		<div class="coffee-detail-img-wrapper">
			<img
				src="${pageContext.request.contextPath}/img/coffee/brand/${coffee.brand_eng}/${coffee.thumbnail}.png">
		</div>

		<div class="coffee-detail-info-container">
			<div class="coffee-detail-title-container">
				<div class="coffee-detail-title-kr">${coffee.name_kr}</div>
				<div class="coffee-detail-title-eng">${coffee.name_eng}</div>
			</div>


			<div class="coffee-detail-table-wrapper">
				<table>
					<tr>
						<th scope="row">브랜드</th>
						<td>${coffee.brand_kr}</td>
					</tr>
					<tr>
						<th scope="row">설명</th>
						<td>${coffee.description}</td>
					</tr>
					<tr>
						<th scope="row">리뷰</th>
						<td id="score">${score_avg}/5(${review_count}개)</td>
					</tr>
					<tr>
						<th scope="row">카테고리</th>
						<td>${coffee.category1},&nbsp;${coffee.category2},&nbsp;${coffee.category3}</td>
					</tr>
				</table>
			</div>

		</div>
	</div>
</section>

<section class="review-section">

	<div class="review-container">

		<!-- 리뷰 로고, 순서 정렬 -->
		<div class="review-top-container">
			<span class="review-logo">리뷰</span>
			<span class="review-radio-wrapper">
				<input type="radio" id="new" name="order">
				<label for="new">최신 순</label>
			</span>
			<span class="review-radio-wrapper">
				<input type="radio" id="like" name="order">
				<label for="like">좋아요 순</label>
			</span>
		</div>

		<!-- 각각의 리뷰 -->
		<c:forEach items="${coffeeReview}" var="review">
			<div class="review-one-container">
				<div class="review-user-container">
					<div class="review-user-profile-wrapper">
						<img src="${pageContext.request.contextPath}/img/review/user_profile_default.png">
					</div>

					<div class="review-user-info-container">
						<div class="review-user-info-wrapper">
							<span class="review-user-nickname">${review.nickname}</span>
							<span class="review-user-grade">${review.grade}</span>
							<span class="review-user-regdate">
								<fmt:formatDate value="${review.regdate}" pattern="yyyy-MM-dd" />
							</span>
						</div>
						<div class="review-user-score">${review.score}/5</div>
					</div>
				</div>

				<div class="review-content">${review.content}</div>

				<div class="review-recommendation-wrapper">
					<div class="review-recommendation">
						<img src="${pageContext.request.contextPath}/img/review/heart_full.png">${review.recommendation}
					</div>
				</div>
			</div>
		</c:forEach>

		<div class="review-write-button">
			<button type="button">작성하기 ></button>
		</div>
	</div>
</section>

<script>
	// 로그인 된 경우만 리뷰 작성 가능
	$(".review-write-button button")
			.click(
					function() {
						var loginUserId = '<c:out value="${loginUser.id}"/>';

						if (loginUserId > 0) {
							location.href = "${pageContext.request.contextPath}/coffee/review/write?id=${coffee.id}";

						} else {
							location.href = "${pageContext.request.contextPath}/user/login";
						}
					});
</script>