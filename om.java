import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class people here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class om extends Actor
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
        if(onFinish()==true)//daca actorul atinge obiectul Finish
        {
            Greenfoot.setWorld(new GameOver());//se deschide lumea "GameOver"
            Greenfoot.playSound("star.wav");//se reda sunetul "star" din folderul Sounds
        }
        if(onOut()==true)//daca actorul se afla pe placuta Out
        {
            Greenfoot.setWorld(new GameOver1());//se deschide lumea "GameOver1"
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
     World myWorld=getWorld();//se creeaza o noua variabila
     MyWorld space =(MyWorld)myWorld;
     Counter counter=space.getCounter();//se apeleaza "getCounter"
     counter.addScore();//scorul creste cu 1
     Greenfoot.playSound("jump.wav");//se reda sunetul "jump" din folderul Sounds
    }
 if(onTulip()==true)//daca obiectul se afla pe lalea
 {
     World myWorld=getWorld();//se creeaza o noua variabila
     MyWorld space =(MyWorld)myWorld;
     Counter counter=space.getCounter();//se apeleaza "getCounter"
     counter.addScore1();//scorul creste cu 10
     Greenfoot.playSound("star.wav");//se reda sunetul "star" din folderul Sounds
    }
    if(onCactus()==true)//daca obiectul se afla pe cactus
 {
     World myWorld=getWorld();//se creeaza o noua variabila
     MyWorld space =(MyWorld)myWorld;
     Counter counter=space.getCounter();//se apeleaza "getCounter"
     counter.addScore2();//scorul scade cu 100
     Greenfoot.playSound("fail.wav");//se reda sunetul "fail" din folderul Sounds
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
boolean onFinish()//functie pentru determinarea pozitiei obiectului pe Finish
{
  Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2, finish.class);
 return under !=null;  
}
boolean onOut()//functie pentru determinarea pozitiei obiectului pe placuta Out
{
  Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2, out.class);
 return under !=null;  
}
boolean onTulip()//functie pentru determinarea pozitiei obiectului pe lalea
{
  Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2, Tulip.class);
 return under !=null;  
}
boolean onCactus()//functie pentru determinarea pozitiei obiectului pe cactus
{
  Actor under=getOneObjectAtOffset(0,getImage().getHeight()/2, Cactus.class);
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
     vSpeed=0;  //viteza este 0 
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
  
