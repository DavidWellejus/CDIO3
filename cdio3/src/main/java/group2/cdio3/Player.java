package group2.cdio3;

public class Player {
    public final String figureName;
    public final Account account;
    public final char figureSymbol;
    public boolean hasGetOutOfJailCard  = false;
    public boolean IsInJail = false;
    
    public Player(String figureName, int amount, char symbol){
        this.figureName = figureName;
        this.account = new Account(amount);
        this.figureSymbol = symbol;   
    }

    
}
