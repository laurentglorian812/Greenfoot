import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 600, 1);
        addObject(new Jalan1(),575,600);
        addObject(new Jalan1(),575,455);
        addObject(new Jalan1(),575,310);
        addObject(new Jalan1(),575,165);
        addObject(new Jalan2(),600,60);
        
        addObject(new Tangga2(),700,517);
        addObject(new Tangga2(),400,373);
        addObject(new Tangga2(),650,228);
        addObject(new Tangga2(),500,83);
        addObject(new Tangga(),1000,475);
        addObject(new Tangga(),200,475);
        addObject(new Tangga(),800,435);
        addObject(new Tangga(),100,330);
        addObject(new Tangga(),1100,330);
        addObject(new Tangga(),900,290);
        addObject(new Tangga(),300,185);
        addObject(new Tangga(),700,80);
        
        addObject(new Orang(),100,558);
        addObject(new Musuh(),200,105);
        addObject(new Putri(),600,25);
        
        addObject(new Jamur(),900,530);
        addObject(new Jamur(),200,240);
        
        addObject(new Anggur(),900,380);
        addObject(new Pisang(),400,100);
        
        addObject(new Kotak(),1142,288);
        addObject(new Kotak3(),7,433);
        addObject(new Kotak4(),1142,577);
        
        addObject(new Label("Live : ",25),1050, 50);
        ((Label)getObjects(Label.class).get(0)).setFillColor(Color.WHITE);
        addObject(new Label("Bonus : ",25),900, 50);
        ((Label)getObjects(Label.class).get(0)).setFillColor(Color.WHITE);
    }
    public void acakBuah()
    {
        int x,y;
        do
        {
           x=Greenfoot.getRandomNumber(getWidth());
           y=Greenfoot.getRandomNumber(getHeight());
        }while(!cekItem(x,y));
        addObject(new Buah(),x,y);
    }
    public boolean cekItem(int x,int y)
    {
        return(getObjectsAt(x,y,Actor.class).isEmpty());
    }
}
