package OOAD.HotelBookingSystem.booking;

public class Room {
    private int id;
    private RoomType roomType;
    private RoomStatus roomStatus;
    private double costPerDay;

    public Room(int id, RoomType roomType, RoomStatus roomStatus, double costPerDay) {
        this.id = id;
        this.roomType = roomType;
        this.roomStatus = roomStatus;
        this.costPerDay = costPerDay;
    }

    public int getId() {
        return id;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

}
