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

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
             System.out.println("Buzz");
            }else if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            }else {
                System.out.println(i);
            }
        }

        /* Display a table of powers */
    }
}
