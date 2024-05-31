package collection.compare.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck(){
        init();
        shuffle();
    }

    public Card drawCard(){
        return cards.remove(0);
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    private void init() {
        for(int i = 0; i < 13; i++){
            for(Suit value : Suit.values()){
                cards.add(new Card(i+1,value));
            }
        }
    }


}
