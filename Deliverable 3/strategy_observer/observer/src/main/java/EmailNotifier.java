public class EmailNotifier implements RatingObserver {
    @Override
    public void update(String message) {
        System.out.println("Email Notification: " + message);
    }
}