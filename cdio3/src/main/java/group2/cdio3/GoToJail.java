package group2.cdio3;

class GoToJail extends Field {
   
    public GoToJail(String name, int fieldNumber){
        super(name, fieldNumber);
    }      
    int [] startFieldEvent() {
        int [] jailArray = new int[4];
        jailArray[0] = 0;
        jailArray[1] = 0;
        jailArray[2] = 0;
        jailArray[3] = 1;
        return jailArray;
    }    
    
    public String getDescription(){
        return "Go to jail";
    }
}