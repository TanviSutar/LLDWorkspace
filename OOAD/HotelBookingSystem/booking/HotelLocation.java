package OOAD.HotelBookingSystem.booking;

import java.util.List;

import OOAD.HotelBookingSystem.utility.Address;

public class HotelLocation extends Hotel{
    private Address address;
    private List<Room> rooms;
    private static HotelLocation self;

    public HotelLocation(String name, String franchiseName, Address address) {
        super(name, franchiseName);
        this.address = address;
    }

    public static HotelLocation getInstance(){
        if(self == null){
            synchronized(HotelLocation.class){
                if(self == null){
                    self = new HotelLocation("Sheraton Grand", "Grandeur", new Address("Pink Villa Apartment", "", "Pune", "Maharashtra", "India", 411061));
                }
            }
        }
        return self;
    }

    public List<Room> getRooms(){
        return rooms;
    }
    
}
