package com.coffeeview.user.controller;

import java.util.Random;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coffeeview.user.entity.User;
import com.coffeeview.user.service.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private JavaMailSender mailSender;

    // 로그인
    @GetMapping("login")
    public String login() {
        return "user.login";
    }

    // 로그인 제출
    @PostMapping("login/submit")
    @ResponseBody
    public String loginSubmit(String inputEmail, String inputPassword,
            HttpSession session) {
        User temp = new User();
        temp.setEmail(inputEmail);
        temp.setPassword(inputPassword);
        User loginUser = userService.login(temp);

        if (loginUser != null) { // 로그인 성공
            session.setAttribute("loginUser", loginUser);
            return "success";

        } else { // 로그인 실패
            return "fail";
        }
    }

    // 로그아웃
    @PostMapping("logout")
    @ResponseBody
    public void logout(HttpSession session) {
        session.invalidate();
    }

    // 회원가입
    @GetMapping("join")
    public String join() {
        return "user.join";
    }

    // 회원가입 이메일 중복 검사
    @PostMapping("emailCheck")
    @ResponseBody
    public String userEmailCheck(String userEmail) {
        int result = userService.emailCheck(userEmail);
        if (result != 0) {
            return "fail"; // 이메일 중복됨
        } else {
            return "success"; // 이메일 사용 가능
        }
    }

    // 회원가입 이메일 인증번호 검사
    @GetMapping("sendEmailCode")
    @ResponseBody
    public String sendEmailCode(String email) {
        logger.info("인증할 이메일: " + email);

        // 인증번호 생성
        Random random = new Random();
        int code = random.nextInt(888888) + 111111;
        logger.info("인증번호: " + code);

        // 인증번호 메일로 전송
        String setFrom = "01coffeeview@google.com";
        String toMail = email;
        String title = "커피뷰 회원가입 인증번호입니다.";
        String content = "인증번호는 " + code + "입니다.<br>인증번호를 확인란에 작성 후 가입을 진행해 주세요.";

        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true, "utf-8");
            helper.setFrom(setFrom);
            helper.setTo(toMail);
            helper.setSubject(title);
            helper.setText(content, true);
            mailSender.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }

        String codeString = Integer.toString(code);

        // 뷰로 인증번호 반환
        return codeString;

    }
    
    // 회원가입 닉네임 중복 검사
    @PostMapping("nicknameCheck")
    @ResponseBody
    public String userNicknameCheck(String userNickname) {
        int result = userService.nicknameCheck(userNickname);
        if (result != 0) {
            return "fail"; // 닉네임 중복됨
        } else {
            return "success"; // 닉네임 사용 가능
        }
    }

    // 회원가입 제출
    @PostMapping("join/submit")
    public String joinSubmit(User user, HttpSession session) {
        userService.join(user);
        session.setAttribute("loginUser", user); // 회원가입 후 로그인
        return "user.joinSubmit";
    }
}
