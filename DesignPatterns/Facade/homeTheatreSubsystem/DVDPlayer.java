package DesignPatterns.Facade.homeTheatreSubsystem;

public class DVDPlayer {
    private Amplifier amplifier;

    public void on() {
        System.out.println("DVD turning on.");
    }

    public void off() {
        System.out.println("Turning off dvd.");
    }

    public void eject() {
        System.out.println("Ejecting dvd.");
    }

    public void play(String movie) {
        System.out.println("Playing "+movie);
    }

    public void stop() {
        System.out.println("Stoping dvd.");
    }
}
