package payment;

public class EWalletPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toan bang vi dien tu: " + amount);
    }
}
