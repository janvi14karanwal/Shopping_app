package com.shopping.janvi_bag.demo.service;

import com.shopping.janvi_bag.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public Product saveProduct(Product product);
public List<Product> getProduct(String name);
    public List<Product> getAllProduct();
    public Integer getprice(int productId);
    public Optional<Product> getProductById(int productId);
    public Product updateQuantity(int productId, int quantity);

}
