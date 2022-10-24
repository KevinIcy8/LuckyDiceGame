import java.util.Scanner;
public class DiceRunner {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Welcome to the Lucky Dice Game! What is your name?  ");
    String userName = s.nextLine();
    System.out.print("Hello, " + userName + ". Choose your threshold: ");
    int threshold = s.nextInt();
    System.out.print("Now, choose the number of sides for your dice (minimum of 4): ");
    int dieSide = s.nextInt();
    Player playerInfo = new Player(userName, threshold);
    DiceGame diceSides = new DiceGame(playerInfo, dieSide);

    }
}
