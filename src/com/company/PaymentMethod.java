package com.company;

interface PaymentMethod {
    void pay();
}

class Paypal implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with Paypal account");
    }

}

class CreditCard implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with Credit card account");
    }
}

class BitCoin implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Paying with your bitcoin wallet");
    }
}

class PaymentMethodFactory{
    public PaymentMethod getPaymentMethod(String paymentMethodName){
        if(paymentMethodName==null){
            return null;
        }
        else if(paymentMethodName=="Paypal"){
            return new Paypal();
        }
        else if(paymentMethodName=="Bitcoin"){
            return new BitCoin();
        }
        else if(paymentMethodName=="Credit Card"){
            return new CreditCard();
        }
        return null;
    }
}

class OrderPayment{
    public PaymentMethod processPayment(String paymentMethodName){
        return new PaymentMethodFactory().getPaymentMethod(paymentMethodName);
    }
}