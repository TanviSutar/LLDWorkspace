package OOAD.CardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class Deck {
    private ArrayList<Card> deck;
    public Deck(){
        reinitialize();
    }
    public void reinitialize(){
        deck = new ArrayList<>();
        for(Suite suite: Suite.values()){
            for(FaceValue faceValue: FaceValue.values())
                deck.add(new Card(suite, faceValue));
        }
    }
    public void shuffle(){
        int minIndex = 0, maxIndex = deck.size()-1;
        for(int i=0; i<deck.size(); i++){
            int index = (int) (Math.random() * (maxIndex - minIndex + 1) + minIndex); 
            Collections.swap(deck, i, index);
        }
    }
    public Card pull(){
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }
}
