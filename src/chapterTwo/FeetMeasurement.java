package chapterTwo;

import java.util.Scanner;

public class FeetMeasurement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double oneFoot1 = 0.305;
        double result = feet * oneFoot1;


        System.out.printf("The value for %.2f%s%.2f%s%n", feet , " feet is " ,  result , " meters");

    }
}
