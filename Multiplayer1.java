import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Multiplayer1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multiplayer1 extends Actor
{
    /**
     * Act - do whatever the Multiplayer1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public Multiplayer1()
    {
     getImage().scale(getImage().getWidth()/12,getImage().getHeight()/12); //micsorarea imaginii originale 
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))//daca apasam click pe imagine
       {
           Greenfoot.setWorld(new MyWorld());//se deschide lumea "MyWorld"
        }
    }    
}
