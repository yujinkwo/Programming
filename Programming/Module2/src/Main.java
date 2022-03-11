import java.util.ArrayList;

public class Main {
    private static final int SIZE_OF_DECK = 52;
    public static void main(String[] args) {

        ArrayList cardsDeck = new ArrayList();
        Card.Suit[] suits = {Card.Suit.CLUBS, Card.Suit.DIAMONDS, Card.Suit.HEARTS, Card.Suit.SPADES};
        for (int j=0; j<suits.length; j++) {
            cardsDeck.add(new FaceCard(1, suits[j]));
            for (int i = 2; i < 11; ++i) {
                cardsDeck.add(new NumberCard(i, suits[j]));
            }
            cardsDeck.add(new FaceCard(11, suits[j]));
            cardsDeck.add(new FaceCard(12, suits[j]));
            cardsDeck.add(new FaceCard(13, suits[j]));
        }
        System.out.println("Deck Of Cards:" + cardsDeck);

        ArrayList shuffledDeck = new ArrayList();
        while (cardsDeck.size() > 0) {
            int index = (int) (Math.random() * cardsDeck.size());
            Card removedCard = (Card)cardsDeck.remove(index);
            shuffledDeck.add(removedCard);
        }
        System.out.println("Shuffled Cards" + shuffledDeck);
    }
}
