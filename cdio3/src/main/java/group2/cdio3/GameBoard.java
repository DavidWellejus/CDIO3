package group2.cdio3;

class GameBoard {

    private Field[] fieldArray;
    private ChanceCard[] chanceCardArray;
    private Player[][] playerPosition;
    private Player[] fieldOwner = new Player[24];
    
    
    //Constructor for two players
    public GameBoard(Player player1, Player player2){
       
        playerPosition = new Player[24][3];
        playerPosition[0][1] = player1;
        playerPosition[0][2] = player2;

        fieldArray = generateFieldArray();
    }

    //Constructor for three players
    public GameBoard(Player player1, Player player2, Player player3){
        
        playerPosition = new Player[24][4];
        playerPosition[0][1] = player1;
        playerPosition[0][2] = player2;
        playerPosition[0][3] = player3;

        fieldArray = generateFieldArray();
    }

    //Constructor for four players
    public GameBoard(Player player1, Player player2, Player player3, Player player4){

        playerPosition = new Player[24][5];
        playerPosition[0][1] = player1;
        playerPosition[0][2] = player2;
        playerPosition[0][3] = player3;
        playerPosition[0][4] = player4;

        fieldArray = generateFieldArray();
    }

    private static Field[] generateFieldArray(){

        Field[] fieldArray = new Field[24];
        
        fieldArray[0] = new Start("Start", 0);
        fieldArray[1] = new Property("Chum Bucket", 1);
        fieldArray[2] = new Property("Krusty Krab", 2);
        fieldArray[3] = new Chance("Chance", 3);
        fieldArray[4] = new Property("Frozen YOYO", 4);
        fieldArray[5] = new Property("Creapy Uncle's Crêpe", 5);
        fieldArray[6] = new Jail("Jail", 6);
        fieldArray[7] = new Property("Kinky Cinema",7);
        fieldArray[8] = new Property("Colosseum", 8);
        fieldArray[9] = new Chance("Chance", 9);
        fieldArray[10] = new Property("Pole Dancing Studio", 10);
        fieldArray[11] = new Property("Ole's Party Tub Club", 11);
        fieldArray[12] = new Parking("Parking", 12);
        fieldArray[13] = new Property("Dahlgaard's Tivoli", 13);
        fieldArray[14] = new Property("My Little Pony Experience", 14);
        fieldArray[15] = new Chance("Chance", 15);
        fieldArray[16] = new Property("Asma's Corner Store", 16);
        fieldArray[17] = new Property("Animal Farm", 17);
        fieldArray[18] = new GoToJail("Go To Jail!", 18);
        fieldArray[19] = new Property("Bowling and Carpets inc.", 19);
        fieldArray[20] = new Property("Lobotomy Clinic", 20);
        fieldArray[21] = new Chance("Chance", 21);
        fieldArray[22] = new Property("Joe's Quick Suicide Clinic", 22);
        fieldArray[23] = new Property("Restaurant Cold Feet", 23);
    }

    public Player getFieldOwner(int fieldNumber) {
        //We migth want to implement a NULL check
        return fieldOwner[fieldNumber];
    }

    public void setFieldOwner(int fieldNumber, Player player) {
        fieldOwner[fieldNumber] = player;
    }

    public int getFieldNumber(Player player) {
        for(int i = 0; i < playerPosition.length; i++) {
            for(int j = 0; j < playerPosition[i].length; j++){
                if(playerPosition[i][j] == player) {
                    return i;
                }
            }
        }
    }

    private void movePlayerFigure(Player player, int dieValue){
        int startPosition = getFieldNumber(player);
        int endPosition = 0;

        if(dieValue + startPosition > 23){

            endPosition = dieValue - (23 - startPosition) - 1;
        }
        else {
            endPosition = dieValue + startPosition;
        }

        for(int i = 0; i < playerPosition[startPosition].length; i++){
            if(playerPosition[startPosition][i] == player) {
                
                playerPosition[startPosition][i] = null;
                playerPosition[endPosition][i] = player;
            }
        }
        if(endPosition < startPosition) {
            player.account.addToAccountBalance(2);
        }
    }
}