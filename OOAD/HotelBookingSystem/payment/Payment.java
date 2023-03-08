package OOAD.HotelBookingSystem.payment;

import java.util.Date;

import OOAD.HotelBookingSystem.exceptions.PaymentFailureException;

public abstract class Payment {
    protected Date date;
    protected double amount;
    protected PaymentStatus paymentStatus;

    public Payment(Date date, double amount, PaymentStatus paymentStatus) {
        this.date = date;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public abstract void pay() throws PaymentFailureException;
}
