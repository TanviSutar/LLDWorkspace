package DesignPatterns.Strategy.quack;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak squeak.");
    }
}