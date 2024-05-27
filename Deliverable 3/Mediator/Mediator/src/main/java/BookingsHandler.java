
import java.util.*;

/**
 * 
 */
public class BookingsHandler implements Mediator {

    /**
     * Default constructor
     */
    public BookingsHandler() {
    }

    /**
     * 
     */
    private Service service;

    /**
     * 
     */
    private User user;

    /**
     * 
     */
    private Reservation reservation;

    /**
     * 
     */
    public void execute() {
        // TODO implement here
    }

    /**
     * @param serviceID 
     * @param renterID
     */
    public boolean acceptRentingRequest(int serviceID, int renterID) {
        if (serviceID < 0 || renterID < 0) {
            return false;
        }

        // Change the service state in database

        return true;
    }

    /**
     * @param serviceID 
     * @param renterID
     */
    public void cancelRentingRequest(int serviceID, int renterID) {
        // TODO implement here
    }

    /**
     * 
     */
    public void viewReservations() {
        // TODO implement here
    }

    /**
     * @param serviceID 
     * @param renterID
     */
    public void bookService(int serviceID, int renterID) {
        // TODO implement here
    }

    /**
     * @param serviceID 
     * @param renterID
     */
    public void cancelBookedService(int serviceID, int renterID) {
        // TODO implement here
    }

    /**
     * 
     */
    public void searchServices() {
        // TODO implement here
    }

}
