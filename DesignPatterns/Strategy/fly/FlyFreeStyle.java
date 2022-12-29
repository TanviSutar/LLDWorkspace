package DesignPatterns.Strategy.fly;

public class FlyFreeStyle implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Freestyle flying.");
    }
}