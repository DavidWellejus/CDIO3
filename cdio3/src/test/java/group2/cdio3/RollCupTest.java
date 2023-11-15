package group2.cdio3;

import org.junit.Test;


import static org.junit.Assert.assertTrue;
public class RollCupTest {
    @Test

    public void diceSideTest(){
        int min = 1;
        int max = 6;
        int side = RollCup.rollDie();
        System.out.println(side);
        assertTrue(side >= min && side <= max);
    }
}
