package myTask;

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println(sum(1,10));
    }
    public static int sum(int count1, int count2){
        int sums = 0;
        for (int count= count1;  count <= count2; count++) {
            sums += count;

        }
        return sums;
    }
    public static int max(int number1, int number2){
        int maxs = 0;
        if (number1 > number2){
            maxs = number1;
        }
        else {
            maxs = number2;
        }
        return maxs;

    }



}
