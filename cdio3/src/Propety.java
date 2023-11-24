

class Property extends Field{
    private int price;
    private boolean isOwned = false;
    private String colour;
    private int buyFlag;
    private int rentFlag;


    public Property(String name, int fieldNumber, int price, String colour){
        super(name,fieldNumber);
        this.price = price;
        this.colour = colour;
       
        

    }
    public int getPrice(){
        return this.price;
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
        return "(colour: " + this.colour +", name: "+ this.name + ", price: " + this.price +")";
    }
    @Override
    public String getFieldColour(){
        return this.colour;
    }

    public int[] startFieldEvent(){
        buyFlag = 0;
        rentFlag = 0;
        if(this.isOwned == false){
            this.isOwned = true;
            buyFlag = 1;
        } 
        else{
            rentFlag = 1;
        }
        int[] array = new int[3];
        array[0] = this.price;
        array[1] = buyFlag;
        array[2] = rentFlag;

        return array;

    }


}
