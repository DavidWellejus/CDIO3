

import org.junit.Test;


import static org.junit.Assert.assertTrue;
public class RollCupTest {
    @Test

    public void diceSideTest(){
        int min = 1;
        int max = 6;
        int numberOfRolls = 1000;

        for(int i = 0; i < numberOfRolls; i++) {
            int side = RollCup.rollDie();
            System.out.println(side);
            assertTrue(side >= min && side <= max);
    }
        }
        
}
