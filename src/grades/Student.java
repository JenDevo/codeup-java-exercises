package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    /* BELOW: Constructor that sets name property and initializes grades property as an empty ArrayList */
    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

//    // returns the student's name
//    public String getName();
//    // adds the given grade to the grades property
//    public void addGrade(int grade);
//    // returns the average of the students grades
//    public double getGradeAverage();

}
