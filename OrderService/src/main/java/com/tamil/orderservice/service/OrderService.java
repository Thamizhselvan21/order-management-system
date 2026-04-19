package com.tamil.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamil.orderservice.entity.Order;
import com.tamil.orderservice.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public List<Order> getAllOrders() 
    {
        return repo.findAll();
    }

    public Order saveOrder(Order order) 
    {
        return repo.save(order);
    }
    public Order getOrderById(Long id) 
    {
        return repo.findById(id).orElse(null);
    }
    public void deleteOrder(Long id) 
    {
        repo.deleteById(id);
    }
}