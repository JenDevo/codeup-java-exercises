package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    /* BELOW: Constructor that sets name property and initializes grades property as an empty ArrayList */
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    /* Used to display array of all grades to be averaged out */
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(double gradeAvg : grades){
            total += gradeAvg;
        }
        return total / grades.size();
    }

}
