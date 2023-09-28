package chapt4and5;

public class SumInDigits {

    public static int returnsDigit(int number) {
        int firstDigit= number / 100;
        int firstDigitRemainder = number % 100;
        int secondNum = firstDigitRemainder % 10;
        int thirdDigit = secondNum / 10;
        int add = firstDigit + secondNum + thirdDigit;
        return add;

    }
}
