package com.coffeeview.user.service;

import com.coffeeview.user.entity.User;

public interface UserService {

    int join(User user); // 회원가입

    User login(User user); // 로그인

    int emailCheck(String userEmail); // 회원가입 이메일 중복 검사
    
    int nicknameCheck(String userNickname); // 회원가입 닉네임 중복 검사
}