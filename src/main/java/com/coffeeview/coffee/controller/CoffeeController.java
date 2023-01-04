package com.coffeeview.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coffeeview.coffee.entity.Criteria;
import com.coffeeview.coffee.entity.PageMaker;
import com.coffeeview.coffee.service.CoffeeService;
import com.coffeeview.review.service.ReviewService;

@Controller
@RequestMapping("/coffee/")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @Autowired
    private ReviewService reviewService;

    // 커피 순위(전체 목록)
    @GetMapping("list")
    public String list(Model model, Criteria cri) {

        model.addAttribute("allCoffee", coffeeService.getAllCoffee(cri));

        // 페이징 처리
        int total = coffeeService.getTotalCoffee();
        PageMaker pageMaker = new PageMaker(cri, total);
        model.addAttribute("pageMaker", pageMaker);

        return "coffee.list";
    }

    // 커피 상세 페이지
    @GetMapping("detail")
    public String detail(Model model, int id) {

        // 후기 없으면 평점 null → 0으로 표시, 후기 있으면 소수점 첫째까지 표시
        Double score_avg = reviewService.getReviewScore(id);
        score_avg = (score_avg == null) ? 0 : Math.round(score_avg * 10) / 10.0;

        model.addAttribute("coffee", coffeeService.getOneCoffee(id));
        model.addAttribute("score_avg", score_avg);
        model.addAttribute("review_count", reviewService.getReviewCount(id));
        model.addAttribute("coffeeReview", reviewService.getCoffeeReview(id));
        
        return "coffee.detail";
    }
    
    // 커피 후기 작성
    @GetMapping("review-write")
    public String review_write(){
        return "coffee.review-write";
    }

}
