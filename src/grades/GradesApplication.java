package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    private static HashMap<String, Student> students = new HashMap<>();
    private static Input input = new Input();

    protected static HashMap<String, Student> getStudents() {
        HashMap<String, Student> students = new HashMap<>();


        Student bob = new Student("Bob");
        Student linda = new Student("Linda");
        Student tina = new Student("Tina");
        Student gene = new Student("Gene");
        Student louise = new Student("Louise");

        bob.addGrade(75);
        bob.addGrade(67);
        bob.addGrade(82);

        linda.addGrade(89);
        linda.addGrade(78);
        linda.addGrade(90);

        tina.addGrade(56);
        tina.addGrade(67);
        tina.addGrade(62);

        gene.addGrade(78);
        gene.addGrade(69);
        gene.addGrade(71);

        louise.addGrade(80);
        louise.addGrade(92);
        louise.addGrade(75);

        students.put("BurgerBob995", bob);
        students.put("LindaLovesMusicals", linda);
        students.put("BoyCrazyTeenyTina", tina);
        students.put("KeyboardKid", gene);
        students.put("ToughBunny", louise);

        return students;
    }

    public static void main(String[] args) {

        System.out.println("Welcome!");
            System.out.println();
            System.out.println("Here are the github usernames of our students:");

        do{
            System.out.println();
            getUsernames(students = getStudents());
            System.out.println();

            String userInput = input.getString("What student would you like to see more information on? Enter \"All\" to view all.");

            if (userInput.equalsIgnoreCase("all")){
                for (Map.Entry<String, Student> student : students.entrySet()) {
                    Student studentObject = student.getValue();
                    String studentUsername = student.getKey();
                    System.out.println(studentObject + " -- Github username: " + studentUsername);
                    ArrayList<Integer> grades = studentObject.getGrades();
                    System.out.println("All grades: " + grades);

                }
            }
            else if (students.containsKey(userInput)){
                Student student = students.get(userInput);
                System.out.println(student + " -- " + "Github Username: " + userInput);
                ArrayList<Integer> grades = student.getGrades();
                System.out.println("All grades: " + grades);
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
