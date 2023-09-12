package Jonathan;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;

       int compareVariable = firstNumber;
       firstNumber = secondNumber;
        secondNumber = thirdNumber;
        thirdNumber = compareVariable;


        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);

    }
}
