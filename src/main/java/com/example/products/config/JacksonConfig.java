package com.example.products.config;

import com.example.products.model.Product;
import com.example.products.serializers.ProductSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {
    @Autowired
    private ObjectMapper objectMapper;

    @PostConstruct
    public void setUp() {
        objectMapper.addMixIn(Product.class, ProductSerializer.class);
    }
}
