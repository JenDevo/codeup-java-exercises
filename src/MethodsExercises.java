import javax.print.MultiDocPrintService;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        /* Basic arithmetic */
        System.out.println(basicAddition(5, 9));
        System.out.println(basicSubtraction(10, 5));
        System.out.println(basicMultiplication(10, 10));
        System.out.println(basicDivision(10, 2));
        System.out.println(basicModulus(100, 3));

        /* #2 Number range with user input */
        int userInput = getInteger(1, 40);
        System.out.printf("\nYour number is %d ", userInput);
    }


    /* Basic arithmetic */
    public static int basicAddition (int x, int y){
        return x + y;
    }

    public static int basicSubtraction (int x, int y){
        return x - y;
    }

    public static int basicMultiplication (int x, int y){
        return x * y;
    }

    /* If we divide by zero then we receive an error */
    public static int basicDivision (int x, int y){
        return x / y;
    }

    public static int basicModulus (int x, int y){
        return x % y;
    }

    /* #2 Number Range with user input */
    public static int getInteger (int min, int max){
        Scanner inputScan = new Scanner(System.in);

        System.out.printf("Enter a number that is equal to or between %d and %d: ", min, max);
        int userNumber = inputScan.nextInt();

        if (userNumber > max || userNumber < min){
            System.out.printf("Whoops! Please enter a number that is equal to or between %d and %d \n", min, max);
            return getInteger(min, max);
        }
        System.out.printf("Yay! %d is a valid number", userNumber);
        return userNumber;
    }
}
