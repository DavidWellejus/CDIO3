package group2.cdio3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AccountConstructorTest {
    

        Account accountTest = new Account(1000);
    
    
    @Test

    public void AccountTest(){

        assertEquals(1000, accountTest.getAccountBalance());
        

    }
}
