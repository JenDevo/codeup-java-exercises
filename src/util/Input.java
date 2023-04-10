package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){

        System.out.println("Enter string\n");
        return scanner.nextLine();
    }
    boolean yesNo(){
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        }


        /* Refactored for Exceptions and Error handling exercise */
    int getInt(){
            try {
                int intInput = Integer.valueOf(getString());
                return intInput;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. " + e);
                return 0;
            }
        }

//    public int getInt(int min, int max){
//        int userInt;
//        do{
//            System.out.printf("Enter a whole number between %d and %d \n", min, max);
//            userInt = scanner.nextInt();
//        }while (userInt > max || userInt < min);
//        return userInt;
//    }

    /* Refactored for Exceptions and Error handling exercise */
    public double getDouble() {
        try {
            double doubleInt = Double.valueOf(getString());
            return doubleInt;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. " + e);
            return 0;
        }


//    double getDouble(double min, double max){
//        Double userDouble;
//        do{
//            System.out.printf("Enter a decimal number between %d and %d\n", min, max);
//            userDouble = scanner.nextDouble();
//        }while (userDouble > max || userDouble < min);
//        return userDouble;
//    }


    }
}

