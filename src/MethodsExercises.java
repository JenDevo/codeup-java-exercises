public class MethodsExercises {
    public static void main(String[] args){
        System.out.println(basicAddition(5, 9));
        System.out.println(basicSubtraction(10, 5));
        System.out.println(basicMultiplication(10, 10));
        System.out.println(basicDivision(10, 2));
        System.out.println(basicModulus(100, 3));
    }

    public static int basicAddition (int x, int y){
        return x + y;
    }

    public static int basicSubtraction (int x, int y){
        return x - y;
    }

    public static int basicMultiplication (int x, int y){
        return x * y;
    }

    public static int basicDivision (int x, int y){
        return x / y;
    }

    public static int basicModulus (int x, int y){
        return x % y;
    }
}
