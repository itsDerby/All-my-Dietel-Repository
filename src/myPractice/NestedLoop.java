package myPractice;

public class NestedLoop {
    public static void main(String[] args) {
        for(int count = 1; count <= 10; count++){

            System.out.println( count);
            for (int count2 = 1; count2 <= count; count2++){
                int result2 = 2* count2;
                System.out.print(result2 + "   ");
            }
        }
    }
}
