import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
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
        ground ground = new ground();
        addObject(ground,364,719);
        ground.setLocation(374,723);
        ground ground2 = new ground();
        addObject(ground2,132,409);
        ground ground3 = new ground();
        addObject(ground3,175,557);
        ground ground4 = new ground();
        addObject(ground4,276,357);
        ground ground5 = new ground();
        addObject(ground5,226,512);
        ground ground6 = new ground();
        addObject(ground6,271,636);
        ground6.setLocation(308,667);
        ground3.setLocation(250,606);
        ground5.setLocation(177,658);
        ground2.setLocation(103,713);
        ground ground7 = new ground();
        addObject(ground7,98,613);
        ground7.setLocation(26,660);
        ground4.setLocation(31,577);
        ground ground8 = new ground();
        addObject(ground8,81,504);
        ground8.setLocation(81,504);
        ground ground9 = new ground();
        addObject(ground9,157,443);
        ground9.setLocation(147,442);
        ground3 ground32 = new ground3();
        addObject(ground32,230,363);
        ground32.setLocation(230,363);
        ground32.setLocation(223,243);
        ground32.setLocation(202,332);
        ground32.setLocation(216,360);
        ground32.setLocation(221,355);
        ground32.setLocation(227,344);
        ground32.setLocation(277,346);
        ground3 ground33 = new ground3();
        addObject(ground33,238,148);
        ground33.setLocation(242,147);
        ground ground10 = new ground();
        addObject(ground10,214,387);
        ground3 ground34 = new ground3();
        addObject(ground34,190,303);
        ground3 ground35 = new ground3();
        addObject(ground35,128,242);
        ground3 ground36 = new ground3();
        addObject(ground36,45,182);
        ground3 ground37 = new ground3();
        addObject(ground37,340,243);
        ground37.setLocation(329,269);
        ground3 ground38 = new ground3();
        addObject(ground38,328,194);
        ground38.setLocation(369,190);
        ground ground11 = new ground();
        addObject(ground11,31,59);
        ground11.setLocation(30,65);

        bombe bombe = new bombe();
        addObject(bombe,149,550);
        bombe bombe2 = new bombe();
        addObject(bombe2,327,211);
        bombe bombe3 = new bombe();
        addObject(bombe3,237,102);
        bombe bombe4 = new bombe();
        addObject(bombe4,281,533);
        bombe4.setLocation(307,511);
        bombe bombe5 = new bombe();
        addObject(bombe5,268,440);
        bombe bombe6 = new bombe();
        addObject(bombe6,220,698);
        bombe bombe7 = new bombe();
        addObject(bombe7,29,383);
        bombe bombe8 = new bombe();
        addObject(bombe8,363,155);
        bombe8.setLocation(370,168);
        bombe2.setLocation(329,235);
        bombe3.setLocation(252,124);
        bombe bombe9 = new bombe();
        addObject(bombe9,283,752);
        bombe9.setLocation(297,753);
        bombe bombe10 = new bombe();
        addObject(bombe10,31,255);
        bombe10.setLocation(33,255);
        bombe bombe11 = new bombe();
        addObject(bombe11,273,318);
        bombe11.setLocation(273,318);
        bombe11.setLocation(270,325);
        out out = new out();
        addObject(out,272,560);
        out.setLocation(283,794);
        out out2 = new out();
        addObject(out2,322,590);
        out2.setLocation(310,784);
        people people = new people();
        addObject(people,378,691);
        start start = new start();
        addObject(start,349,585);
        start.setLocation(368,758);
        removeObject(people);

        addObject(people,371,687);
        people.setLocation(374,692);
        finish2 finish2 = new finish2();
        addObject(finish2,272,226);
        finish2.setLocation(49,43);
        ground11.setLocation(11,78);
        ground11.setLocation(16,79);
        ground11.setLocation(31,88);
        ground2.setLocation(118,712);
        ground7.setLocation(62,657);
        ground4.setLocation(34,575);
        ground7.setLocation(75,647);
        ground4.setLocation(46,581);
        ground4.setLocation(35,577);
        ground7.setLocation(32,642);
        ground4.setLocation(58,581);
        ground7.setLocation(55,644);
        ground4.setLocation(43,574);
    }
}
