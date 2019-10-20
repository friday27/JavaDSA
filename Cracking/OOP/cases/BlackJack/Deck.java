public class Deck {
    private Card[] cards = new Card[52];
    private int size = 52;
    private final String[] suits = {"Spade", "Heart", "Diamond", "Club"};

    Deck() {
        //setup 52 cards
        int idx = 0;
        for(int i=0; i<=3; i++) {
            for(int j=1; j<=13; j++) {
                cards[idx++] = new Card(suits[i], j);
            }
        }
        shuffleCards();
    }

    private void shuffleCards() {
        for(int i=0; i<52; i++) {
            int randNum = (int)(Math.random()*51); //index: 0~51
            if(randNum != i) {
                swap(i, randNum);
            }
        }
    }

    private void swap(int i, int j) {
        Card tmp = cards[i];
        cards[i] = cards[j];
        cards[j] = tmp;
    }

    public int size() {
        return this.size;
    }

    public Card getCard() {
        if(size < 0)
            return null;
        return cards[--size];
    }

    public void reset() {
        shuffleCards();
        size = 52;
    }
}