package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList<Integer> grades;
    int allGrades = 0;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(ArrayList<Integer> grades){
        for (Integer grade: grades) {
            allGrades += grade;
        }
        return allGrades / grades.size();
    }

    public static void main(String[] args) {
        Student Emily = new Student("Emily");

        Emily.addGrade(97);
        Emily.addGrade(95);
        Emily.addGrade(84);
        Emily.addGrade(91);

        System.out.println("Your average is: " + Emily.getGradeAverage(Emily.grades));
    }




}
