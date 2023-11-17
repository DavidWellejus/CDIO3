package group2.cdio3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StartTest {

    @Test

    public void TestGetDescription() {

        Field testStartField = new Start("start", 0);

        assertEquals(testStartField.getDescription(), "START");
    }
}
