package myPractice;

public class AcctBalance {
    private String name;
    private double balance;

    public AcctBalance(String name, double balance){
        this.name = name;
        if (balance > 0.0){
            this.balance = balance;
        }
    }

    public void deposit (double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
    public double getBalance(){
        return  balance;
    }
    public String getName(){
        return  name;
    }
    public void withdraw (int depositt){
        if (balance >= depositt){
            balance = balance - depositt;
        }
    }
}
