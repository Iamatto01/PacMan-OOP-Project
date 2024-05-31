import greenfoot.*;

public class SmallSolidBlock extends Actor {
    public SmallSolidBlock() {
        // Set the image for the solid block (you can replace this with your own image)
        setImage("Solid_Block.png");
         scaleImage(getImage());
         getImage().setTransparency(0);
    }

       private void scaleImage(GreenfootImage image) {
        int newWidth = image.getWidth() / 8;
        int newHeight = image.getHeight() / 8;
        image.scale(newWidth, newHeight);
    }
    
    public void act() {
        // Check for collisions with other actors (e.g., player)
       
    }
}
