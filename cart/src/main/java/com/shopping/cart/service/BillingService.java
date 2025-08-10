//package com.shopping.cart.service;
//
//import com.shopping.cart.model.CartItem;
//import com.shopping.cart.model.FinalCart;
//import com.shopping.cart.repo.BillingRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class BillingService implements BillService{
//    @Autowired
//private BillingRepo billingRepo;
//
//    @Override
//    public FinalCart getFinalcartProduct(int billId) {
//        return billingRepo.findById(billId).get();
//    }
//
//    @Override
//    public Integer totalPrice(List<CartItem> cartItemList) {
//        int finalPrice=0;
//        for(CartItem item:cartItemList){
//            finalPrice += item.getPrice()*item.getQuantity();
//        }
//        return finalPrice;
//    }
//
//    @Override
//    public FinalCart createBill(FinalCart finalCart) {
//FinalCart newFinalCart=new FinalCart();
//newFinalCart.setCart(finalCart.getCart());
//newFinalCart.setFinalPrice(finalCart.getFinalPrice());
//
//
//       return  billingRepo.save(finalCart);
//    }
//
//    @Override
//    public String deleteFinalCart(int billId) {
//        billingRepo.deleteById(billId);
//        return "DELETED SUCCESSFULLY";
//    }
//}
