import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kotak4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kotak4 extends Kotak
{
    /**
     * Act - do whatever the Kotak4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(System.currentTimeMillis() - lastTime > 6000)
        {
            lastTime = System.currentTimeMillis();
            getWorld().addObject(new Rintangan6(), getX(), 582);
        }
    }    
}
