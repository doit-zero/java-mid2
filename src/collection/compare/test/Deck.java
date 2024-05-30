package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cardList = new ArrayList<>();
    private final String[] shapeArr = new String[]{"클","하","다","나"};
    public Deck(){
        this.cardList = init();
    }

    public void shuffle(){
        Collections.shuffle(cardList);
    }

    public ArrayList<Card> selectCards(){
        ArrayList<Card> selectCards = new ArrayList<>(5);
        for(int i = 0; i<5; i++){
            selectCards.add(cardList.get(i));
            cardList.remove(cardList.get(i));
        }
        return selectCards;
    }


    private ArrayList<Card> init(){
        for(int i =0; i<13; i++){
            for(int a = 0 ; a< shapeArr.length; a++){
                Card card = new Card(i+1,shapeArr[a]);
                cardList.add(card);
            }
        }
        return cardList;
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }
}
