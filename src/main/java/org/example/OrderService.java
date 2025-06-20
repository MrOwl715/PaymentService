package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    private final PaymentService payment;

    @Autowired
    public OrderService(PaymentService payment){
        this.payment = payment;
    }

    public void processOder(){
        System.out.println("Xử lý đơn hàng...");
        payment.pay();
    }
}
