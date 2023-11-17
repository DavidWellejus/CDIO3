package group2.cdio3;

class Property extends Field{
    private int price;
    private boolean isOwned = false;
    private String colour;
    private Player player;
    private int buyFlag         = 0;
    private int rentFlag        = 0;


    public Property(String name, int fieldNumber, int price, String colour){
        super(name,fieldNumber);
        this.price = price;
        this.colour = colour;
       
        

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
