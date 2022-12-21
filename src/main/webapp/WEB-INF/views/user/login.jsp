<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<section class="login-section">

	<div class="login-container">
		<div class="login-label">로그인</div>
		<form id="login-form" method="post">
		
			<div class="login-input-wrapper">
				<input type="text" id="email" name="email" placeholder="이메일">
			</div>
			
			<div class="login-input-wrapper">
				<input type="password" id="password" name="password" placeholder="비밀번호">
			</div>
			
			<div class="login-check-text">이메일이나 비밀번호를 다시 확인해주세요.</div>
			<div class="login-button-wrapper">
				<button type="button">로그인</button>
			</div>
		</form>
	</div>

	<div class="login-menu-container">
		<a href="">아이디 찾기</a>&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;<a href="">비밀번호
			찾기</a>&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;<a
			href="${pageContext.request.contextPath}/user/join">회원가입</a>
	</div>

</section>

<script>
	// 로그인
	$(".login-button-wrapper button").click(function() {
		
		var inputEmail = $("#email").val();
		var inputPassword = $("#password").val();
		var data = {
			inputEmail : inputEmail,
			inputPassword : inputPassword
		}

		$.ajax({
			type : "POST",
			url : "${pageContext.request.contextPath}/user/login/submit",
			data : data,
			success : function(result) {
				
				if (result == "success") {
					location.href = "${pageContext.request.contextPath}/index";

				} else {
					$(".login-check-text").css("visibility", "visible");
				}
			}
		});
	});
</script>