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
}
