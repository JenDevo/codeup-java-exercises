import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
/* BELOW: is creating a string to output pi using the same variable without manipulating it to have a string */
        System.out.format("The value of pi is approximately %s /n", pi);

System.out.println("========SPACING==========");

        /* Exploring SCANNER CLASS */
        Scanner userInput = new Scanner(System.in);
        System.out.printf("What is your favorite number?");
                int userInt = userInput.nextInt();
                System.out.println(userInt);

                /* ABOVE: is a scanner user to get user input and return user input */

    }
}
