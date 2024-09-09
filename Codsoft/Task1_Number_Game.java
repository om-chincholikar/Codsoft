import java.util.Random;
import java.util.Scanner;
public class Task1_Number_Game {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playagain = true;

        while (playagain) {
            int number = random.nextInt(100) + 1;
            int attempt = 0;
            int maxattempts = 10;
            boolean guesscorrect = false;
            
            System.out.println("I  a random number between 1 and 100.");
            
            while (attempt < maxattempts && !guesscorrect) {
                System.out.print("Enter your guess: ");
                
                try {
                    // int guess = Integer.parseInt(sc.nextLine());
                    int guess=sc.nextInt();
                    attempt++;

                    if (guess == number) {
                        System.out.println("You guessed correctly!");
                        guesscorrect = true;
                        score++;
                    } else if (guess < number) {
                        System.out.println("Your guess is too low.");
                    } else {
                        System.out.println("Your guess is too high.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }
            }

            if (!guesscorrect) {
                System.out.println("Sorry, you've used all attempts. The number was: " + number);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = sc.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                playagain = false;
            }
        }

        System.out.println("Your final score is: " + score);
        sc.close();
}
}