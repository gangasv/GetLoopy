import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();

        String playAgain;

        // Main loop to continue until the player want to quit
        do {
            int rollCount = 0;
            boolean isTriple = false;

            // Print the header for the table
            System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("--------------------------------------------------");

            // Loop until a triple is thrown
            while (!isTriple) {
                rollCount++;

                // Generate 3 random values between 1 and 6
                int die1 = gen.nextInt(6) + 1;
                int die2 = gen.nextInt(6) + 1;
                int die3 = gen.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                // Display Output in the table
                System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", rollCount, die1, die2, die3, sum);

                // Check if all three dice rolls match (a triple)
                if (die1 == die2 && die2 == die3) {
                    isTriple = true;
                }
            }

            // Prompt the user if they want to play again
            System.out.print("\nDo you want to roll again? [Y/N]: ");
            playAgain = in.nextLine();
            System.out.println();

        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing.");
        in.close();
    }
}
