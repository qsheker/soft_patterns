package Bridge.abstraction.concretePayments;

import Bridge.abstraction.Payment;
import Bridge.interfaces.PaymentProcessor;

public class OfflinePayment extends Payment {
    private PaymentProcessor paymentProcessor;

    public OfflinePayment(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    public void doPayment(double amount) {
        super.doPayment(amount);
    }
}
