import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Musuh extends Actor
{
    /**
     * Act - do whatever the Musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int langkah=8;
    public void act() 
    {
        // Add your action code here.
        move(langkah);
        if(isAtEdge())langkah*=-1;
    }      
}