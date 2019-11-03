public class Player {
     private String name = "";
     private String coinOption = "";
     public String[] coinValue = {"Head", "Tail"};

     Player(String playerName) {
        name = playerName;
     }

     public String getCoinOption() {
        return coinOption;
     }

     public void setCoinOption(String opponentFlip) {
        coinOption = (opponentFlip == "Head")? "Tail": "Head";
     }

     public String getRandCoinOption() {
        int randnum = (Math.random() < 0.5)? 0: 1;
        coinOption = coinValue[randnum];
        return coinOption;
     }

     public void didPlayerWin(String winningFlip) {
        if(coinOption.equals(winningFlip)) {
            System.out.println(name+" wins! (coinOption: "+coinOption+")");
        }else {
            System.out.println(name+" loses.. (coinOption: "+coinOption+")");
        }
     }
}