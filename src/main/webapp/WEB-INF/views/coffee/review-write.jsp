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

<section class="review-write-section">

	<div class="review-container">

		<!-- 리뷰 로고 -->
		<div class="review-top-container">
			<span class="review-logo">리뷰</span>
		</div>

		<form class="review-score-form" method="post"
			action="${pageContext.request.contextPath}/coffee/review/submit">
			<input type="hidden" name="coffee_id" value="${coffee.id}">
			<input type="hidden" name="user_id" value="${loginUser.id}">

			<!-- 별점 -->
			<div class="review-score-wrapper">
				<input type="radio" name="score" value="1" id="score1" required>
				<label for="score1"> <img id="star1"
					src="${pageContext.request.contextPath}/img/review/score_star_empty.png">
				</label>

				<input type="radio" name="score" value="2" id="score2">
				<label for="score2"> <img id="star2"
					src="${pageContext.request.contextPath}/img/review/score_star_empty.png">
				</label>

				<input type="radio" name="score" value="3" id="score3">
				<label for="score3"> <img id="star3"
					src="${pageContext.request.contextPath}/img/review/score_star_empty.png">
				</label>

				<input type="radio" name="score" value="4" id="score4">
				<label for="score4"> <img id="star4"
					src="${pageContext.request.contextPath}/img/review/score_star_empty.png">
				</label>

				<input type="radio" name="score" value="5" id="score5">
				<label for="score5"> <img id="star5"
					src="${pageContext.request.contextPath}/img/review/score_star_empty.png">
				</label>

				<span class="review-score-text">별점을 클릭해주세요.</span>
			</div>

			<!-- 리뷰 작성칸 -->
			<div class="review-textarea-wrapper">
				<textarea name="content" spellcheck="false" placeholder="커피에 관한 리뷰를 작성해주세요." required></textarea>
			</div>

			<!-- 등록 버튼 -->
			<div class="review-write-button">
				<button>등록하기 ></button>
			</div>
			
		</form>
	</div>
</section>

<script>
	// 평점 별 비우기
	function starEmpty(star) {
		$(star)
				.attr("src",
						"${pageContext.request.contextPath}/img/review/score_star_empty.png");
	}

	// 평점 별 채우기
	function starFull(star) {
		$(star)
				.attr("src",
						"${pageContext.request.contextPath}/img/review/score_star_full.png");
	}

	// 평점 숫자로 표시
	function starText(score) {
		$(".review-score-text").text(score + "/5");
	}

	// 평점 별 이미지 변경
	$("#score1").click(function() {
		starFull("#star1");
		starEmpty("#star2");
		starEmpty("#star3");
		starEmpty("#star4");
		starEmpty("#star5");
		starText(1);
	});

	$("#score2").click(function() {
		starFull("#star1");
		starFull("#star2");
		starEmpty("#star3");
		starEmpty("#star4");
		starEmpty("#star5");
		starText(2);
	});

	$("#score3").click(function() {
		starFull("#star1");
		starFull("#star2");
		starFull("#star3");
		starEmpty("#star4");
		starEmpty("#star5");
		starText(3);
	});

	$("#score4").click(function() {
		starFull("#star1");
		starFull("#star2");
		starFull("#star3");
		starFull("#star4");
		starEmpty("#star5");
		starText(4);
	});

	$("#score5").click(function() {
		starFull("#star1");
		starFull("#star2");
		starFull("#star3");
		starFull("#star4");
		starFull("#star5");
		starText(5);
	});

	// 등록 전 별점 입력 확인
	$(".review-write-button button").click(function() {
		;
	});
</script>