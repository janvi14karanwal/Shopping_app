package com.shopping.cart.service;

import com.shopping.cart.DTO.Product;
import com.shopping.cart.model.CartItem;
import com.shopping.cart.repo.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CartServiceImpl implements CartService{

    private final ProductClient productClient;
    @Autowired
    private CartRepo cartRepo;

    public CartServiceImpl(ProductClient productClient) {
        this.productClient = productClient;
    }







    @Override
    public CartItem addItemToCart(int userId, int productId, int quantity) {
        Product product = productClient.getProductById(productId);
        CartItem cartItem=new CartItem();
           cartItem.setUserId(userId);
        cartItem.setProductId(productId);
        cartItem.setQuantity(quantity);
        cartItem.setPrice(quantity*product.getPrice());
        product.setQuantity(product.getQuantity()-quantity);
        return cartRepo.save(cartItem);
    }

    @Override
    @Transactional
    public String deleteItemToCart(int userId, int productId, int quantity) {
        Product product = productClient.getProductById(productId);
     List<CartItem> cart= cartRepo.findByUserId(userId);

        for (CartItem item : cart) {
            if(item.getProductId()==productId){
         if(item.getQuantity() <=quantity){
             cartRepo.deleteByUserIdAndProductId(userId,productId);
         }
         else
             item.setQuantity(item.getQuantity()-quantity);
     }}
     product.setQuantity(product.getQuantity()+quantity);
       return "DELETED SUCCESSFULLY";
    }

    @Override
    public String clearCart() {
        cartRepo.deleteAll();
        return "CART CLEARED";
    }

    @Override
    public List<CartItem> getItemFromCart(int userId) {
        return cartRepo.findByUserId(userId);
    }


}
