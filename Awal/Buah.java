import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buah extends Actor
{
    /**
     * Act - do whatever the Buah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int langkah=10;
    public void act() 
    {
        // Add your action code here.
        setRotation(90);
        move(langkah);
        if(isAtEdge())langkah*=-1;
                int X,Y;
        do{X=Greenfoot.getRandomNumber(600);}while(Math.abs(getX()-X)<10);
        do{Y=Greenfoot.getRandomNumber(400);}while(Math.abs(getY()-Y)<10);

    }    
}
