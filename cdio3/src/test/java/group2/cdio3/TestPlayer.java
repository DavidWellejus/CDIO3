package group2.cdio3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class TestPlayer {

    @Test
    public void TestPlayerConstructor(){

        Player testPlayer = new Player("Car", 10, 'C');

        assertEquals("Car", testPlayer.figureName);
        assertEquals(10, testPlayer.account.getAccountBalance());
        assertEquals('C', testPlayer.figureSymbol);
        assertFalse(testPlayer.hasGetOutOfJailCard);
        assertFalse(testPlayer.IsInJail);

    }




}