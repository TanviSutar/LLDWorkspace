package DesignPatterns.Adapter.adapter;

import DesignPatterns.Adapter.adaptee.Turkey;
import DesignPatterns.Adapter.target.Duck;

public class TurkeyAdapter implements Duck{
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i=0; i<3; i++)
            turkey.fly();
    }
    
}
