import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    private int speed = 3;  // Set the speed of the player

    // Load the images for each direction
    private GreenfootImage imageUp = new GreenfootImage("image1x4.png");
    private GreenfootImage imageDown = new GreenfootImage("image1x1.png");
    private GreenfootImage imageLeft = new GreenfootImage("image1x2.png");
    private GreenfootImage imageRight = new GreenfootImage("image1x3.png");

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
