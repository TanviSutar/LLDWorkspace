package DesignPatterns.Strategy;

import DesignPatterns.Strategy.duck.Duck;
import DesignPatterns.Strategy.duck.MallardDuck;
import DesignPatterns.Strategy.duck.RubberDuck;

public class DuckSimulator{
    public static void main(String []args){
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();

        duck = new RubberDuck();
        duck.display();
        duck.performQuack();
    }
}