import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String userInput;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter something: ");
        userInput = sc.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
        System.out.println("============");

        int favoriteNumber;
        System.out.print("Please input your favorite number: ");
        favoriteNumber = sc.nextInt();

        System.out.println("You entered the number " + favoriteNumber);
    }
}
