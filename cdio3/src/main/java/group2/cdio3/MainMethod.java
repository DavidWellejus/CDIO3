package group2.cdio3;
import java.util.Scanner;
public class MainMethod {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfPlayers = 0;
        while (numberOfPlayers == 0){
            System.out.println("How many players will participate in the game?");
            String input = scanner.nextLine();
            try {
                numberOfPlayers = Integer.valueOf(input);
                if (numberOfPlayers < 2 || numberOfPlayers > 4){
                    numberOfPlayers = 0;
                    throw new IllegalArgumentException();
                }
            }
            catch (NumberFormatException e){
                System.out.println(input + " is not an integer!");
            }
            catch (IllegalArgumentException e){
                System.out.println("The game only supports 2-4 players!");
            }
        }
        int amount = 0;
        if(numberOfPlayers == 2){
            amount = 20;
        }else if(numberOfPlayers == 3){
            amount = 18;
        }else{
            amount = 16;
        }    
        String[] pieces = {"The Honeybadger", "Manbearpig", "Pimp Master 3000", "Queen"};
        Player[] playerArr = new Player[numberOfPlayers];
        for (int i = 0; i < playerArr.length; i++){
            boolean created = false;
            while (!created){
                System.out.println("Please enter a number to select a piece from the following list:");
                for (int j = 0; j < pieces.length; j++){
                    System.out.println(j+1 + ": " + pieces[j]);
                }
                int playerPiece = 0;
                try {
                    playerPiece = scanner.nextInt();
                    if (playerPiece < 1 || playerPiece > 4){
                        throw new Exception();
                    }
                    char symbol = pieces[playerPiece].charAt(0);
                    playerArr[i] = new Player(pieces[playerPiece], amount, symbol);
                    created = true;
                }
                catch (Exception e){
                    System.out.println("Please enter a number between 1-4!");
                }
            }   
        }
        GameBoard gameBoard;
        if (numberOfPlayers == 2){
            gameBoard = new GameBoard(playerArr[0], playerArr[1]);
        }
        else if (numberOfPlayers == 3){
            gameBoard = new GameBoard(playerArr[0], playerArr[1], playerArr[2]);
        }
        else{
            gameBoard = new GameBoard(playerArr[0], playerArr[1], playerArr[2], playerArr[3]);
        }
        scanner.close();
        Game.playGame(playerArr, gameBoard);
    }
}
