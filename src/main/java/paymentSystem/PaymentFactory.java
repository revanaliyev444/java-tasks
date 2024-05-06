package paymentSystem;

public class PaymentFactory {
    public Payment paymentWay(String type) {
        return switch (type) {
            case "1" -> new Card();
            case "2" -> new Pin();
            default -> throw new IllegalArgumentException("Invalid Operation");
        };
    }
}