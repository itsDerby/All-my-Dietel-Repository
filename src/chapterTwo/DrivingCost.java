package chapterTwo;

import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the driving distance:");
        //costOfDriving = (distance / milesPerGallon) * pricePerGallon;

        double distance = input.nextDouble();

        System.out.println("Enter miles per gallon:");

        double milesPerGallon = input.nextDouble();

        System.out.println("Enter the price per gallon");

        double pricePerGallon = input.nextDouble();

        double result = (distance / milesPerGallon) * pricePerGallon;

        System.out.printf("The cost of driving is:%s%n" , result);


    }
}
