package group2.cdio3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameBoardTest {
    
    Player testPlayer1 = new Player("Dog", 100, 'D');
    Player testPlayer2 = new Player("Cat", 100, 'C');
    GameBoard testGameBoard = new GameBoard(testPlayer1, testPlayer2);

    @Test
    //Constuctor for two players
    public void GameBoardConstructorTest() {

        assertEquals(0, testGameBoard.getFieldNumber(testPlayer1));
    }

    @Test

    public void movePlayerFigureTest() {

        testGameBoard.movePlayerFigure(testPlayer1, 5, false);

        assertEquals(5, testGameBoard.getFieldNumber(testPlayer1));
    }
    @Test

    public void setFieldOwnerAndGetFieldOwnerTest(){
        testGameBoard.setFieldOwner(5,testPlayer1);
        assertEquals(testPlayer1.getName(), testGameBoard.getFieldOwner(5).getName());

    }

    @Test
    public void testSameOwnerAllOwned() {
        // Antag at player1 ejer alle brune felter
        testGameBoard.setFieldOwner(1, testPlayer1);
        testGameBoard.setFieldOwner(2, testPlayer1);

        // Flyt player1 til et brunt felt
        testGameBoard.movePlayerFigure(testPlayer1, 1, false);

        assertTrue("Player1 bør ikke eje alle brune felter", testGameBoard.sameOwner(testPlayer1));
    }

    @Test
    public void testSameOwnerNotAllOwned() {
        // Antag at player1 ejer et brunt felt, og player2 ejer et andet
        testGameBoard.setFieldOwner(1, testPlayer1);
        testGameBoard.setFieldOwner(2, testPlayer2);

        // Flyt player1 til et brunt felt
        testGameBoard.movePlayerFigure(testPlayer1, 1, false);

        assertFalse("Player1 bør ikke eje alle brune felter", testGameBoard.sameOwner(testPlayer1));
    }

    @Test
    public void testSameOwnerNoOwner() {
        // Ingen ejer brune felter
        // Flyt player1 til et brunt felt
        testGameBoard.movePlayerFigure(testPlayer1, 1, false);

        assertFalse("Ingen bør eje brune felter", testGameBoard.sameOwner(testPlayer1));
    }

    // Yderligere testtilfælde kan tilføjes her...
}

