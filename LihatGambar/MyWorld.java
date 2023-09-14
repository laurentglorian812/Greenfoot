import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootImage gbr=new GreenfootImage("img0_3840x2160.jpg");
    int s=10;
    int x=0;
    int y=0;
    public static final int lb=600;
    public static final int pj=400;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(lb, pj, 1); 
        setBackground(gbr);
        addObject(new Label(" ",20),80,30);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")) if(x>0) x-=5;
        if(Greenfoot.isKeyDown("right")) if(x<gbr.getWidth()-lb)x+=s;
        if(Greenfoot.isKeyDown("up")) if(y>0) y-=s;
        if(Greenfoot.isKeyDown("down")) if(y<gbr.getHeight()-pj)y+=s;
        GreenfootImage tmp=new GreenfootImage(600,400);
        tmp.drawImage(gbr,-x,-y);
        setBackground(tmp);
        ((Label)getObjects(Label.class).get(0)).setValue(x+","+y+"-"+(x+600)+","+(y+400));
    }
}
