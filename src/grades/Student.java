package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
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

    public double getGradeAverage(){
        for (Integer grade: grades) {
            allGrades += grade;
        }
        return allGrades / grades.size();
    }

    public String toString() {
        return name + " earned an average grade of " + getGradeAverage();
    }




}
