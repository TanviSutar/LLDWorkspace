package DesignPatterns.FactoryMethod;

public class PizzaMain{
    public static void main(String[] args){
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("greek");
    } 
}