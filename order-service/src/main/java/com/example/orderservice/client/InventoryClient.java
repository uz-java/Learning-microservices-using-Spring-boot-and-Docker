package com.example.orderservice.client;

import com.example.orderservice.dto.InventoryResponse;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author "Tojaliyev Asliddin"
 * @since 16/12/22 22:39 (Friday)
 * LearningMicroservices/IntelliJ IDEA
 */
@FeignClient(name = "inventory-service")
@Retry(name = "inventory")
public interface InventoryClient {
    @GetMapping("/api/inventory")
    List<InventoryResponse> checkStock(@RequestParam List<String> skuCode);

}
