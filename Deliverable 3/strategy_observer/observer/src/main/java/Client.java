public class Client {
    public static void main(String[] args) {
        RatingPublisher publisher = new RatingPublisher();

        RatingObserver emailNotifier = new EmailNotifier();
        RatingObserver smsNotifier = new SMSNotifier();

        publisher.subscribe(emailNotifier);
        publisher.subscribe(smsNotifier);

        // New rating received
        publisher.newRating("5 stars");
    }
}