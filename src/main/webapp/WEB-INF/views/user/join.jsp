<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<section id="join-section">

	<div id="join-label">회원가입</div>
	<form id="join-form" method="post">

		<div class="join-input-container" id="join-email-container">
			<label for="email">이메일</label>
			<div id="join-email-wrapper">
				<input type="email" id="email" name="email" required>
				<button type="button">인증번호 전송</button>
			</div>
			<span class="join-check-text" id="email-text-true">사용 가능한 이메일입니다.</span>
			<span class="join-check-text" id="email-text-false">이미 사용 중이거나 잘못된 형식의 이메일입니다.</span>
		</div>

		<div class="join-input-container">
			<label for="emailCode">이메일 인증번호</label>
			<input type="text" class="emailCode-input" id="emailCode-disabled" name="emailCode"
				disabled="disabled">
			<span class="join-check-text" id="emailCode-text-true">인증번호가 일치합니다.</span>
			<span class="join-check-text" id="emailCode-text-false">인증번호를 다시 확인해주세요.</span>
		</div>

		<div class="join-input-container">
			<label for="password">비밀번호</label>
			<input type="password" id="password" name="password" required>
			<!-- <span class="join-check-test">5글자 이상 입력해주세요.</span> -->
		</div>

		<div class="join-input-container">
			<label for="password-check">비밀번호 확인</label>
			<input type="password" id="password-check" required>
			<span class="join-check-text" id="password-check-text-true">비밀번호가 일치합니다.</span>
			<span class="join-check-text" id="password-check-text-false">비밀번호를 다시 확인해주세요.</span>
		</div>

		<div class="join-input-container">
			<label for="nickname">닉네임</label>
			<input type="text" id="nickname" name="nickname" required>
			<span class="join-check-text" id="nickname-text-true">사용 가능한 닉네임입니다.</span>
			<span class="join-check-text" id="nickname-text-false">이미 사용 중인 닉네임입니다.</span>
		</div>
		<div>
			<button type="button" id="join-submit-button">회원가입</button>
		</div>
	</form>

</section>

<script>
	// 회원가입 유효성 검사 통과 확인용
	var emailCheck = false; // 이메일 중복
	var emailCodeCheck = false; // 이메일 인증번호 일치
	//var passwordCheck = false; // 비밀번호 양식
	var passwordCorrectCheck = false; // 비밀번호 확인 일치
	var nicknameCheck = false; // 닉네임 중복

	// 이메일 인증번호 저장용
	var code = "";

	// 이메일 형식 유효성 검사
	function mailFormCheck(email) {
		var form = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
		return form.test(email);
	}

	// 이메일 중복, 형식 확인
	$("#email").on("propertychange change keyup paste input", function() {
		var userEmail = $("#email").val();
		var data = {
			userEmail : userEmail
		}

		$.ajax({
			type : "post",
			url : "${pageContext.request.contextPath}/user/emailCheck",
			data : data,
			success : function(result) {

				if (result == 'success' && mailFormCheck(userEmail)) {
					$("#email-text-true").css("display", "inline-block");
					$("#email-text-false").css("display", "none");
					emailCheck = true;

				} else {
					$("#email-text-false").css("display", "inline-block");
					$("#email-text-true").css("display", "none");
					emailCheck = false;
				}
			}
		});
	});

	// 이메일 인증번호 전송
	$("#join-email-wrapper button").click(function() {
		var email = $("#email").val();
		var checkInput = $(".emailCode-input");

		$.ajax({
			type : "GET",
			url : "sendEmailCode?email=" + email,
			success : function(data) {

				checkInput.attr("disabled", false);
				checkInput.attr("id", "emailCode-abled");
				code = data;

			}
		});
	});

	// 이메일 인증번호 확인
	$(".emailCode-input").blur(function() {
		var inputCode = $(".emailCode-input").val();

		if (inputCode == code) {
			$("#emailCode-text-true").css("display", "inline-block");
			$("#emailCode-text-false").css("display", "none");
			emailCodeCheck = true;

		} else {
			$("#emailCode-text-false").css("display", "inline-block");
			$("#emailCode-text-true").css("display", "none");
			emailCodeCheck = false;
		}
	});

	// 비밀번호 = 비밀번호 확인
	$("#password, #password-check").on(
			"propertychange change keyup paste input",
			function() {
				var pw = $("#password").val();
				var pwck = $("#password-check").val();

				if (pw == pwck) {
					$("#password-check-text-true").css("display",
							"inline-block");
					$("#password-check-text-false").css("display", "none");
					passwordCorrectCheck = true;

				} else {
					$("#password-check-text-false").css("display",
							"inline-block");
					$("#password-check-text-true").css("display", "none");
					passwordCorrectCheck = false;
				}
			});

	// 닉네임 중복 확인
	$("#nickname").on("propertychange change keyup paste input", function() {

		var userNickname = $("#nickname").val();
		var data = {
			userNickname : userNickname
		}

		$.ajax({
			type : "post",
			url : "${pageContext.request.contextPath}/user/nicknameCheck",
			data : data,
			success : function(result) {

				if (result == 'success') {
					$("#nickname-text-true").css("display", "inline-block");
					$("#nickname-text-false").css("display", "none");
					nicknameCheck = true;

				} else {
					$("#nickname-text-false").css("display", "inline-block");
					$("#nickname-text-true").css("display", "none");
					nicknameCheck = false;
				}
			}
		});
	});

	// 회원가입 제출 시 유효성 확인
	$("#join-submit-button")
			.click(
					function() {
						if (emailCheck && emailCodeCheck
								&& passwordCorrectCheck && nicknameCheck) {
							$("#join-form")
									.attr("action",
											"${pageContext.request.contextPath}/user/join/submit");
							$("#join-form").submit();
						} else {
							alert("입력 항목들을 다시 확인해주세요.");
						}
					});
</script>