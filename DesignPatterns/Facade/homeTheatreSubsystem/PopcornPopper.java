package DesignPatterns.Facade.homeTheatreSubsystem;

public class PopcornPopper {
    public void on() {
        System.out.println("Popcorn an the way.");
    }

    public void off() {
        System.out.println("Popcorn popper turning off.");
    }

    public void pop() {
        System.out.println("Popcorn ready to serve.");
    }
}
