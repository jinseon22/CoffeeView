package com.coffeeview.review.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffeeview.review.entity.Review;
import com.coffeeview.review.entity.ReviewView;

@Repository
public class MybatisReviewDao implements ReviewDao {

    private ReviewDao mapper;

    @Autowired
    public MybatisReviewDao(SqlSession sqlSession) {
        mapper = sqlSession.getMapper(ReviewDao.class);
    }

    @Override
    public List<ReviewView> getCoffeeReview(int coffee_id) {
        return mapper.getCoffeeReview(coffee_id);
    }

    @Override
    public int getReviewCount(int coffee_id) {
        return mapper.getReviewCount(coffee_id);
    }

    @Override
    public Double getReviewScore(int coffee_id) {
        return mapper.getReviewScore(coffee_id);
    }

    @Override
    public void writeReview(Review review) {
        mapper.writeReview(review);
    }

}
