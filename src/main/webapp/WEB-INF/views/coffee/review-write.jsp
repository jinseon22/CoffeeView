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
						<th scope="row">후기</th>
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
	
		<!-- 후기 로고 -->
		<div class="review-top-container">
			<span class="review-logo">후기</span>
		</div>
		
		<!-- 후기 작성칸 -->
		<textarea></textarea>
		
	</div>

</section>
<script>
	
</script>