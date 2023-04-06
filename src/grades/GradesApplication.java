package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    /* Create a map for students and GitHub usernames */
    public static void main(String[] args) {
        HashMap <String, Student> students = new HashMap<>();

        Student easton = new Student("Easton");
        Student reese = new Student("Reese");
        Student tehya = new Student("Tehya");
        Student bentley = new Student("Bentley");

        students.put("Ed123zane", easton);
        easton.addGrade(87);
        easton.addGrade(94);
        easton.addGrade(100);

        students.put("RoissePoise6", reese);
        reese.addGrade(88);
        reese.addGrade(93);
        reese.addGrade(100);

        students.put("Ayhet555", tehya);
        tehya.addGrade(81);
        tehya.addGrade(92);
        tehya.addGrade(100);

        students.put("MrBents15", bentley);
        bentley.addGrade(100);
        bentley.addGrade(100);
        bentley.addGrade(100);
        bentley.getGradeAverage();

        System.out.println("----------");
        System.out.println("Welcome!");
        System.out.println("Below is our list of users:");

        for (String userName : students.keySet()){
            System.out.print(userName + " | ");
        }
        System.out.println("\n----------");
        Input input = new Input();
        boolean validUser = true;

        do {

            System.out.println("Please enter a valid username to see more information.");
            String userInput = input.getString();

            if (students.containsKey(userInput)){
                System.out.println("Name: " + students.get(userInput).getName() + "\nGrade Avg: " + students.get(userInput).getGradeAverage());
//                System.out.println("Would you like to continue? (yes/no)");

            } else
                System.out.println("Whoops, invalid username...");
        }while (validUser);
    }
}
