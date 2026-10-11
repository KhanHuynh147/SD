package payment;

public class CreditCardPayment implements PaymentStrategy, Refundable {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan bang the tin dung: " + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Hoan tien the tin dung: " + amount);
    }
}
