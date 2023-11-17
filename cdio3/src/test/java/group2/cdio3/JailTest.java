package group2.cdio3;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JailTest{
    Player playerTest = new Player("test",10,'T');

    Jail jailTest = new Jail("locked",0);

    @Test
    public void getDescriptionTest(){
        String description = jailTest.getDescription();

        assertTrue("jail".equals(description));
    }

    @Test
    public void startFieldEventTest(){
        int number = jailTest.startFieldEvent();
        assertTrue(number == 0);
    }

    @Test
    public void getOutOfJailTest(){
        Jail.getOutOfJail(playerTest);
        assertTrue(playerTest.account.getAccountBalance() == 9);

        playerTest.hasGetOutOfJailCard = true;
        Jail.getOutOfJail(playerTest);
        assertTrue(playerTest.account.getAccountBalance() == 9);
        assertTrue(playerTest.hasGetOutOfJailCard == false);
    }
}