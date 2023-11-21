package group2.cdio3;

public class Game {

    public static void playGame(Player[] playerArr){
        boolean gameOnGoing = true;

        while(gameOnGoing){
            for(int i = 0; i < playerArr.length; i++){
                if(playerArr[i].account.getAccountBalance() < 0){
                    gameOnGoing = false;
                }
            }
        }
        
    }
}
