package group2.cdio3;

abstract class Field {

    public final String name;
    public final int fieldNumber;

    public Field(String name, int fieldNumber) {
        this.name = name;
        this.fieldNumber = fieldNumber;
    }

    abstract String getDescription();

    abstract int[] startFieldEvent();

}