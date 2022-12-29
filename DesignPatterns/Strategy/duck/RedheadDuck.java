package DesignPatterns.Strategy.duck;

import DesignPatterns.Strategy.fly.FlyFreeStyle;
import DesignPatterns.Strategy.quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck(){
        flyBehaviour = new FlyFreeStyle();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Redhead duck display");
    }
}