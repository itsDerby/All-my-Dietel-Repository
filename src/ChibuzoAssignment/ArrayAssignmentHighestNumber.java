package ChibuzoAssignment;

import java.util.Scanner;

public class ArrayAssignmentHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] score = new int[10];
        int count;
        for(count = 0; count < score.length; count++ ){
            System.out.println("Enter scores: " + (count + 1) + " : ");
            score[count] = scanner.nextInt();
        }
        int largest = score[0];
        for (count = 0; count < score.length; count++){
            if (largest < score[count]) largest = score[count];
        }
        System.out.println("The Largest score is " +largest);
    }
}
