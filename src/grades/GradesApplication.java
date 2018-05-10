package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

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

        getUsernames(students);
    }

    public static void getUsernames(HashMap<String, Student> students){
        for (String username : students.keySet()) {
            System.out.print("|%s|, username");
        }
    }
}
