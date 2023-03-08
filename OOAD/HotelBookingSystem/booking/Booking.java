package OOAD.HotelBookingSystem.booking;

import java.util.Date;
import java.util.List;

import OOAD.HotelBookingSystem.user.User;
import OOAD.HotelBookingSystem.utility.Duration;

public class Booking {
    private String bookingId;
    private BookingStatus bookingStatus;
    private Date date;
    private List<Room> rooms;
    private Duration duration;
    private User user;

    public Booking(List<Room> rooms, Duration duration, User user){
        bookingId = String.valueOf(Math.random()*(99999 - 10000 + 1) + 10000);
        bookingStatus = BookingStatus.REQUESTED;
        date = new Date();
        this.rooms = rooms;
        this.duration = duration;
        this.user = user;
    }

    public void cancelBooking(){
        for(Room room: rooms){
            room.unbook();
        }
        bookingStatus = BookingStatus.CANCELLED;
    }
}
