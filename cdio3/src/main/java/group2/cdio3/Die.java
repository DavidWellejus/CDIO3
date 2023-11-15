package group2.cdio3;
class Die {
    
    public static final int sides = 6;
    
    public static int rollDie(){
        return (int) (Math.random() * (sides) +1);
    }
}