package com.coffeeview.user.dao;

import com.coffeeview.user.entity.User;

public interface UserDao {

    public int join(User user); // 회원가입
    
    public User login(User user); // 로그인
    
    public int emailCheck(String userEmail); // 회원가입 이메일 중복 검사

    public int nicknameCheck(String userNickname); // 회원가입 닉네임 중복 검사

}
