package com.example.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 03/12/22 04:42 (Saturday)
 * LearningMicroservices/IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtoList;

}
