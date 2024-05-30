package collection.compare.test;

import java.util.ArrayList;

public class Player {

    ArrayList<Card> cards = new ArrayList<>();

    public Player(ArrayList<Card> cards){
        this.cards = cards;
    }

    public ArrayList<Card> showCards(){
        return cards;
    }

    public int total(){
        int sum = 0;
        for(Card card : cards){
            sum += card.getNumber();
        }
        return sum;
    }

}
