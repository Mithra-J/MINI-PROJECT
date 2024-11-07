import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] options = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Being alone and bored? \n Don't worry!!\n  Welcome to Rock, Paper, Scissors!");
        System.out.println("Enter your choice (Rock , Paper , or Scissors). Type 'exit' to quit.");

        while (true) {
            System.out.print("Your turn: ");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }
            
            int computerChoiceIndex = random.nextInt(3); // 0, 1, or 2
            String computerChoice = options[computerChoiceIndex];
            
            System.out.println("Computer chose: " + computerChoice);
            
            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
                System.out.println("You win!");
            } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Paper")) ||
                       (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Scissors")) ||
                       (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Rock"))) {
                System.out.println("You lose!");
            } else {
                System.out.println("Invalid input, please enter Rock, Paper, or Scissors.");
            }
            System.out.println(); 
        }
        
        scanner.close();
    }
}
