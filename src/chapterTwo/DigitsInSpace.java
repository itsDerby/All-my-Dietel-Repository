package chapterTwo;

import java.util.Scanner;

public class DigitsInSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Five Numbers: ");
        int inputN = scanner.nextInt();


        int inputN1 = inputN / 10000;
        int inputN2 = inputN % 10000;

        int secondNumber = inputN2 / 1000;
        int remainingNumber2 = inputN2 % 1000;

        int thirdNumber = remainingNumber2/ 100;
        int remainingNumber3 = remainingNumber2 % 100;

        int fourthNumber = remainingNumber3 /10 ;
        int remainingNumber4 = remainingNumber3 % 10;

        int fifthNumber = remainingNumber4 % 10;



        System.out.printf("%d   %d   %d   %d   %d", inputN1, secondNumber, thirdNumber, fourthNumber, fifthNumber);

    }
}
