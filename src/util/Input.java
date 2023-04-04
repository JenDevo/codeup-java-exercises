package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    String getString(){
        System.out.println("Enter string\n");
        return scanner.nextLine();
    }
    boolean yesNo(){
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        }

    int getInt(){
        return scanner.nextInt();
    }

    int getInt(int min, int max){
        int userInt;
        do{
            System.out.printf("Enter a whole number between %d and %d \n", min, max);
            userInt = scanner.nextInt();
        }while (userInt > max || userInt < min);
        return userInt;
    }

    public double getDouble(){
        return scanner.nextDouble();
    }

    double getDouble(double min, double max){
        Double userDouble;
        do{
            System.out.printf("Enter a decimal number between %d and %d\n", min, max);
            userDouble = scanner.nextDouble();
        }while (userDouble > max || userDouble < min);
        return userDouble;
    }



}

