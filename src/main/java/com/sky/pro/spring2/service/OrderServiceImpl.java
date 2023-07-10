package com.sky.pro.spring2.service;

import com.sky.pro.spring2.model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{
    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> items) {
        return cart.add(items);
    }

    @Override
    public List<Integer> getItems() {
        return cart.get();
    }
}


