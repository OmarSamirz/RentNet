package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.*;

/**
 * 
 */
@Data
@AllArgsConstructor
public class Service {

    public Service() {
    }

    private int serviceID;

    private int serviceOwnerID;

    private String name;

    private String description;

    private String address;

    private float price;

    private float avgRating;

    private boolean wifi;

    private boolean bathroom;

    private boolean parking;


    private Clock availableTimes;

    public void setters() {
        // TODO implement here
    }

    public void getters() {
        // TODO implement here
    }

}