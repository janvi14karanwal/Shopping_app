package com.shopping.cart.repo;

import com.shopping.cart.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepo extends JpaRepository<CartItem,Integer> {
List<CartItem> findByUserId(int userId);
void deleteByUserIdAndProductId(int userId,int productId);
}
