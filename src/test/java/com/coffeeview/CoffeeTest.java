package com.coffeeview;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.coffeeview.coffee.entity.Coffee;
import com.coffeeview.coffee.entity.CoffeeDetailView;
import com.coffeeview.coffee.entity.Criteria;
import com.coffeeview.coffee.service.CoffeeService;
import com.coffeeview.user.controller.UserController;

@SpringBootTest
public class CoffeeTest {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    private Coffee coffee;

    @Autowired
    private CoffeeService service;

    @Test
    void coffeeListPaging() {
        Criteria cri = new Criteria();
        List list = service.getAllCoffee(cri);
        list.forEach(coffee -> logger.info("" + coffee));
    }

    @Test
    void getOneCoffeeTest() {
        CoffeeDetailView coffeeDetailView = service.getOneCoffee(5);
        logger.info("" + coffeeDetailView);

    }
}
