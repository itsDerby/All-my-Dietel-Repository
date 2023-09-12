package tdd;

import java.util.Scanner;

//A = 90 to 100
//B = 80 to 89
//c = 70 to 79
//D = 60 to 69
//F = less than 60
public class Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if(number >= 90 && number <= 100) System.out.println("A");
        if (number >= 80 && number <= 89) System.out.println("B");
        if (number >= 70 && number <= 79) System.out.println("C");
        if (number >= 60 && number <= 69) System.out.println("D");
        if (number < 60) System.out.println("F");


    }
}