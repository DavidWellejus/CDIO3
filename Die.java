import java.util.Random;

class Die {
    
   public static final int sides = 6;

    public static int rollDie(){
        int roll = random.nextInt(sides) + 1;
        return roll;
    }
}