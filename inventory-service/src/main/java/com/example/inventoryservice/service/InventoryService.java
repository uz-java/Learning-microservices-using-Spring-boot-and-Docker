package com.example.inventoryservice.service;

import com.example.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author "Tojaliyev Asliddin"
 * @since 04/12/22 02:47 (Sunday)
 * LearningMicroservices/IntelliJ IDEA
 */
@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode){
       return inventoryRepository.findBySkuCode(skuCode).isPresent();
    }
}
