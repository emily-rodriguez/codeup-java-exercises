import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Would you like to play a game? [y/N]");
        String userInput = scan.next();


        do {
            int randomNumber = randomNumber(1, 100);

            System.out.print("Please guess a number between 1 and 100: ");
            int userGuess = scan.nextInt();

            guessValidation(userGuess, randomNumber);

            System.out.print("Would you like to play again [y/N]");
            userInput = scan.next();

        } while (userInput.equals("y"));

    }

    public static int guessValidation(int guess, int random) {

        Scanner sc = new Scanner(System.in);
        int newGuess;
        if (guess < random) {
            System.out.print("HIGHER: ");
            newGuess = sc.nextInt();
            return guessValidation(newGuess, random);
        }
        else if (guess > random) {
            System.out.print("LOWER: ");
            newGuess = sc.nextInt();
            return guessValidation(newGuess, random);
        }
        else {
            System.out.println("Good guess! The number was: " + random);
        }
        return random;
    }

    public static int randomNumber (int min, int max) {
        Random rand = new Random();
        int randomNumberValue = rand.nextInt(max) + min;
        return randomNumberValue;
    }

}
