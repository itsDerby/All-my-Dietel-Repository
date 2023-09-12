package tdd;

import java.util.Scanner;

public class Counters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum =0;

        while(count < 5){
            System.out.println("Enter score: ");
            int number = scanner.nextInt();

            sum = sum + number;
            count = count +1;
        }
        System.out.println(sum);

    }
}
