package DesignPatterns.Adapter;

import DesignPatterns.Adapter.adaptee.Turkey;
import DesignPatterns.Adapter.adaptee.WildTurkey;
import DesignPatterns.Adapter.adapter.TurkeyAdapter;
import DesignPatterns.Adapter.target.Duck;
import DesignPatterns.Adapter.target.MallardDuck;

public class AdapterDemo {
    public static void main(String []args){
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck wildDuck = new TurkeyAdapter(wildTurkey);

        mallardDuck.quack();
        wildDuck.quack();

        mallardDuck.fly();
        wildDuck.fly();
    }    
}
