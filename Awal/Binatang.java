import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Binatang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Binatang extends Actor
{
    /**
     * Act - do whatever the Binatang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        kejarOrang();
    }   
    
    public void kejarOrang()
    {
        int x=((Orang)getWorld().getObjects(Orang.class).get(0)).getX();
        int y=((Orang)getWorld().getObjects(Orang.class).get(0)).getY();
        turnTowards(x,y);
        if(cekBatu(0,0))move(-1);else move(1);
        if(cekPenghalang(0,0))move(-1);else move(1);
    }
    
    public boolean cekBatu(int x, int y)
    {
        Actor batu1 = getOneObjectAtOffset(x, y, batu.class);
        if(batu1!=null) return(true); else return(false);
    }
    
    public boolean cekPenghalang(int x, int y)
    {
        Actor Penghalang = getOneObjectAtOffset(x, y, Penghalang.class);
        if(Penghalang!=null) return(true); else return(false);
    }
    
    public void cekBinatang()
    {
       String nama[]={"bee.png","elephant.png","polar-bear.png"};
           setImage(nama[Greenfoot.getRandomNumber(3)]);
    }
    
    
    }    
