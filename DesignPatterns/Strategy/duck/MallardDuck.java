package DesignPatterns.Strategy.duck;

import DesignPatterns.Strategy.fly.FlyFreeStyle;
import DesignPatterns.Strategy.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehaviour = new FlyFreeStyle();
        quackBehaviour = new Quack();
    }
    @Override
    public void display(){
        System.out.println("Mallard duck display");
    }
}