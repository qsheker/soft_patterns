package Bridge.ConcreteProccessor;

import Bridge.interfaces.PaymentProcessor;

public class StripeProcessor implements PaymentProcessor {
    @Override
    public void doPayment(double amount) {
        System.out.println("Paying with Stripe...");
        System.out.println("Paid!");
        System.out.println("Was send "+ amount +" moneys");
    }
}
