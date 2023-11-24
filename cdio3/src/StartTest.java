

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

        int[] testArray = testStartField.startFieldEvent();
        int[] testArray2 = new int[]{0,0,0};
        for(int i = 0; i < testArray.length; i++){
            assertEquals(testArray[i], testArray2[i]);
        }
    }
}
