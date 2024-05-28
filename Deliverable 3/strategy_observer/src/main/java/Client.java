// Client
public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        // Pay using Credit Card
        paymentService.setStrategy(new CreditCardPayment());
        paymentService.pay(100.0);

        // Pay using PayPal
        paymentService.setStrategy(new PayPalPayment());
        paymentService.pay(200.0);

        // Pay using Bank Transfer
        paymentService.setStrategy(new BankTransferPayment());
        paymentService.pay(300.0);
    }
}