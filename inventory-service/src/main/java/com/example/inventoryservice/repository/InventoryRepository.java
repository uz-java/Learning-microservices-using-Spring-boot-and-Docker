package com.example.inventoryservice.repository;

import com.example.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author "Tojaliyev Asliddin"
 * @since 04/12/22 02:46 (Sunday)
 * LearningMicroservices/IntelliJ IDEA
 */
public interface InventoryRepository extends JpaRepository<Inventory,Long> {
   Optional<Inventory> findBySkuCode(String skuCode);
   List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
