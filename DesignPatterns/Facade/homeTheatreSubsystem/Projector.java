package DesignPatterns.Facade.homeTheatreSubsystem;

public class Projector {
    private DVDPlayer dvdPlayer;

    public void on() {
        System.out.println("Projector turning on.");
    }

    public void off() {
        System.out.println("Turning projector off   .");
    }

    public void tvMode() {
    }

    public void wideScreenMode() {
        System.out.println("Turning on wide screen mode.");
    }
}
