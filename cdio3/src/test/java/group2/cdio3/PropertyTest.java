package group2.cdio3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class PropertyTest{
    Player player1 = new Player("cat", 20, 'C');
    Property test = new Property(2, false, "blue", player1, 2, "Pizza");

@Test
public void getDescriptionTest(){
    assertEquals("blue Pizza 2",test.getDescription());
}
}