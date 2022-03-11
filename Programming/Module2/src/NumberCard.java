public class NumberCard extends Card{
    public NumberCard(int value, Suit suit){
        super(suit, value);
    }

    @Override
    public String toString() {
        return "("+suit+","+value+")";
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof NumberCard){
            NumberCard other = (NumberCard) obj;
            if(this.value == other.value)return true;
        }
        return false;
    }

    @Override
    public Suit getSuit() {
        return suit;
    }

    @Override
    public int getValue() {
        return value;
    }
}
