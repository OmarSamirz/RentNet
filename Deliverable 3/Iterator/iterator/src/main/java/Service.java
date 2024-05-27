import java.time.LocalDateTime;


/**
 *
 */
public class Service {

    /**
     * Default constructor
     */
    public Service(int id) {
        serviceID = id;

    }

    /**
     *
     */
    private int serviceID;

    /**
     *
     */
    private int serviceOwnerID;

    /**
     *
     */
    private String category;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String description;

    /**
     *
     */
    private String address;

    /**
     *
     */
    private float price;

    /**
     *
     */
    private float avgRating;

    /**
     *
     */
    private boolean wifi;

    /**
     *
     */
    private boolean bathroom;

    /**
     *
     */
    private boolean parking;

    /**
     *
     */
    private LocalDateTime availableTimes;

    /**
     *
     */
    public void setters() {
        // TODO implement here
    }

    public int getServiceID() {
        return serviceID;
    }
    /**
     *
     */
    public void getters() {
        // TODO implement here
    }

}
