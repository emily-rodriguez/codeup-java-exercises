import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();

        String bobResponse = "";

        if (userInput.endsWith("?")) {
            bobResponse = "Sure.";
        } else if (isUpperCase(userInput)) {
            bobResponse = "Whoa, chill out!";
        } else if (userInput.equals("")) {
            bobResponse = "Fine. Be that way!";
        } else {
            bobResponse = "Whatever";
        }
        System.out.println(bobResponse);
    }

    public static boolean isUpperCase(String s)
    {
        for (int i=0; i<s.length(); i++)
        {
            if (Character.isLowerCase(s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }

}
