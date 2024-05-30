package collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player(deck.selectCards());
        Player player2 = new Player(deck.selectCards());

        System.out.println("플레이어1의 카드 : " + player1.showCards() + ", 합계 : " + player1.total());
        System.out.println("플레이어2의 카드 : " + player2.showCards() + ", 합계 : " + player2.total());
        if(player1.total() > player2.total()) {
            System.out.println("플레이어1의 승리");
        } else if(player1.total() == player2.total()){
            System.out.println("무승부");
        } else {
            System.out.println("플레이어2의 승리");
        }

    }
}
