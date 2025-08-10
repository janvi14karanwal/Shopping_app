package com.shopping.cart.controller;

import com.shopping.cart.model.CartItem;
import com.shopping.cart.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartItem")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/addItemToCart")
    public CartItem addItemToCart(@RequestParam int userId ,@RequestParam int productId,@RequestParam int quantity){
      return   cartService.addItemToCart(userId,productId,quantity);

    }
    @GetMapping("/deleteItemToCart")
    public String deleteItemFromCart(@RequestParam int userId, @RequestParam int productId, @RequestParam int quantity){
        return cartService.deleteItemToCart(userId,productId,quantity);
    }

@GetMapping("/clearCart")
    public String clearCart(){
        return cartService.clearCart();
}
@GetMapping("/getcartById")
public List<CartItem> getCartById(@RequestParam int userId){
        return cartService.getItemFromCart(userId);
}

}
