import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

        double pi = 3.14159;
/* BELOW: is creating a string to output pi using the same variable without manipulating it to have a string */
        System.out.format("The value of pi is approximately %s /n", pi);

        System.out.println("========SPACING==========");



        /* EXPLORING SCANNER CLASS */
        Scanner userInput = new Scanner(System.in);
            /*Question 1*/
        System.out.print("What is your favorite number?");
                int userInt = userInput.nextInt();
                System.out.println(userInt);

        System.out.print("What is your favorite color?");
                System.out.println(userInput.next());
                /* ABOVE: is a scanner user to get user input and return user input */

            /*Question 2*/
        System.out.println("What are your 3 favorite words?");
                String firstWord = userInput.next();
                String secondWord = userInput.next();
                String thirdWord = userInput.next();
            System.out.println("Your First favorite word is: " + firstWord);
            System.out.println("Your Second favorite word is: " + secondWord);
            System.out.println("Your Third favorite word is: " + thirdWord);
    }

            /* Question 3 */

}
