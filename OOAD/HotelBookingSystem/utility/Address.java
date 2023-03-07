package OOAD.HotelBookingSystem.utility;

public class Address {
    private String apartmentName;
    private String landMark;
    private String city;
    private String state;
    private String country;
    private long pincode;

    public Address(String apartmentName, String landMark, String city, String state, String country, int pincode) {
        this.apartmentName = apartmentName;
        this.landMark = landMark;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public String getLandMark() {
        return landMark;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public long getPincode() {
        return pincode;
    }

}
