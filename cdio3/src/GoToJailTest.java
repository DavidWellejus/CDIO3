
    import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GoToJailTest {
    
    GoToJail goToJailTest = new GoToJail("Go to jail",6 );


    @Test
    public void getDescriptionTest(){
         assertEquals("Go to jail", goToJailTest.getDescription());
         System.out.println(goToJailTest.getDescription());

    }
    @Test
    public void startFieldEvent(){
        int[] testArray = goToJailTest.startFieldEvent();

        assertEquals(1, testArray[3]);
    }    
}


