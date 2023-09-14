import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     // Add your action code here.
     kejarCrab();
     if(cekBatu())
     {
      ancurinBatu();
      if(getWorld().getObjects(Batu.class).isEmpty());
     }
     if(checkmove(8,0)) move(4);else move(-4);
    }
    public void kejarCrab()
    {
     int x=((Crab)getWorld().getObjects(Crab.class).get(0)).getX();
     int y=((Crab)getWorld().getObjects(Crab.class).get(0)).getY();
     turnTowards(x,y);
     if(cekBatu(0,0))move(-1);else move(1);
    }
    public boolean cekBatu(int x, int y)
    {
     Actor Batu = getOneObjectAtOffset(x, y, Batu.class);
     if(Batu!=null) return(true); else return(false);
    }
    public void ancurinBatu()
    {
     Actor Batu = getOneObjectAtOffset(0,0,Batu.class);
     getWorld().removeObject(Batu);
    }
    public boolean cekBatu()
    {
     Actor Batu = getOneObjectAtOffset(0,0,Batu.class);
     return(Batu!=null);
    }
    public boolean checkmove(int x, int y)
    {
     Actor Penghalang;
     Penghalang=getOneObjectAtOffset(x, y, Penghalang.class);
     return(Penghalang==null);
    }
}

