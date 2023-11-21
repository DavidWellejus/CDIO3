package group2.cdio3;

public class Game {

    public static void playGame(Player[] playerArr, GameBoard gameBoard){
        boolean gameOnGoing = true;

        while(gameOnGoing){
            for(int i = 0; i < playerArr.length; i++){

                System.out.println("It is " + playerArr[i].figureName + "'s turn.");
                if(playerArr[i].IsInJail){
                    Jail.getOutOfJail(playerArr[i]);
                }

                int dieValue = RollCup.rollDie();
                System.out.println("You have rolled " + dieValue + ".");
                Field landOnField = gameBoard.movePlayerFigure(playerArr[i], dieValue);
                System.out.println("You have landed on " + landOnField.getDescription() + ".");
                int [] fieldOutCome = landOnField.startFieldEvent();
                if(fieldOutCome.length == 4){
                    //Hardcodeed distance to jail value
                    gameBoard.movePlayerFigure(playerArr[i], 12);
                    playerArr[i].IsInJail = true;
                }



                if(playerArr[i].account.getAccountBalance() < 0){
                    gameOnGoing = false;
                }
            }
        }
        
    }
}
