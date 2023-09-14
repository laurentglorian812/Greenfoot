import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Isi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Isi extends Actor
{
    /**
     * Act - do whatever the Isi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int nilai=-1;
    public void act() 
    {
        // Add your action code here.
            if(Greenfoot.mouseClicked(this)){
            int xh=((Papan)getWorld()).x;
            int yh=((Papan)getWorld()).y;
            int xo=((Papan)getWorld()).xo;
            int yo=((Papan)getWorld()).yo;
            int j=((Papan)getWorld()).hitungjarak(xo,yo,xh,yh);
            int x=Greenfoot.getMouseInfo().getX()/16;
            int y=Greenfoot.getMouseInfo().getY()/16;
            int j2=((Papan)getWorld()).hitungjarak(x,y,xh,yh);
            if(nilai==0){ setImage("empty0.png");
                if(j2<j)
                JOptionPane.showMessageDialog(null, "Makin dekat");
                else
                JOptionPane.showMessageDialog(null, "Makin jauh");
                ((Papan)getWorld()).xo=x;
                ((Papan)getWorld()).yo=y;
    }    
    else{
        setImage("mine.png");
        JOptionPane.showMessageDialog(null, "dapat");
}
}
}
public void setnilai(int n){nilai=n;}
public int getnilai(){return(nilai);}
}
