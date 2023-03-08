package OOAD.HotelBookingSystem.booking;

import java.util.ArrayList;
import java.util.List;
import OOAD.HotelBookingSystem.exceptions.RoomUnavailableException;
import OOAD.HotelBookingSystem.utility.Address;
import OOAD.HotelBookingSystem.utility.Duration;

public class HotelLocation extends Hotel {
    private Address address;
    private List<Room> rooms;

    public HotelLocation(String name, String franchiseName, Address address) {
        super(name, franchiseName);
        this.address = address;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Room> searchAvailable(Duration duration) {
        List<Room> availableRooms = new ArrayList<Room>();
        // search room list according to the criteria given
        return availableRooms;
    }

    public List<Room> searchAvailable(Duration duration, RoomType roomtype) {
        List<Room> availableRooms = new ArrayList<Room>();
        // search room list according to the criteria given
        return availableRooms;
    }

    // lack of functionality to determine if a room is booked for a particular date/duration
    public void bookRooms(List<Room> rooms) throws RoomUnavailableException {
        synchronized (rooms) {
            for (Room room : rooms) {
                if (room.getRoomStatus() != RoomStatus.AVAILABLE)
                    throw new RoomUnavailableException();
                room.book();
            }
        }
    }
}
