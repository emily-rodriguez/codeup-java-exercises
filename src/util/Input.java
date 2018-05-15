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

    //alternative solution
//    public boolean yesNo() {
//        String answer = scanner.next();
//        return "y".equalsIgnoreCase(answer) || "yes".equalsIgnoreCase(answer);
//    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String userInput = scanner.next();
        if ("y".equalsIgnoreCase(userInput) || "yes".equalsIgnoreCase(userInput)){
            return true;
        } else {
            return false;
        }
    }


    public int getInt() {
        try {
            return Integer.valueOf(scanner.next());
        } catch (NumberFormatException e){
            System.out.println(e);
            System.out.println("Your input is not an integer");
            return getInt("Please enter an integer");
        }
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt < min || userInt > max) {
            System.out.println("Please enter and integer between " + min + " and " + max);
            return getInt(min, max);
        }
            return userInt;
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int userInt = getInt(prompt);
        if (userInt < min || userInt > max) {
            System.out.println("Please enter and integer between " + min + " and " + max);
            return getInt(min, max);
        }
            return userInt;
    }

    public double getDouble(double min, double max) {
        double userDouble = getDouble();
        if (userDouble < min || userDouble > max) {
            System.out.println("Please enter a double between " + min + " and " + max);
            return getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userDouble = getDouble();
        if (userDouble < min || userDouble > max) {
            System.out.println("Please enter a double between " + min + " and " + max);
            return getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble() {
        try {
            return Double.valueOf(scanner.next());
        } catch (NumberFormatException e){
            System.out.println(e);
            System.out.println("Your input is not a double");
            return getDouble("Please enter a double");
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public int getBinary(String prompt) {
        System.out.print(prompt);
        try {
            int decimal = Integer.valueOf(getString(), 2);
            System.out.println("Your decimal value is " + decimal);
            return decimal;
        } catch(NumberFormatException e) {
            System.out.println(e.toString());
            return getBinary(prompt);
        }
    }

    public int getHex(String prompt) {
        System.out.print(prompt);
        try {
            int decimal = Integer.valueOf(getString(), 16);
            System.out.println("Your decimal value is " + decimal);
            return decimal;
        } catch (NumberFormatException e) {
            System.out.println("That is not a valid hex value");
            return getHex(prompt);
        }
    }

    public int getOctal(String prompt) {
        System.out.print(prompt);
        try{
            int decimal = Integer.valueOf(getString(), 8);
            System.out.println("Your decimal value is " + decimal);
            return decimal;
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            return getOctal(prompt);
        }
    }
}
