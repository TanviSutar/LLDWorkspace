package DesignPatterns.Facade.homeTheatreSubsystem;

public class Amplifier {
    private Tuner tuner;
    private CDPlayer cdPlayer;
    private DVDPlayer dvdPlayer;

    public void on() {
        System.out.println("Amplifier turning on.");
    }

    public void off() {
        System.out.println("Turning off amplifier.");
    }

    public void setCD() {
    }

    public void setDVD() {
        System.out.println("Accepting dvd.");
    }

    public void setDvd(DVDPlayer dvdPlayer2) {
    }

    public void setSurroundSound() {
        System.out.println("Setting surround sound.");
    }

    public void setVolume(int i) {
        System.out.println("Setting volume to "+ i);
    }
}
