package com.example.demo.dto;


import java.math.BigDecimal;

public record OrderRequest(Long id, String skuCode, BigDecimal price, Integer quantity) {
}
