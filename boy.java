import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class boy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class boy extends Actor
{
    /**
     * Act - do whatever the boy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boy()
    {
     getImage().scale(getImage().getWidth()*2,getImage().getHeight()*2); //micsorarea imaginii originale 
    }
    public void act() 
    {
        turn(-3);//actorul se roteste cu 3 casute in directia opusa acelor de ceasornic
    }    
}
