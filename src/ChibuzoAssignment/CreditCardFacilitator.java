package ChibuzoAssignment;

import java.util.Scanner;

public class CreditCardFacilitator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Kindly Enter your details to verify ");
        String userDetails = scanner.nextLine();
        if (cardValidity(userDetails)) {
            System.out.println("The card number " + userDetails + " is valid.");
            System.out.println("The length of the digit is " + userDetails.length() + ".");
            System.out.println("The card type is " + checkCardType(userDetails) + ".");
        } else {
            System.out.println("The card number " + userDetails + " is invalid.");
        }
    }


    public static int cardNumber(String cardDetails) {
        int[] cardNo = new int[cardDetails.length()];
        for (int index = 0; index < cardDetails.length(); index++) {

            cardNo[index] = Integer.parseInt(String.valueOf((cardDetails.charAt(index))));

        }

        return cardNo[0];
    }

    public static boolean cardLengthNumber(String lengthOfCard) {
        int length = lengthOfCard.length();
        if (length >= 13 && length <= 16) {
            return true;
        } else {
            return false;
        }



    }

    public static boolean cardValidity(String cardNumber) {
        int[] cardCheck = new int[cardNumber.length()];
        for (int index = 0; index < cardCheck.length; index++) {
            cardCheck[index] = Integer.parseInt(cardNumber.substring(index, index + 1));
            System.out.println(cardCheck[index]);
        }
        for (int index = cardCheck.length - 2; index >= 0; index -= 2) {
            int add = 1;
            int result = cardCheck[index];
            result *= 2;
            if (result > 9) add = result % 10 + add;
            cardCheck[index] = add;
        }
        int sum = 0;
        for (int index = 0; index < cardCheck.length; index++) {
            if (sum % 10 == 0) sum += index;
            System.out.println(sum);
        }
        System.out.println(sum);
        return sum % 10 == 0;

    }

    public static String checkCardType(String cardNumber) {
        if (cardNumber.startsWith("4")) {
            return "Visa";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("37")) {
            return "American Express Card";
        } else if (cardNumber.startsWith("6")) {
            return "Discover card";
        }

        return checkCardType(null);


    }
}




