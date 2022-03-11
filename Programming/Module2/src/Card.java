public abstract class Card {
    public enum Suit{
        SPADES, CLUBS, HEARTS, DIAMONDS;
    }
    protected Suit suit;
    protected int value;
    public abstract Suit getSuit();
    public abstract int getValue();
    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }
}
