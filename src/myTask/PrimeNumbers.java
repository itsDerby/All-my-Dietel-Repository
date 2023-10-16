package myTask;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        primeNumbers(50);

    }
    public static void primeNumbers(int number){
        int count = 0;
        int no = 2;

        while (count < number){
            if (isPrime(50)){
                count++;
            }
            if (count % number == 0){
                System.out.printf("%-5s\n", number);
            }
            else{
                System.out.printf("%-5s", number);
            }
            number++;

        }



    }
    public static boolean isPrime(int numberVerify){
        for (int i = 2; i <= numberVerify/2 ; i++) {
            if (numberVerify % i == 0){
                return false;
            }


        }
        return true;
    }
}
