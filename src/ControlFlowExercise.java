import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[] args){

        /* Loop basics */

        /* (A) WHILE-LOOP: Displays in console numbers 5-15 with "i is #" ex:"i is 5"*/
       /*  int i = 5;
        *       while (i <= 15){
        *           System.out.println("i is " + i);
        *           i++;
        *       }
        *
        *
        * SAME AS ABOVE BUT IN FOR LOOP
        *
        * for(int i = 5; i <=15; i++) {
            System.out.println("i is: " + i);
        }
        */

        /* (B) DO-WHILE: Count by 2's, start @zero and end @100 */
        /*    long i = 2;
            *       do {
            *           System.out.println(i);
            *           i = i * i;
            *       } while (i < 1000000);

         * FOR LOOP REFACTOR for above
            *       for (long i = 2; i < 1000000; i=i*i){
            *       System.out.println(i);
            *       }
            */

        /* Fizzbuzz */

//        for(int i = 1; i < 100; i++){
//            boolean three = (i % 3) == 0;
//            boolean five = (i % 5) == 0;
//
//            if(three && five){
//                System.out.println("FizzBuzz");
//            }else if (three){
//             System.out.println("Fizz");
//            }else if (five){
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }

        /* Display a table of powers */
//        Scanner userScan = new Scanner(System.in);
//        boolean confirm = true;
//        do {
//
//        System.out.println("Enter a number: ");
//        int userInput = userScan.nextInt();
//
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | ------");
//BELOW: %-7d -=left justified, #=spaces taken up, d=digit, %=format
//        for(int i = 1; i <= userInput; i++){
//            System.out.printf("%-7d|%-9d|%-7d\n", i, i*i, i*i*i);
//        }
//        System.out.println("Would you like to continue? (Y/N)");
//        confirm = userScan.next().equalsIgnoreCase("y");
//        } while (confirm);

        /* Convert int grad to letter grade */
        Scanner userScan = new Scanner(System.in);
        boolean confirm;

        do{
        System.out.println("Enter any number, 0-100: ");
        int intGrade = userScan.nextInt();

        if(intGrade <= 59){
            System.out.println("F");
        }else if(intGrade <= 66){
            System.out.println("D");
        } else if (intGrade <= 79) {
            System.out.println("C");
        }else if(intGrade <= 87){
            System.out.println("B");
        }else{
            System.out.println("A");
        }

            System.out.println("Would you like to continue? (Y/N)");
        confirm = userScan.next().equalsIgnoreCase("y");
        }while(confirm);
    }
}
