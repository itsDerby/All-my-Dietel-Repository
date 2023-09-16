package DieltelChpt4;

import Task.Task;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    @Test
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Task1 driver = new Task1();
            System.out.println("Please enter the number of trips: ");
            int numberOfTrips = scanner.nextInt();
            int trip = 0;
            int total = 0;
            for(int i = 0; i < numberOfTrips ; i++ ){
                trip = i + 1;
                total = +driver.milesDriven;

                System.out.println("Enter the miles driven for trip " + trip +" :");
                int miles = scanner.nextInt();
                driver.setMilesDriven(miles);

                System.out.println("Enter the galon used for the trip " + trip +" :");
                int galon = scanner.nextInt();
                driver.setGalonsUsed(galon);

                driver.averageValue();

            }
        System.out.printf("%s%f%n", "The total average value is: ", driver.totalAverage());




            }
        }








