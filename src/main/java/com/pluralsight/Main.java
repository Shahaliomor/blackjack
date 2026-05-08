import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("=================================");
            System.out.println("        Welcome to Blackjack");
            System.out.println("=================================");

            System.out.print("Enter Player 1 name: ");
            String player1 = input.nextLine();

            System.out.print("Enter Player 2 name: ");
            String player2 = input.nextLine();

            com.pluralsight.Deck deck = new com.pluralsight.Deck();
            deck.shuffle();

            com.pluralsight.Hand hand1 = new com.pluralsight.Hand();
            com.pluralsight.Hand hand2 = new com.pluralsight.Hand();

            hand1.deal(deck.deal());
            hand1.deal(deck.deal());

            hand2.deal(deck.deal());
            hand2.deal(deck.deal());

            System.out.println();
            System.out.println(player1 + "'s hand:");
            hand1.display();
            int score1 = hand1.getValue();
            System.out.println("Score: " + score1);

            System.out.println();
            System.out.println(player2 + "'s hand:");
            hand2.display();
            int score2 = hand2.getValue();
            System.out.println("Score: " + score2);

            System.out.println();
            System.out.println("=================================");
            System.out.println("Result");
            System.out.println("=================================");

            if (score1 > 21 && score2 > 21) {
                System.out.println("Both players busted! No winner.");
            } else if (score1 > 21) {
                System.out.println(player1 + " busted!");
                System.out.println(player2 + " wins!");
            } else if (score2 > 21) {
                System.out.println(player2 + " busted!");
                System.out.println(player1 + " wins!");
            } else if (score1 > score2) {
                System.out.println(player1 + " wins!");
            } else if (score2 > score1) {
                System.out.println(player2 + " wins!");
            } else {
                System.out.println("It's a tie!");
            }

            input.close();
        }
}

