package com.sky.pro.spring2.controller;

import com.sky.pro.spring2.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    public final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItems(@RequestParam List<Integer> items) {
        return orderService.addItems(items);
    }
    @GetMapping("/get")
    public List<Integer> getItems(@RequestParam List<Integer> items) {
        return orderService.getItems();
    }



}
