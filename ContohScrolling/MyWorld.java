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
        super(600, 400, 1,false);
        addObject(new Gbr(),300,200);
        addObject(new Label("",20),100,30);
        addObject(new Orang(),300,200);
        addObject(new Hotel(),1000,200);
        addObject(new Rumah(),200,1000);
        addObject(new Hotel(),2000,1000);
        addObject(new Rumah(),2000,1500);
        addObject(new Hotel(),2000,500);
        addObject(new Rumah(),500,2000);
        addObject(new Hotel(),1000,2000);
        addObject(new Rumah(),1500,2000);
    }
}
