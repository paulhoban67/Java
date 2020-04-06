import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Singleplayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Singleplayer extends Actor
{
    /**
     * Act - do whatever the Singleplayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Singleplayer()
    {
     getImage().scale(getImage().getWidth()/13,getImage().getHeight()/13); //micsorarea imaginii originale 
    }
    public void act()
   {
       if(Greenfoot.mouseClicked(this))//daca apasam click pe imagine
       {
           Greenfoot.setWorld(new MyWorld1());//se deschide lumea "MyWorld1"
        }
    }
}
