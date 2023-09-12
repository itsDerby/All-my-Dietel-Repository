package tdd;

public class Account {
    private int balance;


    public void deposit(int amount) {

        balance = balance + amount;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public int checkBalance() {

        return balance;
    }


}
