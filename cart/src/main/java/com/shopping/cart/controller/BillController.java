//package com.shopping.cart.controller;
//
//import com.shopping.cart.model.CartItem;
//import com.shopping.cart.model.FinalCart;
//import com.shopping.cart.service.BillService;
//import com.shopping.cart.service.CartService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class BillController {
//
//    @Autowired
//    private BillService billService;
//
//    @GetMapping("getBillFromBillId")
//    public FinalCart getFinalcartProduct(int billId){
//        return billService.getFinalcartProduct(billId);
//    }
//    @GetMapping("Final_price")
//    public Integer totalPrice(List<CartItem> cartItemList){
//        return billService.totalPrice(cartItemList);
//    }
//    @PostMapping("create_bill_item")
//    public FinalCart createBill(FinalCart finalCart){
//        return billService.createBill(finalCart);
//    }
//    @DeleteMapping("delete_bill_item")
//    public String deleteFinalCart(int billId){
//        return billService.deleteFinalCart(billId);
//    }
//}
