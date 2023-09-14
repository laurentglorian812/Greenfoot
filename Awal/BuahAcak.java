import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuahAcak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuahAcak extends Actor
{
    /**
     * Act - do whatever the BuahAcak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int langkah=10;
    public void act() 
    {
         //Add your action code here.
        setRotation(90);
       move(langkah);
        if(isAtEdge())langkah*=-1;
    }
    public BuahAcak()
    {
       String nama[]={"apple1.png","bananas.png","orange.png"};
           setImage(nama[Greenfoot.getRandomNumber(3)]);
    }
    
    
}
