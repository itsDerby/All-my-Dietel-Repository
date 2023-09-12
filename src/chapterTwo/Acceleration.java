package chapterTwo;

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of Initial Velocity");
        double velocity = input.nextDouble();
        double result1 =velocity * velocity;

        System.out.println("Enter the value for acceleration");
        double valueOfAcceleration = input.nextDouble();
        double result2 = 2 * valueOfAcceleration;

        double length = result1 / result2 ;

        System.out.printf("The length is %.2f ", length );

    }
}
