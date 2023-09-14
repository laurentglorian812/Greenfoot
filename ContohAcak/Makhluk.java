import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Makhluk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Makhluk extends Actor
{
    /**
     * Act - do whatever the Makhluk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    public boolean cekitem2()
    {
        Actor a=getOneObjectAtOffset(0,0,Actor.class);
        return(a==null);
    }
    
    public boolean cekitem()
    {
        Actor a=getOneIntersectingObject(Actor.class);
        return(a==null);
    }
}
