package com.coffeeview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coffeeview.coffee.service.CoffeeService;

@Controller
public class HomeController {
    
    @Autowired
    private CoffeeService coffeeService;
    
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("bestCoffee", coffeeService.getBestCoffee());
        model.addAttribute("newCoffee", coffeeService.getNewCoffee());
        return "home.index";
    }
}
