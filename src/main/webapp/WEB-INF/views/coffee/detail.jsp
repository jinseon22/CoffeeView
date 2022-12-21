<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
						<th scope="row">후기</th>
						<td>${coffee.rate}/5(★리뷰개수★)</td>
					</tr>
					<tr>
						<th scope="row">카테고리</th>
						<td>${coffee.category1},${coffee.category2},${coffee.category3}</td>
					</tr>
				</table>
			</div>

		</div>
	</div>
</section>

<section class="review-section">

	<div class="review-container">

		<!-- 후기 로고, 순서 정렬 -->
		<div class="review-top-container">
			<span class="review-logo">후기</span>
			<span class="review-radio-wrapper">
				<input type="radio" id="new" name="order">
				<label for="new">최신 순</label>
			</span>
			<span class="review-radio-wrapper">
				<input type="radio" id="like" name="order">
				<label for="like">좋아요 순</label>
			</span>
		</div>

		<!-- 각각의 후기 -->
		<div class="review-one-container">
			<div class="review-user-container">
				<div class="review-user-profile-wrapper">
					<img src="${pageContext.request.contextPath}/img/review/user_profile_default.png">
				</div>

				<div class="review-user-info-container">
					<div class="review-user-info-wrapper">
						<span class="review-user-nickname">UserNickname</span>
						<span class="review-user-grade">UserGrade</span>
						<span class="review-user-regdate">2022-12-01</span>
					</div>
					<div class="review-user-score">score</div>
				</div>
			</div>

			<div class="review-content">
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin interdum id nunc id
				luctus. Ut et feugiat dui. Cras viverra hendrerit eros, sed ornare arcu ultricies a.
				Aliquam efficitur scelerisque sagittis. Donec at volutpat urna. Duis nec ante ac erat
				tempus aliquam sit amet eget nunc. Aliquam et ligula eget arcu lobortis cursus. Nullam
				non tempus lorem, ac placerat elit. Vestibulum ante ipsum primis in faucibus orci
				luctus et ultrices posuere cubilia curae; Nunc nec aliquet magna, id tincidunt diam.
				Aenean vitae mi diam. Vestibulum dictum sapien in est dignissim, non blandit arcu
				mattis. Vivamus nec tellus vulputate, rutrum arcu id, vehicula ipsum. <br>Fusce
				sit amet magna vitae risus consequat sagittis. Phasellus ac augue at lacus eleifend
				venenatis. Praesent quis libero volutpat, facilisis eros ut, sollicitudin arcu.
				Vestibulum ut libero pretium, ornare nunc lobortis, tempus eros. Curabitur et metus
				ornare, tristique nisi ut, mattis ipsum. Aliquam aliquam posuere mauris. Phasellus
				laoreet sodales libero, ut pretium ligula volutpat et. Ut commodo ipsum in nulla
				sodales egestas. Cras euismod, augue vel sodales varius, magna nisl euismod magna, ut
				egestas dolor nisi eget dui. Praesent tincidunt ac nisl at ornare. Aliquam nec
				tristique lacus. Phasellus ac orci in purus mattis lacinia et vitae arcu. Donec at
				orci nec velit pulvinar tincidunt.
			</div>

			<div class="review-recommendation-wrapper">
				<div class="review-recommendation">
					<img src="${pageContext.request.contextPath}/img/review/heart_full.png"> 1234
				</div>
			</div>
		</div>
	</div>
</section>
<script>
	
</script>