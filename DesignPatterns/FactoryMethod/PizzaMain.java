package DesignPatterns.FactoryMethod;

import DesignPatterns.FactoryMethod.pizzaStore.ChicagoPizzaStore;
import DesignPatterns.FactoryMethod.pizzaStore.NYPizzaStore;
import DesignPatterns.FactoryMethod.pizzaStore.PizzaStore;

public class PizzaMain{
    public static void main(String[] args) throws InterruptedException{
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("greek");
        Thread.sleep(50000);
    } 
}