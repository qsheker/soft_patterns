package Bridge.abstraction;

import Bridge.interfaces.PaymentProcessor;

public abstract class Payment {
    private PaymentProcessor paymentProcessor;

    public Payment(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void doPayment(double amount){
        paymentProcessor.doPayment(amount);
    }
}
