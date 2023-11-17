package group2.cdio3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PropertyTest{
    
    Property test = new Property("Pizza", 2, 2, "blue");

    @Test
    public void getDescriptionTest(){
        assertEquals("Pizza blue 2", test.getDescription());
    }
    
}
