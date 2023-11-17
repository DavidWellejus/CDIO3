package group2.cdio3;

class GameBoard {

    private Field[] fieldArray;
    //private ChanceCard[] chanceCardArray;
    private Player[][] playerPosition;
    
    
    //Constructor for two players
    public GameBoard(Player player1, Player player2){
       
        playerPosition = new Player[24][3];
        playerPosition[0][1] = player1;
        playerPosition[0][2] = player2;
    }

    //Constructor for three players
    public GameBoard(Player player1, Player player2, Player player3){
        
        playerPosition = new Player[24][4];
        playerPosition[0][1] = player1;
        playerPosition[0][2] = player2;
        playerPosition[0][3] = player3;
    }

    //Constructor for four players
    public GameBoard(Player player1, Player player2, Player player3, Player player4){

        playerPosition = new Player[24][5];
        playerPosition[0][1] = player1;
        playerPosition[0][2] = player2;
        playerPosition[0][3] = player3;
        playerPosition[0][4] = player4;
    }
}