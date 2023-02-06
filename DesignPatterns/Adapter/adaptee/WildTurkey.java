package DesignPatterns.Adapter.adaptee;

public class WildTurkey implements Turkey{
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    public void fly() {
        System.out.println("Turkey Fly.");
    }
}
