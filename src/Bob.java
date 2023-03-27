import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        boolean user = true;

        while (user) {

            System.out.print("Talk to Bob below: ");
        String input = userInput.nextLine();
            if(input.endsWith("?")){
                System.out.println("Sure");
            }else if (input.endsWith("!")){
                System.out.println("Whoa chill out!");
            }else if (input == ("")){
                System.out.println("Fine. Be that way!");
            }else{
                System.out.println("Whatever.");
            }
        }
    }
}