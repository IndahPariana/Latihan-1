import greenfoot.*; 
import java.util.Random; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plane extends Actor
{
    /**
     * Act - do whatever the plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
public plane() {
       GreenfootImage img = this.getImage();
       img.scale(160, 130);
       img.mirrorHorizontally();
       this.setImage(img);
   }
   private int speed = 6;
   private Random random = new Random();
   
   public void act() {
    if (random.nextInt(100) < 7) {
        // secara aacak pilih untukmengubah arah setiap beberapa langkah
        randomTurn();
    }
    move (speed);
    
    //cek apakah mobil berada dekat dengan tepilatar belakang
    if (isCloseToEdge()) {
        avoidWall(); //panggil metode untuk menghindari dinding
    }
}
 
    private boolean isCloseToEdge() {
        int edgeDistance = 20; // jarak dari tepi latar belakang untuk mulai menghindar
        int x = getX();
        int y = getY();
        int width = getWorld().getWidth();
        int height = getWorld().getHeight();
        
        return x <= edgeDistance || x >= width - edgeDistance || y <= edgeDistance || y >= height - edgeDistance;
    }
    
    private void avoidWall() {
        // Implementasi logika untuk menghindari dinding
        // misalnya, putar plane sekitar 90 derajat ke kiri
        turn(-90);
        move(speed);
    }
    
    private void randomTurn() {
        // putar plane secara acak antara -45 hingga 45 derajat
        int angle = random.nextInt(45) - 45;
        turn(angle);
    }
}
