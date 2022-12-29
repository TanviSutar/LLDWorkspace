package DesignPatterns.Strategy.duck;

import DesignPatterns.Strategy.fly.FlyBehaviour;
import DesignPatterns.Strategy.quack.QuackBehaviour;

public abstract class Duck{
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;
    
    public void performFly() {
        flyBehaviour.fly();
    }
    public void performQuack() {
        quackBehaviour.quack();
    }
    public void swim(){
        System.out.println("Regular duck swimming.");
    }
    public abstract void display();
}