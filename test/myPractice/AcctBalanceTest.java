package myPractice;

import java.util.Scanner;

class AcctBalanceTest {
    public static void main(String[] args) {
        AcctBalance ola = new AcctBalance("Joseph Jane" , 50.00);
        AcctBalance tolani = new AcctBalance("John Wick", -7.53);

        System.out.printf("%s balance : $%.2f%n" , ola.getName(), ola.getBalance());
        System.out.printf("%s balance : $%.2f%n" , tolani.getName(), tolani.getBalance());



        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the deposit amount for ola: ");
        double depositAmount1 = scanner.nextDouble();
        System.out.printf("%nadding %.2f to Ola %n%n" , depositAmount1);
        ola.deposit(depositAmount1);
        System.out.print("Enter deposit amount for Tolani account: ");
        double depositAmount2 = scanner.nextDouble();
        System.out.printf("%nadding %.2f to Tolani balance%n%n" , depositAmount2);
        tolani.deposit(depositAmount2);

        System.out.printf("%s balance: $%.2f%n" , ola.getName(), ola.getBalance());
        System.out.printf("%s balance: $%.2f%n%n" , tolani.getName() , tolani.getBalance());

        ola.withdraw(4000);
        System.out.println(ola.getBalance());


    }

}