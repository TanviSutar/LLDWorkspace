package DesignPatterns.Strategy.quack;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Normal quack.");
    }
}