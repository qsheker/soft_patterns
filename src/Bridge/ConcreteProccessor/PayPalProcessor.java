package Bridge.ConcreteProccessor;

import Bridge.interfaces.PaymentProcessor;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void doPayment(double amount) {
        System.out.println("Paying with PayPal...");
        System.out.println("Paid!");
        System.out.println("Was send "+ amount +" moneys");
    }
}
