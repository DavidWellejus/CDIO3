package group2.cdio3;

public class Player {
    private String figureName;
    private Account account;
    private char figureSymbol;
    public boolean hasGetOutOfJailCard  = false;
    public boolean IsInJail = false;
    
    public Player(String figureName, int amount, char symbol){
        this.figureName = figureName;
        this.account = new Account(amount);
        this.figureSymbol = symbol;   
    }

    
}
