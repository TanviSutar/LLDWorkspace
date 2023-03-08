package OOAD.HotelBookingSystem.user;

import java.util.List;

import OOAD.HotelBookingSystem.booking.Booking;
import OOAD.HotelBookingSystem.booking.HotelLocation;
import OOAD.HotelBookingSystem.booking.Room;
import OOAD.HotelBookingSystem.exceptions.PaymentFailureException;
import OOAD.HotelBookingSystem.exceptions.RoomUnavailableException;
import OOAD.HotelBookingSystem.payment.*;
import OOAD.HotelBookingSystem.utility.Address;
import OOAD.HotelBookingSystem.utility.Duration;

public class User {
    private String id;
    private String name;
    private String contactNumber;
    private Address address;

    public User(String id, String name, String contactNumber, Address address) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public Booking bookRoom(HotelLocation hotel, List<Room> rooms, Duration duration, Payment payment)
            throws RoomUnavailableException, PaymentFailureException {
        hotel.bookRooms(rooms);
        Booking booking = new Booking(rooms, duration, this);
        payment.pay();
        if (payment.getPaymentStatus() != PaymentStatus.SUCCESSFUL) {
            booking.cancelBooking();
        }
        return booking;
    }

}
