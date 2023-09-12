package tdd;

public class Acct {
    private int balance;


    public void deposit(int amount){

        balance = balance + amount;
    }
    public void withdraw(int amount){
        if (balance >= amount){
            if(amount >= 0){
                balance = balance - amount;
            }
        }

    }
    public int checkBalance(){
        return balance;

    }
}
