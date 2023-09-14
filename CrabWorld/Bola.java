import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola extends Actor
{
    int timer=0;
    /**
     * Act - do whatever the Bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        timer++;
        acakBola();
    }    
    
    public void acakBola()
    {
        if((timer%30==0)&&((Crab)getWorld().getObjects(Crab.class).get(0)).peluru==0)
        {
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),Greenfoot.getRandomNumber(getWorld().getHeight()));
    }
    }
}
