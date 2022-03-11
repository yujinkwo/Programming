public class FaceCard extends Card {
    public enum Face{
        ACES, KING, QUEEN, JACK
    }
    public FaceCard(int value, Suit suit){
        super(suit, value);
    }

    @Override
    public Suit getSuit() {
        return suit;
    }

    @Override
    public int getValue() {
        return value;
    }
    Face face;

    public void setFaceValue(int value) {
        face = face;
    }
    public String toString() {
        if (value==1) return "("+suit+","+Face.ACES.name()+")";
        if (value==11) return "("+suit+","+Face.KING.name()+")";
        if (value==12) return "("+suit+","+Face.QUEEN.name()+")";
        if (value==13) return "("+suit+","+Face.JACK.name()+")";
        return null;
    }
}
