package OOAD.HotelBookingSystem.exceptions;

public class PaymentFailureException extends Exception {
    public PaymentFailureException() {
        super("Payment failed");
    }
}
