
import java.util.*;

/**
 * 
 */
public class RatingHandler implements Mediator {

    /**
     * Default constructor
     */
    public RatingHandler() {
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
    private Rate rate;

    /**
     * 
     */
    @Override
    public void execute() {
        // TODO implement here
    }

    /**
     * @param rating 
     * @param reviewerID 
     * @param revieweeID
     */
    public void provideRatings(int rating, int reviewerID, int revieweeID) {
        // TODO implement here
    }

    /**
     * @param revieweeID
     */
    public void navigateReviews(int revieweeID) {
        // TODO implement here
    }

    /**
     * @param reviewerID
     */
    public void viewRatings(int reviewerID) {
        // TODO implement here
    }

}
