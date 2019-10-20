public class Card {
    private final String suit;
    private final int value;

    Card(String suit, int v) {
        this.suit = suit;
        this.value = v;
    }

    public String getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }
}