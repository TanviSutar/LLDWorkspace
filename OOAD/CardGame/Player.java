package OOAD.CardGame;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private double coins;

    public Player() {
        hand = new ArrayList<>();
        coins = 0.0;
    }

    public double getCoins() {
        return coins;
    }

    public void setCoins(double coins) {
        this.coins = coins;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int score() {
        int handScore = 0;
        for (Card card : hand) {
            handScore += card.getNumericValue();
        }
        for (Card card : hand) {
            if (card.getFaceValue() == FaceValue.ACE) {
                if (handScore > 21)
                    handScore = (handScore - card.getNumericValue()) + 1;
            }
        }
        return handScore;
    }
}
