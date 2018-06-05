package studyhall;

import util.Input;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class CodingChallenge {
    public static Input input = new Input();

    public static String alphabetizeString(String string) {
        char temp[] = string.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static int countVowels(String string) {
        int count = 0;
        ArrayList<String> vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        String array[] = string.toLowerCase().split("");
        for (String letter : array) {
            if(vowels.contains(letter)) {
                count++;
            }
        }
        return count;
    }

    public static String uniqueCharacters(String string) {
        ArrayList<String> unique = new ArrayList<>();
        String array[] = string.toLowerCase().split("");
        for (String letter : array) {
            if (!unique.contains(letter)) {
                unique.add(letter);
            }
        }
        String uniqueString = "";
        for (String s : unique) {
           uniqueString += s;
        }
        return uniqueString;
    }

    public static double celcius;
    public static double toCelcius(Double temp) {
        celcius = ((temp - 32) * 5)/9;
        return celcius;
    }

    public static double toKelvin(Double celcius) {
        double kelvin = celcius + 273.15;
        return kelvin;
    }


    public static String caseConvert(String string, String stringCase) {
        String answer = "";
        if (("snake").equals(stringCase)) {
            string = string.replaceAll("[^A-Za-z0-9]","");
            answer = string.toLowerCase().substring(0,4) + "_" + string.substring(4);
        }
        if (("kebab").equals(stringCase)) {
            string = string.replaceAll("[^A-Za-z0-9]","");
            answer = string.toLowerCase().substring(0,4) + "-" + string.substring(4);
        }
        if (("camel").equals(stringCase)) {
            string = string.replaceAll("[^A-Za-z0-9]","");
            char middle = string.charAt(4);
            String center = Character.toString(middle);
            answer = string.toLowerCase().substring(0,4) + center.toUpperCase() + string.substring(5);
        }

        return answer;

    }

    public static void main(String[] args) {
//        String userInput = input.getString("Please enter a string");
//        System.out.println(alphabetizeString(userInput));
//        System.out.println();
//        String userInput2 = input.getString("Please enter another string");
//        System.out.println(countVowels(userInput2));
//        System.out.println();
//        String userInput3 = input.getString("Please enter another string");
//        System.out.println(uniqueCharacters(userInput3));
//        System.out.println();
//        Double temp = input.getDouble("Please enter a temperature");
//        DecimalFormat df = new DecimalFormat("###.######");
//        System.out.println(df.format(toCelcius(temp)));
//        Boolean answer = input.yesNo("Convert to Kelvin?");
//        if (answer) {
//            System.out.println(df.format(toKelvin(celcius)));
//        }
        System.out.println(caseConvert("code_snake","camel"));

    }
}
