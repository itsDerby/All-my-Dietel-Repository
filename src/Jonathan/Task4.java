package Jonathan;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        int x = a + 10;
        int y = a - 10;
        int z = a % 10;

        int result = a/(x*y*z);

        System.out.println(result);
    }
}
