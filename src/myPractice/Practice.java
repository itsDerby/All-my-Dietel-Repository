package myPractice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 1;
        while(count <= 10){
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            total = total+ grade;
            count = count+1;
        }
        int average = total/10;
        System.out.println(total);
        System.out.println(average);
    }
}
