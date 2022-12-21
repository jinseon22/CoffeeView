package com.coffeeview.coffee.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coffeeview.coffee.entity.CoffeeDetailView;
import com.coffeeview.coffee.entity.CoffeeListView;
import com.coffeeview.coffee.entity.Criteria;

@Repository
public class MybatisCoffeeDao implements CoffeeDao {

    private CoffeeDao mapper;

    @Autowired
    public MybatisCoffeeDao(SqlSession sqlSession) {
        mapper = sqlSession.getMapper(CoffeeDao.class);
    }

    @Override
    public List<CoffeeListView> getBestCoffee() {
        return mapper.getBestCoffee();
    }

    @Override
    public List<CoffeeListView> getNewCoffee() {
        return mapper.getNewCoffee();
    }

    @Override
    public List<CoffeeListView> getAllCoffee(Criteria cri) {
        return mapper.getAllCoffee(cri);
    }

    @Override
    public int getTotalCoffee() {
        return mapper.getTotalCoffee();
    }

    @Override
    public CoffeeDetailView getOneCoffee(int id) {
        return mapper.getOneCoffee(id);
    }

}
