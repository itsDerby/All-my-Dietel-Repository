package chapterTwo;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter an Integer value for the radius: ");
        int radius = scanner.nextInt();
        double pi = 3.14159;

        double diameter = 2 * radius;

        double circumference =2 * radius * pi;

        double radiusSquare = radius * radius ;

        double area = pi * radiusSquare ;

        System.out.printf("%s%f%n" , "The diameter = " , diameter );

        System.out.printf("%s%f%n" , "The Circumference = ", circumference);

        System.out.printf("%s%f%n" , "The Area = " , area);

    }
}
