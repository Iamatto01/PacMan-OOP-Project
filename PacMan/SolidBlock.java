import greenfoot.*;

public class SolidBlock extends Actor {
    public SolidBlock() {
        // Set the image for the solid block (you can replace this with your own image)
        setImage("Solid_Block.png");
         scaleImage(getImage());
         getImage().setTransparency(0);
    }

       private void scaleImage(GreenfootImage image) {
        int newWidth = image.getWidth() / 4;
        int newHeight = image.getHeight() / 4;
        image.scale(newWidth, newHeight);
    }
    
    public void act() {
        // Check for collisions with other actors (e.g., player)
       
    }
}
