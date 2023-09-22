import greenfoot.*;
import java.util.Random;

public class MyWorld extends World {
    private Random random = new Random();
    
    public MyWorld() {
        super(1100, 650, 1);
        // ...
    }
    
    public void act() {
        if (random.nextInt(230) < 1) { // Munculkan "orang" dengan probabilitas 5%
            int randomX = random.nextInt(getWidth());
            int randomY = random.nextInt(getHeight());
            addObject(new orang(), randomX, randomY); //Tambahkan objek "orang" secara acak
        }
    }
}


    

