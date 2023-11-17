package group2.cdio3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StartTest {

    @Test

    public void testGetDescription() {

        Field testStartField = new Start("start", 0);

        assertEquals(testStartField.getDescription(), "START");
        
    }

    @Test

    public void testStartFieldvent() {

        Field testStartField = new Start("start", 0);

        assertEquals(testStartField.startFieldEvent(), 0);
    }
}
