package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student amy = new Student("Amy");

        amy.addGrade(90);
        amy.addGrade(80);
        amy.addGrade(100);
        System.out.println("Current list of grades: " + amy.getGrades());
        System.out.println(amy.getName() + " has a cumulative average of: "  + amy.getGradeAverage());
    }
}
