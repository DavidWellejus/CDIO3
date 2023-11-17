package group2.cdio3;

class Property extends Field{
    private int price;
    private boolean isOwned     = false;
    private String colour;
    private final Player Player;
    private int buyFlag         = 0;
    private int rentFlag        = 0;


    public Property(int price, boolean isOwned, String colour, Player player, int fieldNumber, String name){
        super(name,fieldNumber);
        this.price = price;
        this.colour = colour;
        this.player = player;
        

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

    public int[] startFieldEvent(){
        int[] array = new int[3];
        array[0] = this.price;
        array[1] = buyFlag;
        array[2] = rentFlag;

        return array;

    }


}
