package myPractice;

public class NestedMultiplication {
    public static void main(String[] args) {
        for (int count = 1; count <= 5; count++){

            for(int count2 =1; count2 <= 5; count2++){
                System.out.printf("%2d" , (count *  count2));
            }
            System.out.println();

        }
    }
}
