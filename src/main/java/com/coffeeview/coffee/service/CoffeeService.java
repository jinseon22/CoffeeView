package com.coffeeview.coffee.service;

import java.util.List;

import com.coffeeview.coffee.entity.CoffeeDetailView;
import com.coffeeview.coffee.entity.CoffeeListView;
import com.coffeeview.coffee.entity.Criteria;

public interface CoffeeService {

    List<CoffeeListView> getBestCoffee(); // index 최고의 커피

    List<CoffeeListView> getNewCoffee(); // index 새로운 커피
    
    List<CoffeeListView> getAllCoffee(Criteria cri); // 순위 - 전체 커피
    
    int getTotalCoffee(); // 페이징에 필요한 총 커피 수
    
    CoffeeDetailView getOneCoffee(int id); // 커피 상세 페이지

}
