import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        boy boy = new boy();
        addObject(boy,72,435);
        boy.setLocation(70,438);
        girl girl = new girl();
        addObject(girl,299,459);
        girl.setLocation(302,446);

        boy.setLocation(82,421);
        girl.setLocation(315,439);
        girl.setLocation(300,459);

        girl.setLocation(298,427);

        Multiplayer1 multiplayer1 = new Multiplayer1();
        addObject(multiplayer1,89,265);
        multiplayer1.setLocation(208,264);

        multiplayer1.setLocation(210,285);
        Singleplayer singleplayer = new Singleplayer();
        addObject(singleplayer,100,549);
        singleplayer.setLocation(207,552);
    }
}
