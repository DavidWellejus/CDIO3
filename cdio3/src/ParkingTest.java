

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ParkingTest {
    Parking parkingTest = new Parking("Parking", 12);

    @Test
    public void getDescriptionTest(){
        assertEquals("Free parking",parkingTest.getDescription());

    }
    @Test
    public void startFieldEvent(){
        int[] testArray = parkingTest.startFieldEvent();
        int[] testArray2 = new int[]{0,0,0};
        for(int i = 0; i < testArray.length; i++){
            assertEquals(testArray[i], testArray2[i]);
        }
        
        
    }
}
