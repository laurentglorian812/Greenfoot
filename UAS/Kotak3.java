import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kotak3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kotak3 extends Kotak
{
    /**
     * Act - do whatever the Kotak3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(System.currentTimeMillis() - lastTime > 5000)
        {
            lastTime = System.currentTimeMillis();
            getWorld().addObject(new Rintangan5(), getX(), 468);
        }
    }    
}
