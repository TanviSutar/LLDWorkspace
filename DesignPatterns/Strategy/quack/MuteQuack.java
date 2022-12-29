package DesignPatterns.Strategy.quack;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("----Mute----.");
    }
}