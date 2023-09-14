import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dunia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{

    /**
     * Constructor for objects of class Dunia.
     * 
     */
    public Dunia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Orang(),100,100);
        addObject(new Buah(),300,300);
        addObject(new Bunga(),200,200);
    }
}
