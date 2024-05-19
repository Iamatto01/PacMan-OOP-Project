import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int speed = 2;  // Set the speed of the player

    // Load the images for each direction
    private GreenfootImage[] imageUp = new GreenfootImage[4];
    private GreenfootImage[] imageDown= new GreenfootImage[4];
    private GreenfootImage[] imageRight= new GreenfootImage[4];
    private GreenfootImage[] imageLeft= new GreenfootImage[4];
    private int currentImage = 0;

    public Player()
    {
        imageUp[0] = new GreenfootImage("image1x4.png");
        imageUp[1] = new GreenfootImage("image2x4.png");
        imageUp[2] = new GreenfootImage("image3x4.png");
        imageUp[3] = new GreenfootImage("image4x4.png");
        imageDown[0] = new GreenfootImage("image1x1.png");
        imageDown[1] = new GreenfootImage("image2x1.png");
        imageDown[2] = new GreenfootImage("image3x1.png");
        imageDown[3] = new GreenfootImage("image4x1.png");
        imageLeft[0] = new GreenfootImage("image1x2.png");
        imageLeft[1] = new GreenfootImage("image2x2.png");
        imageLeft[2] = new GreenfootImage("image3x2.png");
        imageLeft[3] = new GreenfootImage("image4x2.png");
        imageRight[0] = new GreenfootImage("image1x3.png");
        imageRight[1] = new GreenfootImage("image2x3.png");
        imageRight[2] = new GreenfootImage("image3x3.png");
        imageRight[3] = new GreenfootImage("image4x3.png");
               for (int i = 0; i < 4; i++) {
            imageUp[i] = new GreenfootImage("image" + (i + 1) + "x4.png");
            imageDown[i] = new GreenfootImage("image" + (i + 1) + "x1.png");
            imageLeft[i] = new GreenfootImage("image" + (i + 1) + "x2.png");
            imageRight[i] = new GreenfootImage("image" + (i + 1) + "x3.png");
            scaleImage(imageUp[i]);
            scaleImage(imageDown[i]);
            scaleImage(imageLeft[i]);
            scaleImage(imageRight[i]);
        }

             setImage(imageUp[currentImage]);
    
    }

    private void scaleImage(GreenfootImage image)
    {
        int newWidth = image.getWidth() *  35/ 100;
        int newHeight = image.getHeight() * 35 / 100;
        image.scale(newWidth, newHeight);
    }

    public void act() 
    {
        movePlayer();
    }    

    private void movePlayer()
    {
        if(Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX() + speed, getY());
            if(currentImage == 3)
            currentImage = 0 ;
            else 
            currentImage++;
            setImage(imageRight[currentImage]);
        }
        if(Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX() - speed, getY());
           if(currentImage == 3)
            currentImage = 0 ;
            else 
            currentImage++;
            setImage(imageLeft[currentImage]);
        }
        if(Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY() + speed);
            if(currentImage == 3)
            currentImage = 0 ;
            else 
            currentImage++;
            setImage(imageDown[currentImage]);
        }
        if(Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY() - speed);
            if(currentImage == 3)
            currentImage = 0 ;
            else 
            currentImage++;
            setImage(imageUp[currentImage]);
        }
    }
}
