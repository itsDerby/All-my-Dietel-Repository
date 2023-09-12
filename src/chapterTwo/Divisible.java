package chapterTwo;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Please Enter Any Integer: ");
        int number = scanner.nextInt();

        if(number % 3==0){
            System.out.println("This number is divisible by 3");
        }

        else{
            System.out.println("This number is not divisible by 3");
        }

    }
}

