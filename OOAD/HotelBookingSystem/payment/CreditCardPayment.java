package OOAD.HotelBookingSystem.payment;

import java.util.Date;

import OOAD.HotelBookingSystem.exceptions.PaymentFailureException;

public class CreditCardPayment extends Payment {
    private String nameOnCard;
    private long cardNumber;
    private long zipCode;

    public CreditCardPayment(String nameOnCard, long cardNumber, long zipCode, double amount) {
        super(new Date(), amount, PaymentStatus.UNPAID);
        this.nameOnCard = nameOnCard;
        this.cardNumber = cardNumber;
        this.zipCode = zipCode;
    }

    @Override
    public void pay() throws PaymentFailureException {
        if (String.valueOf(cardNumber).length() < 10) {
            paymentStatus = PaymentStatus.SUCCESSFUL;
        }
        paymentStatus = PaymentStatus.FAILED;
        throw new PaymentFailureException();
    }
}
