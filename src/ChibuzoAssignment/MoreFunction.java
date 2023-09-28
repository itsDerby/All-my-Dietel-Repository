package ChibuzoAssignment;

public class MoreFunction {
    public static boolean isEven(int number) {
        if (number %2==0){
            return true;
        }

        return false;
    }

    public static boolean isPrime(int number) {
        int counter = 0;
       for(int count = 1; count <= number; count++){
           int divide = number % count;
           if (divide == 0);
           counter++;
       }
       if(counter == 2) {
           return true;
       }
       return false;
    }

    public static int subtract(int number1 , int number2) {
        if (number1 > number2) {
            int result = number1 - number2;
            return result;
        }
        else {
            int result2 = number2 - number1;
            return result2;
        }


    }

    public static double divide(int number1, int number2) {
       if (number2 == 0){
           double divide = (double) number1 / 0 ;
           return 0;

       }
       else {
           double divide = (double) number1/number2;
           return divide;
       }


    }

    public static int factor(int number) {
        int result = 0;
        for(int count = 1 ; count <= number; count++){
            if(number % count ==0){
                result = result +1;
            }
        }
        return result;
    }


    public static boolean squareof(int squareNumber) {
        int squareRoot = (int) Math.sqrt(squareNumber);
        if(squareRoot - Math.sqrt(squareNumber) == 0)
        return true;

        return false;

    }

}
