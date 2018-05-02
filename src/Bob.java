import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Talk to Bob: ");

        String userInput = scan.next();

        String bobResponse;

        if (userInput.endsWith("?")) {
            bobResponse = "Sure.";
        } else if (isUpperCase(userInput)) {
            bobResponse = "Whoa, chill out!";
        } else if (userInput.trim().equals("")) {
            bobResponse = "Fine. Be that way!";
        } else {
            bobResponse = "Whatever";
        }
        System.out.println(bobResponse);

        //class solution
//        boolean isQuestion = userInput.endsWith("?");
//        boolean isYelling = userInput.equals(userInput.toUpperCase());
//        boolean isEmpty = userInput.trim().equals("");
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
