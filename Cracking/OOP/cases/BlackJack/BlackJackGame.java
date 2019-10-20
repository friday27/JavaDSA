public class BlackJackGame {
    public static void main(String[] args) {
        String[] players = {"Mary", "Thomas", "Matthew", "Daisy"};
        BlackJack game = new BlackJack(players);
        String usersAns;
        do {
            game.start();
            System.out.println("======================================================");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Do you want to play again? ");
            usersAns = sc.nextLine();
        }while((usersAns.startsWith("y") || usersAns.startsWith("Y")));
    }
}