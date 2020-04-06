import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class girl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class girl extends Actor
{
    /**
     * Act - do whatever the girl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public girl()
    {
     getImage().scale(getImage().getWidth()*2,getImage().getHeight()*2);//modificarea imaginii originale  
    }
    public void act() 
    {
        turn(-3);//rotirea cu 3 casute a obiectului in sensul opus acelor de ceasornic
    }    
}
