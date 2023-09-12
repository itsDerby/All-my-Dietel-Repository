package chapt4and5;

import java.util.Scanner;

public class FutureDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int todaysDate = scanner.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int futureDate = scanner.nextInt();

        int result = (todaysDate+futureDate) % 7;

        switch(todaysDate){
            case 0:
                System.out.print("Today is Sunday");
                break;
            case 1:
                System.out.print("Today is Monday");
                break;
            case 2:
                System.out.print("Today is Tuesday");
                break;
            case 3:
                System.out.print("Today is Wednesday");
                break;
            case 4:
                System.out.print("Today is Thursday");
                break;
            case 5:
                System.out.print("Today is Friday");
                break;
            case 6:
                System.out.print("Today is Saturday");
                break;

        }
            switch (result){
                case 0:
                    System.out.println(" and the future date is Sunday");
                    break;
                case 1:
                    System.out.println(" and the future date is Monday");
                    break;
                case 2:
                    System.out.println(" and the future date is Tuesday");
                    break;
                case 3:
                    System.out.println(" and the future date is Wednesday");
                    break;
                case 4:
                    System.out.println(" and the future date is Thursday");
                    break;
                case 5:
                    System.out.println(" and the future date is Friday");
                    break;
                case 6:
                    System.out.println(" and the future date is Saturday");
                    break;

            }



    }
}
