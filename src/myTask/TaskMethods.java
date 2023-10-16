package myTask;

public class TaskMethods {
    public static void main(String[] args) {
        max(4,5);
        System.out.println(gcd(45, 75));

    }
    public static void max(int value1, int value2){
        int maxi = 0;
        if (value1 > value2){
            System.out.println(value1);
        }
        else {
            maxi = value2;
            System.out.println(value2);
        }


    }
    public static int gcd(int num1, int num2){
        int gcd = 1;
        int value = 2;
        while(value <= num1 && value <= num2){
            if(num1 % value == 0 && num2 % value == 0)
                gcd = value;
            value++;
        }
        return gcd;
    }

}
