package DesignPatterns.Strategy.duck;

import DesignPatterns.Strategy.fly.FlyNoWay;
import DesignPatterns.Strategy.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("Decoy duck display");
    }
}