import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penghalang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Penghalang extends Actor
{
    /**
     * Act - do whatever the Penghalang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    
    }   
    
   public Penghalang()
    {
       String nama[]={"car01-n.png","house-06.png","tent.png","tree3.png"};
           setImage(nama[Greenfoot.getRandomNumber(4)]);
    }
}
