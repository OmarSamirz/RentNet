import org.junit.Test;

public class BookingHandlerTest {
    @Test
    public void acceptRentingRequestTest() {
        BookingsHandler bookingHandler = new BookingsHandler();
        System.out.println(bookingHandler.acceptRentingRequest(1, 1));
        System.out.println(bookingHandler.acceptRentingRequest(1, -1));
    }

}
