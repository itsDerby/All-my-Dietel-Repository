package chapterTwo;

import java.util.Scanner;

public class ArithmeticCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the First Integer: ");
        int firstInteger = scanner.nextInt();

        System.out.print("Enter the Second Integer: ");
        int secondInteger = scanner.nextInt();

        int squareFirstInteger = firstInteger * firstInteger ;
        int squareSecondInteger = secondInteger * secondInteger;

        int sumOfSquare = squareFirstInteger + squareSecondInteger;

        int differenceOfSquare = squareFirstInteger - squareSecondInteger ;

        System.out.printf("%s%d%n" , "The Square of the First Integer is :" , firstInteger);
        System.out.printf("%s%d%n" , "The Square of the Second Integer is : ", secondInteger);
        System.out.printf("%s%d%n" , "The Sum of their square is: " , sumOfSquare);
        System.out.printf("%s%d%n" , "The Difference of the Square is: " , differenceOfSquare);
    }
}
