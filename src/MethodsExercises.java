import javax.print.MultiDocPrintService;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        /* Basic arithmetic */
//        System.out.println(basicAddition(5, 9));
//        System.out.println(basicSubtraction(10, 5));
//        System.out.println(basicMultiplication(10, 10));
//        System.out.println(basicDivision(10, 2));
//        System.out.println(basicModulus(100, 3));

        /* #2 Number range with user input */
//        int userInput = getInteger(1, 40);
//        System.out.printf("\nYour number is %d ", userInput);

        getFactorial();
        diceRoll();

    }


    /* Basic arithmetic */
    public static int basicAddition(int x, int y) {
        return x + y;
    }

    public static int basicSubtraction(int x, int y) {
        return x - y;
    }

    public static int basicMultiplication(int x, int y) {
        return x * y;
    }

    /* If we divide by zero then we receive an error */
    public static int basicDivision(int x, int y) {
        return x / y;
    }

    public static int basicModulus(int x, int y) {
        return x % y;
    }

    /* #2 Number Range with user input */
    public static int getInteger(int min, int max) {
        Scanner inputScan = new Scanner(System.in);

        System.out.printf("Enter a number that is equal to or between %d and %d: ", min, max);
        int userNumber = inputScan.nextInt();

        if (userNumber > max || userNumber < min) {
            System.out.printf("Whoops! Please enter a number that is equal to or between %d and %d \n", min, max);
            return getInteger(min, max);
        }
        System.out.printf("Yay! %d is a valid number ", userNumber);
        return userNumber;
    }


    /* Calculate Factorial of number */

    public static void getFactorial() {
        Scanner userNumScan = new Scanner(System.in);
        String confirm;

        do {
            int userInteger = getInteger(1, 10);
            long userFactorial = 1;

            System.out.print("\n" + userInteger + "! = ");
            for (int i = 1; i <= userInteger; i++) {
                userFactorial *= i;
                if (i == userInteger) {
                    System.out.printf("%d = ", i);
                } else {
                    System.out.printf("%d x ", i);
                }
            }
            System.out.println(userFactorial);
            System.out.println("Would you like to continue? (yes/no)");
            confirm = userNumScan.next();
        } while (confirm.equalsIgnoreCase("yes"));
    }

    public static void diceRoll(){
        Scanner userScan = new Scanner (System.in);
        System.out.println("How many sides are on your dice?");
        int diceSides = userScan.nextInt();
        int dice1 = (int) (Math.random() * diceSides) + 1;
        int dice2 = (int) (Math.random() * diceSides) + 1;

        System.out.printf("%d is what the first dice rolled \n%d is what the second dice rolled", dice1, dice2);
    }

}