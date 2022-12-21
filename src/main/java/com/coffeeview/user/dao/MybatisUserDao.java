package com.coffeeview.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffeeview.user.entity.User;

@Repository
public class MybatisUserDao implements UserDao{
    
    private UserDao mapper;
    
    @Autowired
    public MybatisUserDao(SqlSession sqlSession) {
        mapper = sqlSession.getMapper(UserDao.class);
    }

    @Override
    public int join(User user) {
        return mapper.join(user);
    }

    @Override
    public User login(User user) {
        return mapper.login(user);
    }

    @Override
    public int emailCheck(String userEmail) {
        return mapper.emailCheck(userEmail);
    }

    @Override
    public int nicknameCheck(String userNickname) {
        return mapper.nicknameCheck(userNickname);
    }

}
