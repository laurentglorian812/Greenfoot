import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Setting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Setting extends Actor
{
    /**
     * Act - do whatever the Setting wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Setting1());
        }
    }    
}
