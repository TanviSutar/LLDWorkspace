package OOAD.CardGame;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoBlackJack {
    public static void main(String args[]){
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player());
        players.add(new Player());
        players.add(new Player());
        players.add(new Player());

        Deck deck = new Deck(new ArrayList<Integer>(Arrays.asList(11, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10)));
        deck.shuffle();

        Player dealer = players.get(players.size() -1);

        //serving first hand of two cards each
        for(int i=0; i<players.size(); i++){
            System.out.println("Player"+i+" cards: ");
            Card card = deck.pull();
            players.get(i).addCard(card);
            System.out.println(card);
            card = deck.pull();
            players.get(i).addCard(card);
            if(players.get(i) == dealer){ 
                System.out.println();
                continue;
            }
            System.out.println(card+"\n");
        }

        boolean isHit = false;
        for(Player player: players){
            if(player == dealer){
                if(player.score() < 17) player.addCard(deck.pull());
                continue;
            }
            if(player.score() == 21){ 
                player.setCoins(1.5);
                continue;
            }
            if(player.score() >= 21){
                player.setCoins(-1);
                continue;
            } 
            if(isHit){
                player.addCard(deck.pull());
                isHit = !isHit;
            }
        }

        boolean isDealersHandBiggest = true;
        for(Player player: players){
            if(player.score() != 21 && player.score() != -1){
                if(player.score() > dealer.score()){
                    player.setCoins(2);
                    isDealersHandBiggest = false;
                } 
            }
        }

        if(isDealersHandBiggest) dealer.setCoins(2);

        for(int i=0; i<players.size(); i++){
            if(players.get(i).getCoins() == -1) 
                System.out.println("Player "+(i+1)+" busted");
            else
                System.out.println("Player "+(i+1)+" ==> "+players.get(i).getCoins()+" coins.");
        }
    }
}
