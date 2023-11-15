class Die {
    
    public static final int sides = 6;
    
    public static int rollDie(){
        return (int (Math.random() * (sides - 1) + 1 ))
    }
}