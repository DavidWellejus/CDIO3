package group2.cdio3;

class Property extends Field{
    private int price;
    private boolean isOwned = false;
    private String colour;
    private final Player Player;

    public Property(int price, boolean isOwned, String colour, Player Player, int fieldNumber, string name){
        this.price = price;
        this.colour = colour;
        this.player = player;
        super(name,fieldNumber);

    }

    public int buyProperty(){
        this.isOwned = true;
        //skal have hvem der ejer senere
        return this.price;
    }

    public int payRent(){
        return this.price;
    }

    public String getDescription(){
        return this.colour +" "+ this.name + " " + this.price;
    }

    public int startFieldEvent(){
        return 1;
    }


}
