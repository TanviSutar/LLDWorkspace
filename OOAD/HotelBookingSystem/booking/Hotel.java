package OOAD.HotelBookingSystem.booking;

public class Hotel {
    private String name;
    private String franchiseName;

    public Hotel(String name, String franchiseName) {
        this.name = name;
        this.franchiseName = franchiseName;
    }

    public String getName() {
        return name;
    }

    public String getFranchiseName() {
        return franchiseName;
    }

}