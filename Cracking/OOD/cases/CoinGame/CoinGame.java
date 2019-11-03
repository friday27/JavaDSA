public class CoinGame {
    Player[] players = new Player[2];
    Coin theCoin = new Coin();

    CoinGame(String player1Name, String player2Name) {
        players[0] = new Player(player1Name);
        players[1] = new Player(player2Name);
    }

    /*
        1. A player at random is picked to predict the coin flip
        2. The player picked offers a prediction of the coin flip
        3. The other player gets the other coin flip option
        4. The coin is flipped nd the result is provided
        5. A winner and loser is picked
        6. Offer them to try again
    */
    public void startGame() {
        int randIndex = (Math.random() < 0.5)? 0: 1;
        String playersPick = players[randIndex].getRandCoinOption();

        int opponentsIndex = (randIndex == 0)? 1: 0;
        players[opponentsIndex].setCoinOption(playersPick);

        String winningFlip = theCoin.getCoinOption();

        for(int i=0; i<2; i++) {
            players[i].didPlayerWin(winningFlip);
        }
    }
}