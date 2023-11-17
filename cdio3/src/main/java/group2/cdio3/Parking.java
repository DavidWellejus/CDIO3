    package group2.cdio3;

class Parking extends Field {
    private int[] sFEArray = new int[]{0,0,0};
    Parking(String name, int fieldNumber){
        super(name,fieldNumber);
    }
    int [] startFieldEvent() {
        
        return sFEArray;
   }
   public String getDescription(){
    return "Free parking";
   }
}
