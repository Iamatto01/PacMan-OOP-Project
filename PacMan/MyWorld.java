import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int speed = 3;  // Set the speed of the player

    // Load the images for each direction
    private GreenfootImage imageUp;
    private GreenfootImage imageDown;
    private GreenfootImage imageLeft;
    private GreenfootImage imageRight;

    public Player()
    {
        imageUp = new GreenfootImage("image1x4.png");
        imageDown = new GreenfootImage("image1x1.png");
        imageLeft = new GreenfootImage("image1x2.png");
        imageRight = new GreenfootImage("image1x3.png");

        scaleImage(imageUp);
        scaleImage(imageDown);
        scaleImage(imageLeft);
        scaleImage(imageRight);

        setImage(imageUp);
    }

    private void scaleImage(GreenfootImage image)
    {
        int newWidth = image.getWidth() * 50 / 100;
        int newHeight = image.getHeight() * 50 / 100;
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
            setImage(imageRight);
        }
        if(Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX() - speed, getY());
            setImage(imageLeft);
        }
        if(Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY() + speed);
            setImage(imageDown);
        }
        if(Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY() - speed);
            setImage(imageUp);
        }
    }
}
