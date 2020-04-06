import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class people here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class people extends Actor
{
    private int vSpeed=0;//viteza=0
    private int acceleration=1;//acceleratia=1
    private int jumpHeight=-18; //saritura=18
    
    /**
     * Act - do whatever the people wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAround();//apelam subprogramul moveAround()
        checkFalling();//apelam subprogramul checkFalling()
        if(onFinish1()==true)//daca actorul atinge obiectul Finish1
        {
            Greenfoot.setWorld(new Level2());//se deschide lumea "Level2"
            Greenfoot.playSound("star.wav");//se reda sunetul "star" din folderul Sounds
        }
        if(onFinish2()==true)//daca actorul atinge obiectul Finish2
        {
            Greenfoot.setWorld(new Level3());//se deschide lumea "Level3"
            Greenfoot.playSound("star.wav");//se reda sunetul "star" din folderul Sounds
        }
        if(onFinish3()==true)//daca actorul atinge obiectul Finish3
        {
            Greenfoot.setWorld(new GameOver2());//se deschide lumea "GameOver2"
            Greenfoot.playSound("star.wav");//se reda sunetul "star" din folderul Sounds
        }
        if(onOut()==true)//daca actorul se afla pe placuta Out
        {
            Greenfoot.setWorld(new GameOver2());//se deschide lumea "GameOver2"
            Greenfoot.playSound("fail.wav");//se reda sunetul "fail" din folderul Sounds
        }
        if(onBombe()==true)//daca actorul se afla pe bomba
        {
            Greenfoot.setWorld(new GameOver2());//se deschide lumea "GameOver2"
            Greenfoot.playSound("fail.wav");//se reda sunetul "fail" din folderul Sounds
        }
    }
    private void fall()
    {
     setLocation(getX(), getY()+vSpeed);//locatia obiectului se schimba, astfel y va fi adunat la vSpeed
     vSpeed=vSpeed+acceleration;//Vspeed se modifica prin insumarea acceleratiei
    }
public void moveAround()
{
 if(Greenfoot.isKeyDown("right"))//daca apasam tasta "right"
 {
     move(2);//obiectul se deplaseaza in dreapta
    }
    if(Greenfoot.isKeyDown("left"))//daca apasam tasta "left"
    {
     move(-2);   //obiectul se deplaseaza in stanga
    }
    if(Greenfoot.isKeyDown("up")&&onGround()==true||Greenfoot.isKeyDown("up")&&onGround3()==true)//daca apasam tasta "up" si obiectul se afla pe placuta de joc
    {
     vSpeed=jumpHeight;//viteza primeste "saritura"
     fall();//se apeleaza functia "fall"
     Greenfoot.playSound("jump.wav");//se reda sunetul "jump" din folderul Sounds
    }
 
}
boolean onGround()//functie pentru determinarea pozitiei obiectului pe placuta de joc
{
 Actor under=getOneObjectAtOffset(0, getImage().getHeight()/2, ground.class);
 return under !=null;
}
boolean onGround3()//functie pentru determinarea pozitiei obiectului pe placuta de joc
{
 Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2, ground3.class);
 return under !=null;
}
boolean onFinish1()//functie pentru determinarea pozitiei obiectului pe Finish
{
  Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2, finish1.class);
 return under !=null;  
}
boolean onFinish2()//functie pentru determinarea pozitiei obiectului pe Finish
{
  Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2, finish2.class);
 return under !=null;  
}
boolean onFinish3()//functie pentru determinarea pozitiei obiectului pe Finish
{
  Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2, finish3.class);
 return under !=null;  
}
boolean onOut()//functie pentru determinarea pozitiei obiectului pe placuta Out
{
  Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2, out.class);
 return under !=null;  
}
boolean onBombe()//functie pentru determinarea pozitiei obiectului pe bomba
{
  Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2, bombe.class);
 return under !=null;  
}
public void checkFalling()
{
 if(onGround()==false)//daca obiectul nu se afla pe placuta de joc
 {
     fall();//se apeleaza functia "fall"
    }
    if(onGround()==true)//daca obiectul se afla pe placuta de joc
    {
     vSpeed=0;   //viteza este 0
    }
    if(onGround3()==false)//daca obiectul nu se afla pe placuta de joc
    {
     fall();   //se apeleaza functia "fall"
    }
    if(onGround3()==true)//daca obiectul se afla pe placuta de joc
   {
     vSpeed=0;  //viteza este 0
    }
    
    
}
}
  
