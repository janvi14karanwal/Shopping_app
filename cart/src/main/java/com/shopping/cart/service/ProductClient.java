package com.shopping.cart.service;

import com.shopping.cart.DTO.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ProductClient {

        private final WebClient webClient;

        public ProductClient(WebClient.Builder builder) {
            this.webClient = builder.baseUrl("http://localhost:8080/products").build();
        }

        public Product getProductById(int productId) {
            return webClient.get()
                    .uri("/get_prouduct_By_Id/{productId}", productId)
                    .retrieve()
                    .bodyToMono(Product.class)
                    .block(); // Blocking for simplicity
        }
    }


