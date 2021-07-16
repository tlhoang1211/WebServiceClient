package com.example.examclientws.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Bean
    public ProductService productService(){
        ProductServiceService productServiceService = new ProductServiceService();
        ProductService productService = productServiceService.getProductServicePort();
        return productService;
    }
}
