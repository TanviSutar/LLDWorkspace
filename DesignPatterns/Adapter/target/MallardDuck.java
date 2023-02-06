package DesignPatterns.Adapter.target;

public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("Fly.");
    }
}
