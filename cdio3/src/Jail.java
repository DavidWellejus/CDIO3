

class Jail extends Field{
    private int[] sFEArray = new int[]{0,0,0};
    public Jail(String name, int fieldNumber){
        super(name, fieldNumber);
    }

    @Override
    public String getDescription() {
        return "jail";
    }   
    
    @Override
    public int[] startFieldEvent(){
        return sFEArray;
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