package com.shopping.cart.service;

import com.shopping.cart.DTO.Product;
import com.shopping.cart.model.CartItem;

import java.util.List;

public interface CartService {
    public CartItem addItemToCart(int userId,  int productId , int quantity);
    public String deleteItemToCart(int userId, int productId , int quantity);
    public String clearCart();
public List<CartItem> getItemFromCart(int userId);

}
