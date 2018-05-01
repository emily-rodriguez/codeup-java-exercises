import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("While loop: ");

        int i = 5;
        while (i <= 15) {
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
            } else if (b % 3 == 0) {
                System.out.println("Fizz");
            } else if (b % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(b);
            }
        }

        // class review solution

//        for (int j = 1; j <= 100; j++) {
//            String fizzBuzz = "";
//
//            if (j % 3 == 0) {
//                fizzBuzz = "Fizz";
//            }
//            if (j % 5 == 0) {
//                fizzBuzz += "Buzz";
//            } else if (fizzBuzz.isEmpty()){
//                fizzBuzz = String.valueOf(j);
//            }
//            System.out.println(fizzBuzz);
//        }

        System.out.print("What number would you like to go up to? ");
        int tableLength = scan.nextInt();

        System.out.print("Would you like to continue? [y/N] ");
        String userContinue = scan.next();

        boolean confirmation = userContinue.equals("y");

        System.out.println("Here is your table!");

        System.out.println();
        System.out.println(String.format("%6s| %7s |%6s", "number", "squared", "cubed"));
        System.out.println(String.format("%6s| %7s |%6s", "-----", "-----", "-----"));

        for (int c = 1; c <= tableLength; c++) {
            System.out.println(String.format("%6s| %7s |%6s", c, c * c, c * c * c));
        }


//        System.out.print("Would you like to continue? [y/N] ");
//        String gradeContinue = scan.next();
//
//        boolean gradeConfirmation = userContinue.equals("y");
//
//        if (gradeInput > 0 && gradeInput <= 59) {
//            System.out.println("Your grade is: F");
//        } else if (gradeInput >= 60 && gradeInput <= 66) {
//            System.out.println("Your grade is: D");
//        } else if (gradeInput >= 67 && gradeInput <= 79) {
//            System.out.println("Your grade is: C");
//        } else if (gradeInput >= 80 && gradeInput <= 87) {
//            System.out.println("Your grade is: B");
//        } else if (gradeInput >= 88 && gradeInput <= 100) {
//            System.out.println("Your grade is: A");
//        }

        // in class solution:

        String userChoice;
        int gradeInput;
        int gradeTotal = 0;
        int numberOfGrades = 0;
        double gradeAverage;


        do {
            System.out.print("Please enter a grade between 0 to 100: ");
            gradeInput = scan.nextInt();

            String letterGrade = letterGrade(gradeInput);

            System.out.println("The calculated grade for " + gradeInput + " is a grade of: " + letterGrade);

            numberOfGrades++;
            gradeTotal += gradeInput;

            System.out.println("Do you want to calculate another grade?");
            userChoice = scan.next();

        } while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));

        gradeAverage = gradeTotal / numberOfGrades;
        System.out.println("The average grade for all assignments is: " + gradeAverage);
    }

    public static String letterGrade(int gradeInput) {
        String letterGrade;

        if (gradeInput >= 90) {
            letterGrade = "A";
        } else if (gradeInput >= 80) {
            letterGrade = "B";
        } else if (gradeInput >= 70) {
            letterGrade = "C";
        } else if (gradeInput >= 60) {
            letterGrade = "D";
        } else if (gradeInput >= 0 && gradeInput <= 59) {
            letterGrade = "F";
        } else {
            letterGrade = "This is not a valid grade. Please try again.";
        }
        return letterGrade;
    }
}
