package com.coffeeview.coffee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeview.coffee.dao.CoffeeDao;
import com.coffeeview.coffee.entity.CoffeeDetailView;
import com.coffeeview.coffee.entity.CoffeeListView;
import com.coffeeview.coffee.entity.Criteria;

@Service
public class CoffeeServiceImpl implements CoffeeService {

    @Autowired
    private CoffeeDao coffeeDao;

    @Override
    public List<CoffeeListView> getBestCoffee() {
        return coffeeDao.getBestCoffee();
    }

    @Override
    public List<CoffeeListView> getNewCoffee() {
        return coffeeDao.getNewCoffee();
    }

    @Override
    public List<CoffeeListView> getAllCoffee(Criteria cri) {
        return coffeeDao.getAllCoffee(cri);
    }

    @Override
    public int getTotalCoffee() {
        return coffeeDao.getTotalCoffee();
    }

    @Override
    public CoffeeDetailView getOneCoffee(int id) {
        return coffeeDao.getOneCoffee(id);
    }

}
