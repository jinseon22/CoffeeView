package com.coffeeview.review.service;

import java.util.List;

import com.coffeeview.review.entity.Review;
import com.coffeeview.review.entity.ReviewView;

public interface ReviewService {
    
    List<ReviewView> getCoffeeReview(int coffee_id); // 커피별 리뷰
    
    int getReviewCount(int coffee_id); // 커피별 리뷰 개수
    
    Double getReviewScore(int coffee_id); // 커피별 리뷰 평점
    
    void writeReview(Review review); // 리뷰 작성

}