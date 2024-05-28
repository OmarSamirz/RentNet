public class SMSNotifier implements RatingObserver {
    @Override
    public void update(String message) {
        System.out.println("SMS Notification: " + message);
    }
}