package group2.cdio3;

import org.junit.Test;

public class GameBoardTest {
    

    @Test
    //Constuctor for two players
    public void GameBoardConstructorTest() {

        Player testPlayer1 = new Player("Dog", 100, 'D');
        Player testPlayer2 = new Player(("Cat"), 100, 'C');
        GameBoard testGameBoard = new GameBoard(testPlayer1, testPlayer2);

        
    }
}
