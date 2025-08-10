package com.shopping.janvi_bag.demo.controller;


import com.shopping.janvi_bag.demo.model.Product;
import com.shopping.janvi_bag.demo.service.ProductImpl;
import com.shopping.janvi_bag.demo.service.ProductService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")

public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {

        System.out.println("Received: " + product);


        Product savedProduct = productService.saveProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);


    }

    @GetMapping("/getProduct_from_name")
    public List<Product> getProductFromName(@RequestParam String name) {
        return productService.getProduct(name);
    }

    @GetMapping("/find_all_product")
    public List<Product> findAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/price_of_the_product/{productId}")
    public Integer getPrice(@PathVariable int productId) {
        return productService.getprice(productId);
    }

    @GetMapping("/get_prouduct_By_Id/{productId}")
    public Optional<Product> getProductById(@PathVariable int productId) {
        return productService.getProductById(productId);
    }

}
