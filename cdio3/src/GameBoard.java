

class GameBoard {

    public Field[] fieldArray;
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
        fieldArray[1] = new Property("Chum Bucket", 1, 1, "Brown");
        fieldArray[2] = new Property("Krusty Krab", 2, 1, "Brown");
        fieldArray[3] = new Parking("Parking", 3);
        fieldArray[4] = new Property("Frozen YOYO", 4, 1, "Grey");
        fieldArray[5] = new Property("Creapy Uncle's Crêpe", 5, 1, "Grey");
        fieldArray[6] = new Jail("Jail", 6);
        fieldArray[7] = new Property("Kinky Cinema", 7, 2, "Purple");
        fieldArray[8] = new Property("Colosseum", 8, 2, "Purple");
        fieldArray[9] = new Parking("Parking", 9);
        fieldArray[10] = new Property("Pole Dancing Studio", 10, 2, "Orange");
        fieldArray[11] = new Property("Ole's Party Tub Club", 11, 2, "Orange");
        fieldArray[12] = new Parking("Parking", 12);
        fieldArray[13] = new Property("Dahlgaard's Tivoli", 13, 3, "Red");
        fieldArray[14] = new Property("My Little Pony Experience", 14, 3, "Red");
        fieldArray[15] = new Parking("Parking", 15);
        fieldArray[16] = new Property("Asma's Corner Store", 16, 3, "Yellow");
        fieldArray[17] = new Property("Animal Farm", 17, 3, "Yellow");
        fieldArray[18] = new GoToJail("Go To Jail!", 18);
        fieldArray[19] = new Property("Bowling and Carpets inc.", 19, 4, "Green");
        fieldArray[20] = new Property("Lobotomy Clinic", 20, 4, "Green");
        fieldArray[21] = new Parking("Parking", 21);
        fieldArray[22] = new Property("Joe's Quick Suicide Clinic", 22, 5, "Blue");
        fieldArray[23] = new Property("Restaurant Cold Feet", 23, 5, "Blue");

        return fieldArray;
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
        return -1;
    }

    public Field movePlayerFigure(Player player, int dieValue){
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
        return fieldArray[endPosition];
    }

    public boolean sameOwner(Player player) {
        int field = getFieldNumber(player);
        Player owner = getFieldOwner(field);
        String fieldColour = fieldArray[field].getFieldColour();

        for(int i = 0; i < fieldArray.length; i++) {
            if(fieldArray[i].getFieldColour().equals(fieldColour) && i != field && getFieldOwner(i) == owner){
                return true;
            }
        }
        return false;
    }
}
