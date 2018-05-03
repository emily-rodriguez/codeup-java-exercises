package util;

public class InputTest {
    public static void main(String[] args) {
        System.out.print("Enter a string");
        Input input = new Input();

        System.out.println(input.getString());

        System.out.print("Enter yes or no");

        System.out.println(input.yesNo());

        System.out.println("Please enter a number between 1 and 10");

        input.getInt(1, 10);

        System.out.println("Please enter an integer");

        System.out.println(input.getInt());

        System.out.println("Please enter a double");

        input.getDouble(1, 100);
    }
}
