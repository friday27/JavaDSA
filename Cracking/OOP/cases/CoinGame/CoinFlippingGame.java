import java.util.Scanner;

public class CoinFlippingGame {
    public static void main(String[] args) {
        CoinGame theCoinGame = new CoinGame("Mary", "Matthew");
        String usersAns;

        do {
            theCoinGame.startGame();
            System.out.println("Play again? ");
            Scanner sc = new Scanner(System.in);
            usersAns = sc.nextLine();

        }while((usersAns.startsWith("y") || usersAns.startsWith("Y")));
    }
}