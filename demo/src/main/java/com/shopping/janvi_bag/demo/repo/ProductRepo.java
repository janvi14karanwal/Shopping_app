package com.shopping.janvi_bag.demo.repo;

import com.shopping.janvi_bag.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    Product findByName(String name) ;
    List<Product> findByNameContaining(String name);


}
