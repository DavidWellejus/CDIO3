package group2.cdio3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class rollDieTest {
    
    @Test

    public void terningTest(){
        
        int numberOfRolls = 1000000;
        int[] values = new int[6];
        int acceptedRange = 2000;

        for(int i = 0; i < numberOfRolls; i++){
            int r = Die.rollDie();
            values[r-1]++;
        }

        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
            assertTrue(values[i] > (numberOfRolls/6)-acceptedRange && values[i] < (numberOfRolls/6)+acceptedRange);
        
        }
    }
}
