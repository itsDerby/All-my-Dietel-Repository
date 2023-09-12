package chapterTwo;

import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long day = minutes / 1440;
        long year = day /365;

        System.out.print (minutes);

        System.out.printf(" minutes is approximately%f%s%f%s%n%n" , year , "years and" , day , "days");


    }
}
