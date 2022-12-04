package com.example.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author "Tojaliyev Asliddin"
 * @since 04/12/22 02:49 (Sunday)
 * LearningMicroservices/IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {
    private String skuCode;
    private boolean isInStock;
}
