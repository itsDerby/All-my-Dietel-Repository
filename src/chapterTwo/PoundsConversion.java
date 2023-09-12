package chapterTwo;

import java.util.Scanner;

public class PoundsConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double constant = 0.603;

        System.out.println("Enter a number in Pounds");

        double number = input.nextDouble();

        double result = number * constant ;

        System.out.print( number );
        System.out.printf("pounds is  %f %s%n  " ,  result ,  " kilograms");
    }
}
