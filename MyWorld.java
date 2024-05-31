import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
       GreenfootImage background = new GreenfootImage("bg (Custom).png");
        setBackground(background);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();

        addObject(player,200,60);

        SolidBlock solidBlock = new SolidBlock();
        addObject(solidBlock,160,50);

        SolidBlock solidBlock2 = new SolidBlock();
        addObject(solidBlock2,160,80);

        SolidBlock solidBlock3 = new SolidBlock();
        addObject(solidBlock3,115,120);

        SolidBlock solidBlock4 = new SolidBlock();
        addObject(solidBlock4,115,160);

        SolidBlock solidBlock5 = new SolidBlock();
        addObject(solidBlock5,45,200);

        SolidBlock solidBlock6 = new SolidBlock();
        addObject(solidBlock6,45,240);

        SolidBlock solidBlock7 = new SolidBlock();
        addObject(solidBlock7,45,280);

        SolidBlock solidBlock8 = new SolidBlock();
        addObject(solidBlock8,45,320);

        SolidBlock solidBlock9 = new SolidBlock();
        addObject(solidBlock9,65,350);

        SolidBlock solidBlock10 = new SolidBlock();
        addObject(solidBlock10,135,370);

        SolidBlock solidBlock11 = new SolidBlock();
        addObject(solidBlock11,135,390);

        SolidBlock solidBlock12 = new SolidBlock();
        addObject(solidBlock12,135,250);

        SolidBlock solidBlock13 = new SolidBlock();
        addObject(solidBlock13,135,280);

        SolidBlock solidBlock14 = new SolidBlock();
        addObject(solidBlock14,120,50);

        SolidBlock solidBlock15 = new SolidBlock();
        addObject(solidBlock15,80,50);

        SolidBlock solidBlock16 = new SolidBlock();
        addObject(solidBlock16,40,50);

        SolidBlock solidBlock17 = new SolidBlock();
        addObject(solidBlock17,20,50);

        SolidBlock solidBlock18 = new SolidBlock();
        addObject(solidBlock18,80,160);

        SolidBlock solidBlock19 = new SolidBlock();
        addObject(solidBlock19,100,370);

        SolidBlock solidBlock20 = new SolidBlock();
        addObject(solidBlock20,210,250);

        SolidBlock solidBlock21 = new SolidBlock();
        addObject(solidBlock21,250,250);

        SolidBlock solidBlock22 = new SolidBlock();
        addObject(solidBlock22,170,250);

        SolidBlock solidBlock23 = new SolidBlock();
        addObject(solidBlock23,230,440);

        SolidBlock solidBlock24 = new SolidBlock();
        addObject(solidBlock24,270,440);

        SolidBlock solidBlock25 = new SolidBlock();
        addObject(solidBlock25,310,440);

        SolidBlock solidBlock26 = new SolidBlock();
        addObject(solidBlock26,340,360);

        SolidBlock solidBlock27 = new SolidBlock();
        addObject(solidBlock27,340,320);

        SolidBlock solidBlock28 = new SolidBlock();
        addObject(solidBlock28,340,280);

        SolidBlock solidBlock29 = new SolidBlock();
        addObject(solidBlock29,340,240);

        SolidBlock solidBlock30 = new SolidBlock();
        addObject(solidBlock30,340,200);

        SolidBlock solidBlock31 = new SolidBlock();
        addObject(solidBlock31,340,160);

        SolidBlock solidBlock32 = new SolidBlock();
        addObject(solidBlock32,340,120);

        SolidBlock solidBlock33 = new SolidBlock();
        addObject(solidBlock33,340,80);

        SolidBlock solidBlock34 = new SolidBlock();
        addObject(solidBlock34,340,50);

        SolidBlock solidBlock35 = new SolidBlock();
        addObject(solidBlock35,300,80);

        SolidBlock solidBlock36 = new SolidBlock();
        addObject(solidBlock36,260,80);

        SolidBlock solidBlock37 = new SolidBlock();
        addObject(solidBlock37,240,80);

        SolidBlock solidBlock38 = new SolidBlock();
        addObject(solidBlock38,240,50);

        SolidBlock solidBlock39 = new SolidBlock();
        addObject(solidBlock39,280,50);

        SolidBlock solidBlock40 = new SolidBlock();
        addObject(solidBlock40,320,50);

        SolidBlock solidBlock41 = new SolidBlock();
        addObject(solidBlock41,360,50);

        SolidBlock solidBlock42 = new SolidBlock();
        addObject(solidBlock42,400,50);

        SolidBlock solidBlock43 = new SolidBlock();
        addObject(solidBlock43,440,50);

        SolidBlock solidBlock44 = new SolidBlock();
        addObject(solidBlock44,480,50);

        SolidBlock solidBlock45 = new SolidBlock();
        addObject(solidBlock45,520,50);

        SolidBlock solidBlock46 = new SolidBlock();
        addObject(solidBlock46,560,50);

        SolidBlock solidBlock47 = new SolidBlock();
        addObject(solidBlock47,560,90);

        SolidBlock solidBlock48 = new SolidBlock();
        addObject(solidBlock48,520,90);

        SolidBlock solidBlock49 = new SolidBlock();
        addObject(solidBlock49,510,130);

        SolidBlock solidBlock50 = new SolidBlock();
        addObject(solidBlock50,510,160);

        SolidBlock solidBlock51 = new SolidBlock();
        addObject(solidBlock51,470,160);

        SolidBlock solidBlock52 = new SolidBlock();
        addObject(solidBlock52,440,200);

        SolidBlock solidBlock53 = new SolidBlock();
        addObject(solidBlock53,440,240);

        SolidBlock solidBlock54 = new SolidBlock();
        addObject(solidBlock54,440,280);

        SolidBlock solidBlock55 = new SolidBlock();
        addObject(solidBlock55,440,320);

        SolidBlock solidBlock56 = new SolidBlock();
        addObject(solidBlock56,460,350);

        SolidBlock solidBlock57 = new SolidBlock();
        addObject(solidBlock57,500,370);

        SolidBlock solidBlock58 = new SolidBlock();
        addObject(solidBlock58,530,370);

        SolidBlock solidBlock59 = new SolidBlock();
        addObject(solidBlock59,540,250);

        SolidBlock solidBlock60 = new SolidBlock();
        addObject(solidBlock60,540,280);

        SolidBlock solidBlock61 = new SolidBlock();
        addObject(solidBlock61,580,246);

        SmallSolidBlock smallSolidBlock = new SmallSolidBlock();
        addObject(smallSolidBlock,570,210);

        SmallSolidBlock smallSolidBlock2 = new SmallSolidBlock();
        addObject(smallSolidBlock2,480,230);

        SmallSolidBlock smallSolidBlock3 = new SmallSolidBlock();
        addObject(smallSolidBlock3,500,285);

        SmallSolidBlock smallSolidBlock4 = new SmallSolidBlock();
        addObject(smallSolidBlock4,170,210);

        SmallSolidBlock smallSolidBlock5 = new SmallSolidBlock();
        addObject(smallSolidBlock5,80,230);

        SmallSolidBlock smallSolidBlock6 = new SmallSolidBlock();
        addObject(smallSolidBlock6,100,285);

        
    }
}
