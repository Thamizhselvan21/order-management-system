package com.tamil.orderservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tamil.orderservice.entity.*;
public interface OrderRepository extends JpaRepository<Order, Long> {
}
