package payment;

public class PayPalPayment implements PaymentStrategy, Refundable {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan bang PayPal: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Hoan tien PayPal: " + amount);
    }
}
