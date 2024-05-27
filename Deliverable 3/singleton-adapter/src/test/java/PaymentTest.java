import org.junit.Test;

public class PaymentTest {
    @Test
    public void testPayment() {
        PaymentInterface payment = new PaymentServiceAdapter();
        payment.ProcessPayment(1, 1, 100, 0.90);

    }
}
