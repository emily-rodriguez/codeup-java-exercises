package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        Student Bob = new Student("Bob");
        Student Linda = new Student("Linda");
        Student Tina = new Student("Tina");
        Student Gene = new Student("Gene");
        Student Louise = new Student("Louise");

        Bob.addGrade(75);
        Bob.addGrade(67);
        Bob.addGrade(82);

        Linda.addGrade(89);
        Linda.addGrade(78);
        Linda.addGrade(90);

        Tina.addGrade(56);
        Tina.addGrade(67);
        Tina.addGrade(62);

        Gene.addGrade(78);
        Gene.addGrade(69);
        Gene.addGrade(71);

        Louise.addGrade(80);
        Louise.addGrade(92);
        Louise.addGrade(75);

        students.put("BurgerBob995", Bob);
        students.put("LindaLovesMusicals", Linda);
        students.put("BoyCrazyTeenyTina", Tina);
        students.put("KeyboardKid", Gene);
        students.put("ToughBunny", Louise);


            System.out.println("Welcome!");
            System.out.println();
            System.out.println("Here are the github usernames of our students:");
            System.out.println();
            getUsernames(students);
            System.out.println();
        do{
            String userInput = input.getString("What student would you like to see more information on? Enter \"All\" to view all.");

            if (userInput.equalsIgnoreCase("all")){
                for (Student username : students.values()) {
                    System.out.println("Name: " + username.getName());
                }
            }
            else if (students.containsKey(userInput)){
                System.out.println("Name: " + students.get(userInput).getName() + " - " + "Github Username: " + userInput);
                ArrayList<Integer> grades = students.get(userInput).getGrades();
                System.out.println("Current Average: " + students.get(userInput).getGradeAverage(grades));
            } else {
                System.out.println("Sorry, that username does not exist");
            }
        } while (input.yesNo("Would you like to see another student?"));

        System.out.println("Y'all come back now, ya hear?");

    }

    public static void getUsernames(HashMap<String, Student> students){
        for (String username : students.keySet()) {
            System.out.print(String.format("|%s| ", username));
        }
        System.out.println();
    }
}
