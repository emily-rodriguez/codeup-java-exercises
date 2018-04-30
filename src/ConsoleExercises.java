import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        int userInt;

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        userInt = sc.nextInt();
        System.out.println("You entered the number: " + userInt);

        String firstWord;
        String secondWord;
        String thirdWord;

        System.out.print("Please enter three words: ");
        firstWord = sc.next();
        System.out.println("Your first word is: " + firstWord);
        secondWord = sc.next();
        System.out.println("Your second word is: " + secondWord);
        thirdWord = sc.next();
        System.out.println("Your third word is: " + thirdWord);

    }
}
