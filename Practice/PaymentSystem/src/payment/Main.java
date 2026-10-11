package payment;

public class Main {
    public static void main(String[] args) {
        // Thanh toan bang the tin dung
        PaymentService paymentService = new PaymentService(new CreditCardPayment());
        paymentService.processPayment(500000);

        // Chuyen sang vi dien tu
        paymentService.setStrategy(new EWalletPayment());
        paymentService.processPayment(200000);

        // Chuyen sang chuyen khoan ngan hang
        paymentService.setStrategy(new BankTransferPayment());
        paymentService.processPayment(1200000);

        // Minh hoa ISP: Hoan tien chi voi phuong thuc ho tro Refundable
        PaymentStrategy strategy = new PayPalPayment();
        strategy.pay(350000);
        if (strategy instanceof Refundable refundable) {
            refundable.refund(100000);
        }
    }
}
