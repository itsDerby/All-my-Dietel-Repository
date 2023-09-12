package chapterTwo;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first point");
        double side1 = input.nextDouble();

        System.out.println("Enter the second point");
        double side2 = input.nextDouble();

        System.out.println("Enter the third point");
        double side3 = input.nextDouble();

        double result1 = (side1 + side2 + side3)/2;

        double result2 = result1*(result1 - side1) * (result1 - side2) * (result1 - side3);

        double area = Math.sqrt(result2);

        System.out.printf("The area of the triangle is %f" , area);

    }
}
