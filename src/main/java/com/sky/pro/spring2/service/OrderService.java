package com.sky.pro.spring2.service;

import java.util.List;

public interface OrderService {
    List<Integer> addItems(List<Integer> items);
    List<Integer> getItems();
}
