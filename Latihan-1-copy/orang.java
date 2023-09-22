import greenfoot.*;

public class orang extends Actor
{
    public void act() {
        checkCollision();
    }
    
    private void checkCollision() {
       Actor plane = getOneIntersectingObject(plane.class);
        if (plane != null) {
            int planeX = plane.getX();
            int planeY = plane.getY();
            World world = getWorld(); // Simpan referensi dunia ke dalam variable lokal
            if (world != null) { // Periksa apakah dunia masih ada
                world.removeObject(this);
                world.addObject(new boom(), planeX, planeY);
            }
       }
    }
}
