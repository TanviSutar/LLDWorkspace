package OOAD.HotelBookingSystem.booking;

import java.util.List;
import OOAD.HotelBookingSystem.utility.Duration;

public class RoomSearch {

    public static List<Room> searchAvailable(Duration duration) {
        List<Room> rooms = HotelLocation.getInstance().getRooms();
        // search room list according to the criteria given
        return rooms;
    }

    public static List<Room> searchAvailable(Duration duration, RoomType roomtype) {
        List<Room> rooms = HotelLocation.getInstance().getRooms();
        // search room list according to the criteria given
        return rooms;
    }
}
