import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tombol1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tombol1 extends Actor
{
    /**
     * Act - do whatever the Tombol1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            if(!getWorld().getObjects(Makhluk.class).isEmpty())
            getWorld().removeObjects(getWorld().getObjects(Makhluk.class));
            ((MyWorld)getWorld()).acak1();
        }
    }    
}
