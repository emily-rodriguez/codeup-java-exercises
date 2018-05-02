import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Addition method: " + Addition(234, 567));
        System.out.println("Subtraction method:" + Subtraction(20, 5));
        System.out.println("Multiplication method: " + Multiplication(4, 2));
        System.out.println("Division method: " + Division(56, 8));
        System.out.println("Modulus function: " + Modulus(50, 10));

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println("User input = " + userInput);


//        System.out.print("Please enter an integer between 1 and 10: ");
//        int factorialInput = scan.nextInt();
//        System.out.println("Factorial method on " + factorialInput + ": " + factorial(factorialInput));

    }

    public static long Addition(long number, long number2) {
        return number + number2;
    }

    public static long Subtraction(long minuend, long subtrahend) {
        return minuend - subtrahend;
    }

    public static long Multiplication(long number, long multiplier) {
        if (multiplier == 0) {
            return 0;
        }
        if (multiplier == 1) {
            return number;
        }
        return number + Multiplication(number, multiplier - 1);
    }

    public static float Division(long dividend, long divisor) {
        return dividend / divisor;
    }

    public static int Modulus(int dividend, int divisor) {
        return dividend % divisor;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInteger = sc.nextInt();

        if (userInteger < min) {
            System.out.print("That is not within range please enter a new number: ");
            return getInteger(1, 10);
        }
        if (userInteger > max) {
            System.out.print("That is not within range please enter a new number: ");
            return getInteger(1, 10);
        }
        return userInteger;
        }

    public static long factorial(int n) {

        int factor = 1;

        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }
}
