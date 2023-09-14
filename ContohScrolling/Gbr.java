import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Gbr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gbr extends Actor
{
    GreenfootImage img=new GreenfootImage("img0_3840x2160.jpg");
    int x=0,y=0;
    double s=1;
    boolean h=false;
    int arah=-1;
    /**
     * Act - do whatever the Gbr wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage tmp=new GreenfootImage(600,400);
        tmp.clear();
        tmp.drawImage(img,-x,-y);
        setImage(tmp);
        if(Greenfoot.isKeyDown("left")) if(x>0)
        {
            x-=10;
            arah=1;
            List<Barang> brg=getWorld().getObjects(Barang.class);
            for(Barang b:brg)
            {
                b.setLocation(b.getX()+10,b.getY());
            }
        }
        if(Greenfoot.isKeyDown("right")) if(x<img.getWidth()-600)
        {
            x+=10;
            arah=2;
            List<Barang> brg=getWorld().getObjects(Barang.class);
            for(Barang b:brg)
            {
                b.setLocation(b.getX()-10,b.getY());
            }
        }
        if(Greenfoot.isKeyDown("up")) if(y>0)
        {
            y-=10;
            arah=3;
            List<Barang> brg=getWorld().getObjects(Barang.class);
            for(Barang b:brg)
            {
                b.setLocation(b.getX(),b.getY()+10);
            }
        }
        if(Greenfoot.isKeyDown("down")) if(y<img.getHeight()-400)
        {
            y+=10;
            arah=4;
            List<Barang> brg=getWorld().getObjects(Barang.class);
            for(Barang b:brg)
            {
                b.setLocation(b.getX(),b.getY()-10);
            }
        }
        if(Greenfoot.isKeyDown("escape")) Greenfoot.stop();
        if(!getWorld().getObjects(Label.class).isEmpty())
        ((Label)getWorld().getObjects(Label.class).get(0)).setValue(x+","+y+","+s);
        }    
}
