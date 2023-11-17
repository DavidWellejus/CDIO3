package group2.cdio3;

class Jail extends Field{
    public Jail(String name, int fieldNumber){
        super(name, fieldNumber);
    }

    @Override
    public String getDescription() {
        return "jail";
    }   
    
    @Override
    public int startFieldEvent(){
        return 0;
    }

    public static void getOutOfJail(Player player){
        if(player.hasGetOutOfJailCard == true){
            player.hasGetOutOfJailCard = false;
        }        

        else{
            player.account.subtractFromAccountBalance(1);
        }
    }

}