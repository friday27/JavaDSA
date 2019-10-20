public class BlackJack {
    private Player[] players; //including the dealer
    private int playersNum;
    private Deck deck = new Deck();

    BlackJack(String[] playerNames) {
        players = new Player[playerNames.length+1];
        playersNum = playerNames.length+1;
        for(int i=0; i<playerNames.length; i++) {
            players[i] = new Player(playerNames[i]);
        }
        players[players.length-1] = new Player("Dealer");
    }

    // send 2 cards to each players and dealer
    public void dealFirst() {
        for(int i=0; i<playersNum; i++) {
            players[i].hit(deck.getCard());
            players[i].hit(deck.getCard());
        }
    }

    // check if every player and dealer wants more cards and deal cards
    public void dealMore() {
        for(int i=0; i<playersNum; i++) {
            while(players[i].askForCard()) {
                players[i].hit(deck.getCard());
            }
        }
    }

    // calculate scores and print the winner
    public void calculateScore() {
        Player winner = null;
        int winnerScore = -1;
        for(int i=0; i<playersNum; i++) {
            int score = players[i].getScore();
            if(score <= 21) {
                if(winner == null || score > winnerScore) {
                    winner = players[i];
                    winnerScore = score;
                }
            }
        }
        if(winner == null) {
            System.out.println("Dealer wins BlackJack! (No one wins...)");
        }
        else
            System.out.println(winner.name+" wins BlackJack! (score: "+winnerScore+", expected score: "+winner.expect+")");
        printPlayersScores();
    }

    private void printPlayersScores() {
        for(int i=0; i<playersNum; i++) {
            System.out.println(players[i].name+": "+players[i].getScore());
        }
    }

    private void clear() {
        for(int i=0; i<playersNum; i++) {
            players[i].clear();
        }
    }

    public void start() {
        deck.reset();
        dealFirst();
        dealMore();
        calculateScore();
        clear();
    }
}