package com.shopping.janvi_bag.demo.service;


import com.shopping.janvi_bag.demo.model.Product;
import com.shopping.janvi_bag.demo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImpl implements ProductService{
    @Autowired
    private ProductRepo repo;
    @Override
    public Product saveProduct(Product product) {
        System.out.println(product.getProductId());
       return repo.save(product);


    }

    @Override
    public List<Product> getProduct(String name) {
      return  repo.findByNameContaining(name);


    }

    @Override
    public Optional<Product> getProductById(int productId) {
        return  repo.findById(productId);


    }

    @Override
    public Product updateQuantity(int productId, int quantity) {
        Product product=repo.findById(productId).get();
        product.setQuantity(quantity);
      return  repo.save(product);
    }



    @Override
    public List<Product> getAllProduct() {
        return repo.findAll();
    }

    @Override
    public Integer getprice(int productId) {
        Optional<Product> product=repo.findById(productId);
       return product.map(Product::getPrice).orElseThrow();

    }


}
