import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rintangan2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rintangan2 extends Rintangan
{
    /**
     * Act - do whatever the Rintangan2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX()-6,getY());
        if(isAtEdge())
        {
          getWorld().removeObject(this);
        }
    }    
}
