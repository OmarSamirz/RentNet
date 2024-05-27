public interface PaymentInterface {

    public boolean ProcessPayment(int renterID, int serviceOwnerID, double cost, double profitPercentage);
}
