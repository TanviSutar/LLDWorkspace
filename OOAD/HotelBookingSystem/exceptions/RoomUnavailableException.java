package OOAD.HotelBookingSystem.exceptions;

public class RoomUnavailableException extends Exception {
    public RoomUnavailableException() {
        super("Room is not available.");
    }
}
