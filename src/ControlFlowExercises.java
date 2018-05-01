import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("While loop: ");

        int i = 5;
        while(i <= 15) {
            System.out.println(i);
            i++;
        }

        System.out.println("=======");
        System.out.println("Do While loop: ");

        int x = 2;
        do {
            System.out.println(x);
            x += 2;
        } while (x <= 100);

        System.out.println("=======");
        System.out.println("For loop: ");

        for (int n = 5; n <= 15; n++) {
            System.out.println(n);
        }

        System.out.println("=======");
        System.out.println("Second For loop: ");

        for (int a = 2; a <= 100; a += 2) {
            System.out.println(a);
        }

        System.out.println("=======");
        System.out.println("FizzBuzz: ");

        for (int b = 1; b <= 100; b++) {
            if (b % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (b % 3 == 0){
                System.out.println("Fizz");
            } else if (b % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(b));
            }
        }

        System.out.println("What number would you like to go up to? ");
        int tableLength = scan.nextInt();

        System.out.println("Would you like to continue? [y/N] ");
        String userContinue = scan.next();

        boolean confirmation = userContinue.equals("y");

        System.out.println();
        System.out.println(String.format("%6s| %7s |%6s","number","squared","cubed"));
        System.out.println(String.format("%6s| %7s |%6s","-----","-----","-----"));

        for (int c = 1; c <= tableLength; c++) {
            System.out.println(String.format("%6s| %7s |%6s", c , c*c , c*c*c));
        }

        System.out.println("Please enter a grade from 0 to 100: ");
        int gradeInput = scan.nextInt();

        System.out.println("Would you like to continue? [y/N] ");
        String gradeContinue = scan.next();

        boolean gradeConfirmation = userContinue.equals("y");

        if (gradeInput > 0 && gradeInput <= 59) {
            System.out.println("Your grade is: F");
        } else if (gradeInput >= 60 && gradeInput <= 66) {
            System.out.println("Your grade is: D");
        } else if (gradeInput >= 67 && gradeInput <= 79) {
            System.out.println("Your grade is: C");
        } else if (gradeInput >= 80 && gradeInput <= 87) {
            System.out.println("Your grade is: B");
        } else if (gradeInput >= 88 && gradeInput <= 100) {
            System.out.println("Your grade is: A");
        }
    }
}
