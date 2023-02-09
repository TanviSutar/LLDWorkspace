package DesignPatterns.Facade.homeTheatreSubsystem;

public class TheatreLights {
    public void on() {
        System.out.println("Lights turning on.");
    }

    public void off() {
    }

    public void dim(int i) {
        System.out.println("Dimming lights by 10%.");
    }
}
