package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("*_* Factory Patern *_*");
	    Food order1=new OrderFood().processOrder("Pizza");
	    order1.prepare();
	    PaymentMethod order2=new OrderPayment().processPayment("Bitcoin");
	    order2.pay();
    }
}
