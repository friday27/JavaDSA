public class Player {
    String name;
    int expect = (int)(Math.random()*(21-16)+1)+16;
    private int score = 0;
    private java.util.List<Card> cards = new java.util.ArrayList<>();

    Player(String name) {
        this.name = name;
    }

    public void hit(Card card) {
        cards.add(card);
        score += card.getValue();
    }

    public boolean askForCard() {
        if(score < expect)
            return true;
        return false;
    }

    public int getScore() {
        return score;
    }

    public void clear() {
        cards.clear();
        score = 0;
        expect = (int)(Math.random()*(21-16)+1)+16;
    }
}