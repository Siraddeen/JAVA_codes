//import java.util.Scanner;
//
//public class rock_paper_20 {
//    public static void main(String[] args) {
//
//        System.out.println("give a num from 1 - 3 ");
//        Scanner me = new Scanner(System.in);
//        int a = me.nextInt();
//
//
//        int min = 1;
//        int max = 3;
//
//        int ran = (int) (Math.random() * (max - min +1))+min;
//
//        System.out.println(ran);
//
//        switch (ran){
//            case  1 -> System.out.println("rock");
//            case  2 -> System.out.println("paper");
//            case  3 -> System.out.println("scissor");
//        }
//
//        if(ran>a  && ran !=a ){
//            System.out.println("you win ");
//        }else {
//            System.out.println("you loose");
//        }
//
//
//
//
//    }
//}
import java.util.Scanner;

public class rock_paper_20 {
    public static void main(String[] args) {
        Scanner yourChoice = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Choose: 1 for Rock, 2 for Paper, 3 for Scissors");

        // Validate user input
        int userChoice = 0;
        while (true) {
            if (yourChoice.hasNextInt()) {
                userChoice = yourChoice.nextInt();
                if (userChoice >= 1 && userChoice <= 3) {
                    break; // Valid input
                } else {
                    System.out.println("Invalid input. Please choose a number between 1 and 3.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                yourChoice.next(); // Clear invalid input
            }
        }

        // Generate computer's choice
        int computerChoice = (int) (Math.random() * 3) + 1;

        // Display choices
        System.out.println("You chose: " + choiceToString(userChoice));
        System.out.println("Computer chose: " + choiceToString(computerChoice));

        // Determine the winner
        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }

    // Helper method to convert choice to string
    private static String choiceToString(int choice) {
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Invalid choice";
        }
    }
}