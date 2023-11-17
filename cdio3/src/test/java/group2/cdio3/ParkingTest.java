package group2.cdio3;

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
        assertEquals(0, parkingTest.startFieldEvent());
    }
}
