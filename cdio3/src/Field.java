

abstract class Field {

    public final String name;
    public final int fieldNumber;
    public int price;

    public Field(String name, int fieldNumber) {
        this.name = name;
        this.fieldNumber = fieldNumber;
        this.price = 0;
    }

    public String getFieldColour() {
        return "";
    }

    abstract String getDescription();

    abstract int[] startFieldEvent();

}