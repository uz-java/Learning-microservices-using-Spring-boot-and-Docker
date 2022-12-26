package com.example.orderservice.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author "Tojaliyev Asliddin"
 * @since 27/12/22 02:53 (Tuesday)
 * LearningMicroservices/IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {
    private String orderNumber;
}
