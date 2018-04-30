import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        int userInt;

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

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

//        String sentenceInput;
//        System.out.print("Please enter a sentence: ");
//        sentenceInput = sc.next();
//        System.out.println("Here is my sentence: " + sentenceInput);

        String length;
        String width;
        System.out.print("Please enter width: ");
        width = sc.next();
        System.out.println(width);
        int widthValue = Integer.parseInt(width);
        System.out.print("Please enter length: ");
        length = sc.next();
        System.out.println(length);
        int lengthValue = Integer.parseInt(length);
        int area = lengthValue * widthValue;
        System.out.println("Area is: " + area);

    }
}
