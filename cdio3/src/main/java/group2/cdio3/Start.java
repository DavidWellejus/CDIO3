package group2.cdio3;

class Start extends Field{

    public Start(String name, int fieldNumber) {
        
        super(name, fieldNumber);
    }

    @Override

    int startFieldEvent() {
        
        return 0;
    }

    @Override

    String getDescription() {

        return "START";
    }
}