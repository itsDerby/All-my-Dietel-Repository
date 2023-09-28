package FemiAssignment;

public class Function {


    public static int multiplyNumber(int number1, int number2) {
        boolean isnegative = number1 < 0 && number2 < 0;
        int total = 0;
        if (isnegative) {
            number2 = number2 * (-1);
            number1 = number1 * (-1);
            for (int count = 1; count <= number2; count++) {

                total = number1 + total;


            }
            return total;
        }
        if (number2 > 0) {
            for (int count = 1; count <= number2; count++) {


                total = number1 + total;

            }
            return total;

        } else {
           total = number2;

            for (int count = 1; count < number1; count++) {


                total = number2 + total;

            }


            return total;


        }
    }
}
