package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    @Test
    public void testThatAccountCanDeposit(){
        //given
        Account isrealAccount = new Account();
        //when
        isrealAccount.deposit(5000);
        //check
        assertEquals(5000,isrealAccount.checkBalance());
    }
    @Test
    public void testThatAccountCanDepositTwice() {
        Account temiAccount = new Account();

        temiAccount.deposit(2000);

        assertEquals(2000, temiAccount.checkBalance());

        temiAccount.deposit(5000);

        assertEquals(7000, temiAccount.checkBalance());


    }
    @Test
    public void testThatAccountCanWithdraw(){
      Account ifeAccount = new Account();
      ifeAccount.deposit(2500);

      ifeAccount.withdraw(1500);
     ifeAccount.checkBalance();
     assertEquals(1000,ifeAccount.checkBalance() );

    }


    }




