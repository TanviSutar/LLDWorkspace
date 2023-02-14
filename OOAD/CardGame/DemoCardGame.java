package OOAD.CardGame;

public class DemoCardGame {
    public static void main(String args[]){
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println("Pull 1: " + deck.pull());
        System.out.println("Pull 2: " + deck.pull());
        System.out.println("Pull 3: " + deck.pull());
    }
}
