package org.example;

import java.util.*;

/**
 * 
 */
public class ViewReservation implements Reservation {
    public ViewReservation() {
    }
    public void display(int userid) {
        System.out.printf("UserID: %d reservations",userid);
    }

}