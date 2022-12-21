package com.coffeeview.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeview.user.dao.UserDao;
import com.coffeeview.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int join(User user) {
        return userDao.join(user);
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public int emailCheck(String userEmail) {
        return userDao.emailCheck(userEmail);
    }

    @Override
    public int nicknameCheck(String userNickname) {
        return userDao.nicknameCheck(userNickname);
    }
}
