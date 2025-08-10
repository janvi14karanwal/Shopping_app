//package com.shopping.cart.model;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.List;
//
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@Builder
//public class FinalCart {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int billId;
//    private int userId;
//    @ElementCollection
//private List<CartItem> cart;
//    private int finalPrice;
//
//    public List<CartItem> getCart() {
//        return cart;
//    }
//
//    public void setCart(List<CartItem> cart) {
//        this.cart = cart;
//    }
//
//    public int getFinalPrice() {
//        return finalPrice;
//    }
//
//    public void setFinalPrice(int finalPrice) {
//        this.finalPrice = finalPrice;
//    }
//
//    public int getBillId() {
//        return billId;
//    }
//
//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }
//
//    public void setBillId(int billId) {
//        this.billId = billId;
//
//
//    }
//}
