import java.util.Scanner;

public class Game {

    public static void playGame(Player[] playerArr, GameBoard gameBoard) {
        boolean gameOnGoing = true;
        var scanner = new java.util.Scanner(System.in);
        while (gameOnGoing) {
            for (int i = 0; i < playerArr.length; i++) {
                System.out.println("\nIt is " + playerArr[i].figureName + "'s turn. You have "
                        + playerArr[i].account.getAccountBalance() + "$ in your account. Press enter to proceed.");
                scanner.nextLine();
                if (playerArr[i].IsInJail) {
                    Jail.getOutOfJail(playerArr[i]);
                    System.out.println("You paid 1€ to get out of jail, you rascal.");
                }

                int dieValue = RollCup.rollDie();
                System.out.println("You have rolled " + dieValue + ".");
                Field landOnField = gameBoard.movePlayerFigure(playerArr[i], dieValue);
                System.out.println("You have landed on " + landOnField.getDescription() + ".");
                int[] fieldOutCome = landOnField.startFieldEvent();
                if (fieldOutCome.length == 4) {
                    // Hardcodeed distance to jail value
                    gameBoard.movePlayerFigure(playerArr[i], 12);
                    playerArr[i].IsInJail = true;
                    System.out.println("You have gone to " + landOnField.getDescription() + "!");
                } else {
                    if (fieldOutCome[1] == 1) {
                        playerArr[i].account.subtractFromAccountBalance(fieldOutCome[0]);
                        gameBoard.setFieldOwner(landOnField.fieldNumber, playerArr[i]);
                        System.out.println(
                                "You have bougth  " + landOnField.name + " for " + fieldOutCome[0] + "$.");

                        if (gameBoard.sameOwner(playerArr[i])) {
                            System.out.println(
                                    "You now own both properties of the color " + landOnField.getFieldColour() + ".");
                        }

                        else {
                            System.out.println(
                                    "You now own one of the properties of color" + landOnField.getFieldColour() + ".");
                        }

                    }

                    else if (fieldOutCome[2] == 1) {
                        boolean doubleRent = false;
                        if (gameBoard.sameOwner(playerArr[i])) {
                            fieldOutCome[0] = fieldOutCome[0] * 2;
                            doubleRent = true;
                        }
                        playerArr[i].account.subtractFromAccountBalance(fieldOutCome[0]);
                        Player owner = gameBoard.getFieldOwner(landOnField.fieldNumber);
                        owner.account.addToAccountBalance(fieldOutCome[0]);
                        System.out.println("You have paid " + fieldOutCome[0] + "€ to " + owner.figureName + "!");
                        if (doubleRent) {
                            System.out.println("The rent was double due to " + owner.figureName
                                    + "owning both properties of the colour " + landOnField.getFieldColour() + ".");
                        }
                    }

                }

                if (playerArr[i].account.getAccountBalance() < 0) {
                    gameOnGoing = false;
                    System.out.println(playerArr[i].figureName + " is broke!");
                    i = 4;
                }
            }
        }
        scanner.close();
        Player winner = findWinner(playerArr, gameBoard);
        System.out.println(winner.figureName + " has won the game!");
    }

    private static Player findWinner(Player[] playerArr, GameBoard gameBoard) {
        boolean tied = false;
        int tiedAmount = 0;
        int highestAmount = 0;
        Player winner = null;
        Player currentWinner = playerArr[0];
        Player tiedOne = null;
        Player tiedTwo = null;
        for (int i = 0; i < playerArr.length; i++) {
            if (playerArr[i].account.getAccountBalance() > highestAmount) {
                highestAmount = playerArr[i].account.getAccountBalance();
                currentWinner = playerArr[i];
            }

            if (playerArr[i].account.getAccountBalance() == highestAmount && highestAmount != 0) {
                tied = true;
                if (tiedOne == null) {
                    tiedOne = playerArr[i];
                    tiedAmount = 2;
                }

                else {
                    tiedTwo = playerArr[i];
                    tiedAmount = 3;
                }
            }

        }
        if (!tied) {
            winner = currentWinner;
        }
        if (tied) {
            Player[] tiedPlayerArr = new Player[tiedAmount];
            tiedPlayerArr[0] = currentWinner;
            tiedPlayerArr[1] = tiedOne;
            if (tiedAmount == 3) {
                tiedPlayerArr[2] = tiedTwo;
            }
            for (int i = 0; i < gameBoard.fieldArray.length; i++) {
                Player owner = gameBoard.getFieldOwner(i);
                for (int j = 0; j < tiedPlayerArr.length; j++) {
                    if (tiedPlayerArr[j] == owner) {
                        tiedPlayerArr[j].account.addToAccountBalance(gameBoard.fieldArray[i].price);
                    }
                }
            }
            currentWinner = tiedPlayerArr[0];
            highestAmount = tiedPlayerArr[0].account.getAccountBalance();
            for (int i = 0; i < tiedPlayerArr.length; i++) {
                if (tiedPlayerArr[i].account.getAccountBalance() > highestAmount) {
                    currentWinner = tiedPlayerArr[i];
                    highestAmount = tiedPlayerArr[i].account.getAccountBalance();
                }
            }
            winner = currentWinner;
        }
        return winner;

    }
}
