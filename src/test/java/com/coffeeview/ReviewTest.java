package com.coffeeview;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coffeeview.review.entity.ReviewView;
import com.coffeeview.review.service.ReviewService;
import com.coffeeview.user.controller.UserController;

@SpringBootTest
public class ReviewTest {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private ReviewView view;

    @Autowired
    private ReviewService service;

    @Test
    void getCoffeeReview() {
        List<ReviewView> list = service.getCoffeeReview(1);
        list.forEach(view -> logger.info("" + view));

    }

    @Test
    void getReviewScore() {
        double score = service.getReviewScore(2);
        logger.info("" + score);
    }
}
