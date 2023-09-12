package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcctTest {
    @Test
            public void testDeposit(){
        //given I have an account
        Acct olaAcct = new Acct();
        //when I deposit 5k
        olaAcct.deposit(5000);
        //check balance is 5k
        int balance = olaAcct.checkBalance();
        assertEquals(5000, balance);
    }
    @Test
    public void testThatICanDepositTwice(){
        Acct olaAccount = new Acct();
        olaAccount.deposit(2000);
       olaAccount.deposit(3000);
       olaAccount.deposit(8000);
        int balance = olaAccount.checkBalance();
        olaAccount.checkBalance();
        assertEquals(13000 , balance);

    }
    @Test
    public void testThatICanWithdraw(){
        Acct olaAccount = new Acct();
        olaAccount.deposit(2500);
        olaAccount.withdraw(1000);

        int balance = olaAccount.checkBalance();
        assertEquals(1500, balance);
    }
    @Test
    public void naThiefYouBeOga(){
        Acct goWork = new Acct();
        goWork.deposit(2000);
        goWork.withdraw(10000);

        int balance = goWork.checkBalance();
        assertEquals(2000, balance);
    }
    @Test
    public void testNegativeWithdrawal(){
        Acct goWork = new Acct();
        goWork.deposit(2000);
        goWork.withdraw(-1000);

        int balance = goWork.checkBalance();
        assertEquals(2000, balance);
    }
}