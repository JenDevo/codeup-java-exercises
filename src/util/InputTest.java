package util;

public class InputTest {
    public static void main(String[] args){
        Input input = new Input();
        String myString = input.getString();
        System.out.println("You entered: " + myString);

        System.out.println("Is cold weather your favorite type of weather?\n");
        boolean coldWeather = input.yesNo();
        System.out.println("Cold weather? = " + coldWeather);

        System.out.println("Enter a whole number.");
        int myInt = input.getInt();
        System.out.println("Your whole number = " + myInt);


        int myInteger = input.getInt(16, 35);
        System.out.println("You picked the integer " + myInteger);

        System.out.println("Enter a decimal number ");
        double myDouble = input.getDouble();
        System.out.println("Your decimal number = " + myDouble);


//        double myDouble2 = input.getDouble(1, 50);
//        System.out.println("Your double is " + myDouble2);
    }
}
