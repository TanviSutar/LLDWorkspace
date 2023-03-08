package OOAD.HotelBookingSystem.payment;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import OOAD.HotelBookingSystem.exceptions.PaymentFailureException;

public class UPIPayment extends Payment {
    private String userUPIId;
    private String transactionId;

    public UPIPayment(double amount, String userUPIId) {
        super(new Date(), amount, PaymentStatus.UNPAID);
        this.userUPIId = userUPIId;
    }

    @Override
    public void pay() throws PaymentFailureException {
        transactionId = String.valueOf(Math.random() * (999999 - 100000 + 1) + 100000);

        Pattern pattern = Pattern.compile("[a-z]+[@]\b(?:okhdfc|oksbi|okicici)\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(userUPIId);
        if (matcher.find()) {
            paymentStatus = PaymentStatus.SUCCESSFUL;
        } else {
            paymentStatus = PaymentStatus.FAILED;
            throw new PaymentFailureException();
        }
    }
}
