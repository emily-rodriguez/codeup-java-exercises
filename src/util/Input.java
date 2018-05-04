package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return scanner.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.next();
    }

    public boolean yesNo() {
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInt = scanner.nextInt();
        if (userInt < min || userInt > max) {
            System.out.println("Please enter and integer between " + min + " and " + max);
            return getInt(min, max);
        }
            return userInt;
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int userInt = scanner.nextInt();
        if (userInt < min || userInt > max) {
            System.out.println("Please enter and integer between " + min + " and " + max);
            return getInt(min, max);
        }
            return userInt;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userDouble = scanner.nextDouble();
        if (userDouble < min || userDouble > max) {
            System.out.println("Please enter a double between " + min + " and " + max);
            return getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userDouble = scanner.nextDouble();
        if (userDouble < min || userDouble > max) {
            System.out.println("Please enter a double between " + min + " and " + max);
            return getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
