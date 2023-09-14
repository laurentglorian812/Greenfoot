import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    int peluru=0;
    int Score=0;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    if (Greenfoot.isKeyDown("left"))
    {  turn(-3);}
    if (Greenfoot.isKeyDown("right"))
    {  turn(3);}
    if(checkmove(8,0)) move(4);else move(-4);
    cekLobster();
    cekMakanan();
    //if(cekWorm())
    {
     //makanWorm();
     //if(getWorld().getObjects(Worm.class).isEmpty());
    }
    }
    public void cekLobster()
    {
     Actor Lobster = getOneObjectAtOffset(0,0,Lobster.class);
     if (Lobster!=null){
      Greenfoot.stop();
      JOptionPane.showMessageDialog(null,"GAME OVER");
     }
    }
    public boolean checkmove(int x, int y)
    {
     Actor Penghalang;
     Penghalang=getOneObjectAtOffset(x, y, Penghalang.class);
     return(Penghalang==null);
    }
    public void ambilBola()
    {
        Actor cek=getOneObjectAtOffset(0,0,Bola.class);
        if(cek!=null){getWorld().removeObject(cek);peluru++;}
    }
    public void cekMakanan()
    {
        Actor m=getOneObjectAtOffset(0,0,Makanan.class);
        if(m!=null)
        {
           Score+=((Makanan)m).getnilai();
           ((Label)getWorld().getObjects(Label.class).get(0)).setValue("Score : "+Score);
           getWorld().removeObject(m);
        }
    }
    //public void makanWorm()
    {
     //Actor Worm = getOneObjectAtOffset(0,0,Worm.class);
     //getWorld().removeObject(Worm);
    }
    //public boolean cekWorm()
    {
     //Actor Worm = getOneObjectAtOffset(0,0,Worm.class);
     //return(Worm!=null);
    }
    }

