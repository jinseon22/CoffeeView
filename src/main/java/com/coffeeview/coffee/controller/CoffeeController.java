package com.coffeeview.coffee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coffeeview.coffee.entity.Criteria;
import com.coffeeview.coffee.entity.PageMaker;
import com.coffeeview.coffee.service.CoffeeService;

@Controller
@RequestMapping("/coffee/")
public class CoffeeController {

    @Autowired
    private CoffeeService coffeeService;

    @GetMapping("list")
    public String list(Model model, Criteria cri) {

        model.addAttribute("allCoffee", coffeeService.getAllCoffee(cri));

        // 페이징 처리
        int total = coffeeService.getTotalCoffee();
        PageMaker pageMaker = new PageMaker(cri, total);
        model.addAttribute("pageMaker", pageMaker);

        return "coffee.list";
    }

    @GetMapping("detail")
    public String detail(Model model, int id) {
        model.addAttribute("coffee", coffeeService.getOneCoffee(id));
        return "coffee.detail";
    }

}
