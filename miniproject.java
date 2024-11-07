import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] options = {"Rock", "Paper", "Scissors"};
        int userScore = 0;
        int computerScore = 0;
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (Rock, Paper, or Scissors). Type 'exit' to quit.");

        while (true) {
            System.out.print("Your turn: ");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("\nGame Over!");
                System.out.println("Final Score:");
                System.out.println("User: " + userScore + " | Computer: " + computerScore);

                if (userScore > computerScore) {
                    System.out.println("Congratulations! You won the game!");
                } else if (computerScore > userScore) {
                    System.out.println("Computer wins! Better luck next time.");
                } else {
                    System.out.println("It's a tie overall!");
                }
                break;
            }
            
            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = options[computerChoiceIndex];
            
            System.out.println("Computer chose: " + computerChoice);
            
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win this round!");
                userScore++;
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Paper")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Rock"))) {
                System.out.println("Computer wins this round!");
                computerScore++;
            } else {
                System.out.println("Invalid input, please enter Rock, Paper, or Scissors.");
            }
            System.out.println(); // Blank line for readability
        }
        
        scanner.close();
    }
}