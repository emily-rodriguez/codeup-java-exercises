package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        input.getString("Please enter a string");

        input.yesNo("Enter yes or no");

        input.getInt("Enter an integer",1, 10);

        input.getInt("Enter an integer");

        input.getDouble("Please enter a double", 1, 100);

        input.getDouble("Please enter another double");

        input.getHex("Enter a hexidecimal number: ");

        input.getBinary("Enter a binary number: ");

        input.getOctal("Enter an octal number: ");
    }
}
