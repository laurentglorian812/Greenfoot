import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1160, 630, 1);
        
        addObject(new Koin(),35,430);
        addObject(new Koin(),105,430);
        addObject(new Koin(),175,430);
        addObject(new Koin(),245,430);
        addObject(new Koin(),315,430);
        addObject(new Koin(),485,430);
        addObject(new Koin(),555,430);
        addObject(new Koin(),625,430);
        addObject(new Koin(),695,430);
        addObject(new Koin(),765,430);
        addObject(new Koin(),835,430);
        addObject(new Koin(),905,430);
        addObject(new Koin(),975,430);
        addObject(new Koin(),1045,430);
        addObject(new Koin(),1115,430);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),570);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),570);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),570);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),570);
        addObject(new Koin(),Greenfoot.getRandomNumber(1160),570);
        
        addObject(new Jalan1(),580,630);
        addObject(new Jalan1(),580,485);
        addObject(new Jalan1(),580,340);
        addObject(new Jalan1(),580,195);
        addObject(new Jalan2(),600,55);
        
        addObject(new Tangga2(),700,547);
        addObject(new Tangga2(),400,403);
        addObject(new Tangga2(),650,258);
        addObject(new Tangga2(),500,67);
        addObject(new Tangga(),1000,505);
        addObject(new Tangga(),900,215);
        addObject(new Tangga(),200,505);
        addObject(new Tangga(),100,360);
        addObject(new Tangga(),1100,360);
        addObject(new Tangga(),300,215);
        addObject(new Tangga(),700,75);
        addObject(new Tangga(),500,156);
        
        addObject(new Orang(),100,595);
        addObject(new Musuh(),200,145);
        addObject(new Putri(),600,25);
        
        addObject(new Jamur(),Greenfoot.getRandomNumber(1160),570);
        addObject(new Jamur(),Greenfoot.getRandomNumber(1160),570);
        addObject(new Jamur(),Greenfoot.getRandomNumber(1160),570);
        addObject(new Jamur(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Jamur(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Jamur(),Greenfoot.getRandomNumber(1160),290);
        
        addObject(new Anggur(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Pisang(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Apel(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Anggur(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Pisang(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Apel(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Anggur(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Pisang(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Apel(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Anggur(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Pisang(),Greenfoot.getRandomNumber(1160),290);
        addObject(new Apel(),Greenfoot.getRandomNumber(1160),290);
        
        addObject(new Kotak(),1142,318);
        addObject(new Kotak3(),7,463);
        addObject(new Kotak4(),1142,607);
    }
}
