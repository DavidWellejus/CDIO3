package group2.cdio3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PropertyTest{
    
    Property test = new Property("Pizza", 2, 2, "blue");

    @Test
    public void getDescriptionTest(){
        assertEquals("Pizza blue 2", test.getDescription());
    }
    @Test
    public void buyPropertyTest(){
        assertEquals(2, test.buyProperty());
    }
    @Test
    public void getFieldColourTest(){
        assertEquals("blue", test.getFieldColour());
    }
    @Test
    public void startFieldEventTest(){
        int[] testArray = new int[]{2,0,0};
        int[] sFEArray = test.startFieldEvent();
        for (int i = 0; i < testArray.length; i++){
            assertEquals(testArray[i], sFEArray[i]);
        }
    }
}
