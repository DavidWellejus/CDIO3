

class Start extends Field{
    private int[] sFEArray = new int[]{0,0,0};
    public Start(String name, int fieldNumber) {
        
        super(name, fieldNumber);
    }

    @Override

    int [] startFieldEvent() {
        
        return sFEArray;
    }

    @Override

    String getDescription() {

        return "START";
    }
}