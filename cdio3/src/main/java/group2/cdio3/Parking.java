package group2.cdio3;

class Parking extends Field {
    Parking(String name, int fieldNumber){
        super(name,fieldNumber);
    }
   public int startFieldEvent(){
    return 0;
   }
   public String getDescription(){
    return "Free parking";
   }
}
