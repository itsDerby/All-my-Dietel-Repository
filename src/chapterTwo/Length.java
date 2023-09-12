package chapterTwo;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of v in meters/second (m/s)");
        double valueOfV = input.nextDouble();
        double result1 = valueOfV * valueOfV;

        System.out.println("Enter the acceleration a in meters/second (m/s)");
        double valueOfAcceleration = input.nextDouble();

        double result2 = 2 * valueOfAcceleration;

        double result3= result1 / result2 ;

        System.out.printf("The minimum runway length for this airplane is  %f", result3);
    }
}
