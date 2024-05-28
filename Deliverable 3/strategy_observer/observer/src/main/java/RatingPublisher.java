import java.util.ArrayList;
import java.util.List;

public class RatingPublisher {
    private List<RatingObserver> observers = new ArrayList<>();

    public void subscribe(RatingObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(RatingObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (RatingObserver observer : observers) {
            observer.update(message);
        }
    }

    public void newRating(String rating) {
        // Business logic to handle new rating
        notifyObservers("New rating received: " + rating);
    }
}