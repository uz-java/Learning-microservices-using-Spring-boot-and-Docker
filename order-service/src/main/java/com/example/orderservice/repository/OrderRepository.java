package com.example.orderservice.repository;

import com.example.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author "Tojaliyev Asliddin"
 * @since 03/12/22 04:39 (Saturday)
 * LearningMicroservices/IntelliJ IDEA
 */
public interface OrderRepository extends JpaRepository<Order,Long> {
}
