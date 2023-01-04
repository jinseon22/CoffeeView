package com.coffeeview.review.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeview.review.dao.ReviewDao;
import com.coffeeview.review.entity.ReviewView;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    private ReviewDao reviewDao;
    
    @Override
    public List<ReviewView> getCoffeeReview(int coffee_id) {
        return reviewDao.getCoffeeReview(coffee_id);
    }

    @Override
    public int getReviewCount(int coffee_id) {
        return reviewDao.getReviewCount(coffee_id);
    }

    @Override
    public Double getReviewScore(int coffee_id) {
        return reviewDao.getReviewScore(coffee_id);
    }

}
