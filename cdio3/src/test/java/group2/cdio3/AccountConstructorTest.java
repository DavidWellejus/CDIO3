package group2.cdio3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AccountConstructorTest {

    Account accountTest = new Account(1000);
    Account accountTest2 = new Account(1000);
    @Test

    public void AccountTest() {

        assertEquals(1000, accountTest.getAccountBalance());

    }

    @Test

    public void addToAccountBalanceTest() {

        accountTest.addToAccountBalance(500);
        assertEquals(1500, accountTest.getAccountBalance());

        accountTest.addToAccountBalance(0);
        assertEquals(1500, accountTest.getAccountBalance());

        boolean thrown = false;

        try {
            accountTest.addToAccountBalance(-1);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }

        assertTrue(thrown);

    }
    @Test

    public void subtractFromAccountBalanceTest(){


        accountTest2.subtractFromAccountBalance(500);
        assertEquals(500, accountTest2.getAccountBalance());

        accountTest2.subtractFromAccountBalance(0);
        assertEquals(500, accountTest2.getAccountBalance());

        boolean thrown = false;

        try{
            accountTest2.subtractFromAccountBalance(-1);
        } catch (IllegalArgumentException e){
            thrown = true;
        }

        assertTrue(thrown);
    }
}
