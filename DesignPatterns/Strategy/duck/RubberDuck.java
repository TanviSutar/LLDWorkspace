package DesignPatterns.Strategy.duck;

import DesignPatterns.Strategy.fly.FlyNoWay;
import DesignPatterns.Strategy.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("Rubber duck display");
    }
}