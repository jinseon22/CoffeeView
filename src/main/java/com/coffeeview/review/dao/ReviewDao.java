package com.coffeeview.review.dao;

import java.util.List;

import com.coffeeview.review.entity.ReviewView;

public interface ReviewDao {

    public List<ReviewView> getCoffeeReview(int coffee_id); // 커피별 리뷰
    
    public int getReviewCount(int coffee_id); // 커피별 리뷰 개수
    
    public Double getReviewScore(int coffee_id); // 커피별 리뷰 평점

}
