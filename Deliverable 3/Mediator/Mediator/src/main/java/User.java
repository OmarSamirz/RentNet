
import java.util.*;

/**
 * 
 */
public class User {

    /**
     * Default constructor
     */
    public User() {
    }

    /**
     * 
     */
    private int userID;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String phoneNumber;

    /**
     * 
     */
    private float balance;

    /**
     * 
     */
    private int creditCards;

    /**
     * 
     */
    private float avgRating;

    /**
     * 
     */
    private Mediator mediator;

    /**
     * 
     */
    public void setters() {
        // TODO implement here
    }

    /**
     * 
     */
    public void getters() {
        // TODO implement here
    }

    /**
     * @param name 
     * @param email 
     * @param password 
     * @param phoneNo
     */
    public void register(String name, String email, String password, String phoneNo) {
        // TODO implement here
    }

    /**
     * @param name 
     * @param password
     */
    public void logIn(String name, String password) {
        // TODO implement here
    }

    /**
     * 
     */
    public void logOut() {
        // TODO implement here
    }

    /**
     * @param rating 
     * @param revieweeID
     */
    public void provideRatings(float rating, int revieweeID) {
        // TODO implement here
    }

    /**
     * @param revieweeID
     */
    public void navigateReviews(int revieweeID) {
        // TODO implement here
    }

    /**
     * 
     */
    public void viewRatings() {
        // TODO implement here
    }

}
