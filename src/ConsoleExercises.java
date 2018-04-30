import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int userInt = sc.nextInt();
        System.out.println("You entered the number: " + userInt);

        System.out.println("Please enter three words: ");
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();
        System.out.println(firstWord + " " + secondWord + " " + thirdWord);

        sc.nextLine();

        System.out.print("Please enter a sentence: ");
        String sentenceInput = sc.nextLine();
        System.out.println("Here is my sentence: " + sentenceInput);

        System.out.println();
        System.out.println("Input the length: ");
        String lengthString = sc.next();
        double length = Double.parseDouble(lengthString);
        System.out.println("Length is: " + length);

        System.out.println("Please input the width: ");
        String widthString = sc.next();
        double width = Double.parseDouble(widthString);
        System.out.println("Width is: " + width);

        System.out.println("Input the height of the room: ");
        String heightString = sc.next();
        double height = Double.parseDouble(heightString);

        double volume = width * length * height;
        System.out.println("The Volume of the room is: " + volume);

        double area = width * length;
        System.out.println("Area of the room is: " + area);

        double perimeter = 2 * width + 2 * length;
        System.out.println("The perimeter of the room is: " + perimeter);


    }
}
