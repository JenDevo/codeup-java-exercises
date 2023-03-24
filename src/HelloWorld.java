public class HelloWorld {
    public static void main (String[] args){
        System.out.print("Hello, World!\n");
        /* Added a new line above so that when favorite number was printed it started on new line */

        /* SYNTAX< TYPES< VARIABLES: Question 1 */
        int myFavoriteNumber = 16;
                System.out.println(myFavoriteNumber);

        /* Question 2 */
        String myString = "Hello there from this new string!";
                System.out.println(myString);

        /* Question 3 - string doesn't take in char*/
                /** myString = 'H';
                System.out.println(myString);
                */

        /* Question 4 - string doesn't work w numbers */
                /**myString = 3.14159;
                System.out.println(myString);
                */

        System.out.println("======spacing=======");

        /* Question 5-9 */
        double myNumber = 3.14;
        System.out.println(myNumber);

        int myChangedNumber = (int)myNumber;
        System.out.println(myChangedNumber);
        /*  long myNumber = 123;  */
        /*   long myNumber = 123L;  */
            /*   myNumber = 3.14;   */
            /*   System.out.print(myNumber);   */

        System.out.println("======spacing=======");

        /* Question 10 - Increment and decrement */
        int x = 5;
        System.out.println(x++);
        /* above x is incremented after the variable so output=5 until x called again */
        System.out.println(x);
        /* Above output = 6 due to post increment in first call */

        int x2 = 5;
        System.out.println(++x2);
        System.out.println(x2);

        System.out.println("======spacing=======");

        /* Question 12 */
       /** String theNumberThree = "three";
        * Object o = theNumberThree;
        * int three = (int) o;
        */
       /* int three = (int) "three"; */
        /* ERROR for both commented out above I believe due to int and string not correlating*/

        /* Question 13 */
        /* Shorthand Assignment Operators */
        int x3 = 4;
        x3 += 5;
        System.out.println(x3);


        int x4 = 3;
        int y = 4;
        y *= x4;
        System.out.print(y);


        int x5 = 10;
        int y2 = 2;
        x5 /= y2;
        System.out.println(x5);
        y2 -= x5;
        System.out.println(y2);

        System.out.println("======spacing=======");

        /* Question 14 */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println("======spacing=======");

        /*BONUS*/
        int myInt = 42;
        Integer myInteger = 42;
        System.out.println(myInt);
        System.out.println(myInteger);
    }
}
