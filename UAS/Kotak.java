import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kotak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kotak extends Actor
{
    /**
     * Act - do whatever the Kotak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    long lastTime;
    public void act() 
    {
        // Add your action code here.
        if(System.currentTimeMillis() - lastTime > 4000)
        {
            lastTime = System.currentTimeMillis();
            getWorld().addObject(new Rintangan2(), getX(), 323);
        } 
    }    
}
