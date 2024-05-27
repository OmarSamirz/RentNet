public class PaymentServiceAdapter implements PaymentInterface{
    private final PaymentService service;

    public PaymentServiceAdapter() {
        service = new PaymentService();
    }
    @Override
    public boolean ProcessPayment(int renterID, int serviceOwnerID, double cost, double profitPercentage) {
        double fees = cost * profitPercentage;

        if (service.makePayment("1343757557")) {
            System.out.println("Payment confirmed!");

            return true;
        }
        else {
            System.out.println("Payment Error");
            return false;
        }
    }
}
