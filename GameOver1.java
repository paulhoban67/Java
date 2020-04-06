import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver1 extends World
{

    /**
     * Constructor for objects of class GameOver1.
     * 
     */
    public GameOver1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 800, 1); 
        prepare();
    }
    
    public void prepare()
    {
        gover1 gover1 = new gover1();
        addObject(gover1,255,373);
        gover1.setLocation(202,300);
        boy boy = new boy();
        addObject(boy,67,473);
        boy.setLocation(59,456);
        girl girl = new girl();
        addObject(girl,302,468);
        girl.setLocation(312,459);
        girl.setLocation(312,459);
        girl.setLocation(319,457);
        boy.setLocation(78,458);

        Gm gm = new Gm();
        addObject(gm,225,654);

        gm.setLocation(237,651);
        gm.setLocation(80,745);

        winnerGirl winnerGirl = new winnerGirl();
        addObject(winnerGirl,280,615);
        winnerGirl.setLocation(199,587);
    }

    public void act()
    {
     
        
    }
}
