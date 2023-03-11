package com.company;

public class Main {

    public static void main(String[] args) {
        //Two examples of how to implement the factory pattern
        //Abstract factory will be implemented in another repository

        System.out.println("*_* Factory Patern *_*");
        Food order1 = new FoodFactory().getFood("Pizza");
        order1.prepare();
        PaymentMethod order2 = new PaymentMethodFactory().getPaymentMethod("Bitcoin");
        order2.pay();
    }
}
