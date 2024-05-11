import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


 // @author (Muhammad Saifudin) 

public class MyWorld extends World
{


    public MyWorld()
    {    
    
        super(600, 400, 1); 
        GreenfootImage background = new GreenfootImage(getWidth(), getHeight());
        background.setColor(Color.GREEN);
        background.fill();
        setBackground(background);
        prepare();
    }
 
    private void prepare()
    {
        Player player = new Player();
        addObject(player,293,148);
    }
}
