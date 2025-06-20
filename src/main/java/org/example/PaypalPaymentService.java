package org.example;

import org.springframework.stereotype.Component;

@Component
public class PaypalPaymentService implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Thanh toán qua Paypal hihi");
    }
}
